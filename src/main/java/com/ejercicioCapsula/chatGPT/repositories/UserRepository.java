package com.ejercicioCapsula.chatGPT.repositories;
import com.ejercicioCapsula.chatGPT.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUser(String user);
    User findByRole(String role);

}

