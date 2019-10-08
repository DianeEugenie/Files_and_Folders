package com.codeclan.example.FilesAndFolders.projections;


import com.codeclan.example.FilesAndFolders.models.File;
import com.codeclan.example.FilesAndFolders.models.Folder;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedFile", types = File.class)
public interface EmbedFile {

    Long getId();
    String getName();
    String getExtension();
    double getSize();
    Folder getFolder();

}
