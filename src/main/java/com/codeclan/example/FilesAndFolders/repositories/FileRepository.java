package com.codeclan.example.FilesAndFolders.repositories;

import com.codeclan.example.FilesAndFolders.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
