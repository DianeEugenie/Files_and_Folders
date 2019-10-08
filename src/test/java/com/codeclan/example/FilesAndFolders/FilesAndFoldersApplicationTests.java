package com.codeclan.example.FilesAndFolders;

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
	public void canSaveUserFolderFile(){
		User user = new User("Jazz McJazzy");
		userRepository.save(user);

		Folder folder = new Folder("Jazzy Things", user);
		folderRepository.save(folder);

		File file = new File("All that jazz", "mp3", 55.5, folder);
	}

}
