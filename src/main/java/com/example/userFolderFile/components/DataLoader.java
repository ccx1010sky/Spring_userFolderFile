package com.example.userFolderFile.components;


import com.example.userFolderFile.models.File;
import com.example.userFolderFile.models.Folder;
import com.example.userFolderFile.models.User;
import com.example.userFolderFile.repository.FileRepository;
import com.example.userFolderFile.repository.FolderRepository;
import com.example.userFolderFile.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        User user1 = new User("Jackie");
        userRepository.save(user1);
        User user2 = new User("Mick");
        userRepository.save(user2);


        Folder folder1 = new Folder("tech",user1);
        folderRepository.save(folder1);
        Folder folder2 = new Folder("food",user2);
        folderRepository.save(folder2);


        File file1 = new File("apple","txt",50,folder1);
        fileRepository.save(file1);
        File file2 = new File("banana","ppt",100,folder2);
        fileRepository.save(file2);



    }
}
