package com.ejercicioCapsula.chatGPT.repositories;

import com.ejercicioCapsula.chatGPT.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByRole(String role);
}

