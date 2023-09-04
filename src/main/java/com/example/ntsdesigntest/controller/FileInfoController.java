package com.example.ntsdesigntest.controller;

import com.example.ntsdesigntest.dto.FileInfoResponse;
import com.example.ntsdesigntest.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

@RestController
@RequestMapping("/api")
public class FileInfoController {
    @Autowired
    private InfoService infoService;
    @GetMapping("/file-info")
    public FileInfoResponse getFileInfo(@RequestParam String fileName)  {
        FileInfoResponse fileInfoResponse = infoService.getFileInfoByName(fileName);
        return fileInfoResponse;
    }

}
