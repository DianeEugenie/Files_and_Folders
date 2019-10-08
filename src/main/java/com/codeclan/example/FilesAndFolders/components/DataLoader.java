package com.codeclan.example.FilesAndFolders.components;

import com.codeclan.example.FilesAndFolders.models.File;
import com.codeclan.example.FilesAndFolders.models.Folder;
import com.codeclan.example.FilesAndFolders.models.User;
import com.codeclan.example.FilesAndFolders.repositories.FileRepository;
import com.codeclan.example.FilesAndFolders.repositories.FolderRepository;
import com.codeclan.example.FilesAndFolders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;


    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        User user = new User("Jazz McJazzy");
        userRepository.save(user);

        Folder folder = new Folder("Jazzy Things", user);
        folderRepository.save(folder);

        Folder folder2 = new Folder("Pop Things", user);
        folderRepository.save(folder2);

        File file = new File("All that jazz", "mp3", 55.5, folder);
        fileRepository.save(file);


    }
}
