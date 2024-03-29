package com.codeclan.example.FilesAndFolders;

//import com.codeclan.example.FilesAndFolders.models.File;
//import com.codeclan.example.FilesAndFolders.models.Folder;
import com.codeclan.example.FilesAndFolders.models.Folder;
import com.codeclan.example.FilesAndFolders.models.User;
import com.codeclan.example.FilesAndFolders.repositories.FileRepository;
import com.codeclan.example.FilesAndFolders.repositories.FolderRepository;
import com.codeclan.example.FilesAndFolders.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilesAndFoldersApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canCreateUser(){
		User user = new User("Billy");
		userRepository.save(user);
	}

	@Test
	public void canCreateFolder(){
		User user = new User("Billy");
		userRepository.save(user);

		Folder folder = new Folder("Billy's Folder", user);
		folderRepository.save(folder);
	}

}
