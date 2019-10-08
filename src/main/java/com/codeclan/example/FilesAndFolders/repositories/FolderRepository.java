package com.codeclan.example.FilesAndFolders.repositories;

import com.codeclan.example.FilesAndFolders.models.Folder;
import com.codeclan.example.FilesAndFolders.projections.EmbedFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
// import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = EmbedFolder.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
