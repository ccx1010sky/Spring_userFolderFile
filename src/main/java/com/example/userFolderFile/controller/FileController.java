package com.example.userFolderFile.controller;

import com.example.userFolderFile.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileController {
    @Autowired
    FileRepository fileRepository;


}
