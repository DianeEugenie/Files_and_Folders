package com.codeclan.example.FilesAndFolders.repositories;

import com.codeclan.example.FilesAndFolders.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
