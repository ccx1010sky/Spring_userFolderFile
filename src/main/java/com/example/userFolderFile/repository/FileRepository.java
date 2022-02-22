package com.example.userFolderFile.repository;

import com.example.userFolderFile.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository <File, Long> {
}
