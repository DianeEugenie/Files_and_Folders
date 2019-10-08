package com.codeclan.example.FilesAndFolders.projections;

import com.codeclan.example.FilesAndFolders.models.File;
import com.codeclan.example.FilesAndFolders.models.Folder;
import com.codeclan.example.FilesAndFolders.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedFolder", types = Folder.class)
public interface EmbedFolder {

    Long getId();
    String getTitle();
    List<File> getFiles();
    User getUser();
}


