package com.example.userFolderFile;

import com.example.userFolderFile.models.File;
import com.example.userFolderFile.models.Folder;
import com.example.userFolderFile.models.User;
import com.example.userFolderFile.repository.FileRepository;
import com.example.userFolderFile.repository.FolderRepository;
import com.example.userFolderFile.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class UserFolderFileApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createUserAndFolderThenSave(){
		User user1 = new User("Jackie");
		userRepository.save(user1);
		Folder folder1 = new Folder("tech",user1);
		folderRepository.save(folder1);
	}

	@Test
	public void createUserFolderAndFileThenSave(){
		User user2 = new User("Mick");
		userRepository.save(user2);

		Folder folder2 = new Folder("food",user2);
		folderRepository.save(folder2);

		File file2 = new File("banana","ppt",100,folder2);
		fileRepository.save(file2);
	}

}
