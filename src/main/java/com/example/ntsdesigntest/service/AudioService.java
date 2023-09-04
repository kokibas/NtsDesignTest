package com.example.ntsdesigntest.service;

import com.example.ntsdesigntest.entity.AudioFile;
import com.example.ntsdesigntest.repository.AudioFileRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class AudioService {
    @Autowired
    private AudioFileRepository audioFileRepository;
    @Transactional
    public String uploadFile(MultipartFile file){
        if (file.isEmpty()){
            return "file not foumd";
        }
        try {
            String originalFilename = file.getOriginalFilename();
            String[] parts = originalFilename.split("_");
            if (parts.length != 2){
                return "format incorrect";
            }
            String dataString = parts[0];
            String timeString = parts[1].split("\\.")[0];

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddMMyyyy_HHmmss");
            Date fileDate = simpleDateFormat.parse(dataString + "_" + timeString);

            AudioFile audioFile = new AudioFile();
            audioFile.setFileName(originalFilename);
            audioFile.setFileDate(fileDate);
            audioFile.setFilePath("C:\\Users\\nurym\\OneDrive\\Рабочий стол\\NTS Design TEST\\" + originalFilename);

            audioFileRepository.save(audioFile);

            return "file uploaded successfully";


        }catch ( ParseException exception){
            exception.printStackTrace();
            return "error uploading";
        }
    }

}
