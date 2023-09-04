package com.example.ntsdesigntest.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class AudioFile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "file_name")
    private String fileName;
    @Column(name = "file_date")
    private Date fileDate;
    @Column(name = "file_path")
    private String filePath;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Date getFileDate() {
        return fileDate;
    }

    public void setFileDate(Date fileDate) {
        this.fileDate = fileDate;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
