package com.example.ntsdesigntest.repository;

import com.example.ntsdesigntest.entity.AudioFile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AudioFileRepository extends JpaRepository<AudioFile, Long> {
    public AudioFile findAudioFileByFileName(String fileName);
}
