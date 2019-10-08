package com.codeclan.example.FilesAndFolders.repositories;

import com.codeclan.example.FilesAndFolders.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
