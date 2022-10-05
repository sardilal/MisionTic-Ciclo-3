package com.ticenvios.ticenvios.backend.repositories;

import com.ticenvios.ticenvios.backend.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Integer> {
    

}
