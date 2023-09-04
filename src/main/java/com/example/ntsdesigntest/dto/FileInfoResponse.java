package com.example.ntsdesigntest.dto;

import java.util.Date;

public class FileInfoResponse {
    private String fileName;
    private Date fileDate;
    private String filePath;

    public FileInfoResponse(String fileName, Date fileDate, String filePath) {
        this.fileName = fileName;
        this.fileDate = fileDate;
        this.filePath = filePath;
    }

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
