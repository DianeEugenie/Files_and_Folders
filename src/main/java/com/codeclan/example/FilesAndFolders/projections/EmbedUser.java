package com.codeclan.example.FilesAndFolders.projections;

import com.codeclan.example.FilesAndFolders.models.Folder;
import com.codeclan.example.FilesAndFolders.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedUser", types = User.class)
public interface EmbedUser {

    Long getId();
    String getName();
    List<Folder> getFolders();

}
