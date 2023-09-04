package com.example.ntsdesigntest.service;

import com.example.ntsdesigntest.dto.FileInfoResponse;
import com.example.ntsdesigntest.entity.AudioFile;
import com.example.ntsdesigntest.repository.AudioFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;

@Service
public class InfoService {
    @Autowired
    private AudioFileRepository audioFileRepository;
    public FileInfoResponse getFileInfoByName(String fileName)  {
        AudioFile audioFile = audioFileRepository.findAudioFileByFileName(fileName);
        if(audioFile != null){
            return new FileInfoResponse(
                    audioFile.getFileName(),
                    audioFile.getFileDate(),
                    audioFile.getFilePath()
                    );
        }else {
            try {
                throw new FileNotFoundException("file not found " + fileName);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }

        }
    }

}
