package com.example.ntsdesigntest.controller;

import com.example.ntsdesigntest.service.AudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequestMapping("/api/audio")
public class AudioController {
    @Autowired
    private AudioService audioService;

    @PostMapping(value = "/upload",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String uploadFile(@RequestParam("file")MultipartFile file){
        return audioService.uploadFile(file);
    }
}
