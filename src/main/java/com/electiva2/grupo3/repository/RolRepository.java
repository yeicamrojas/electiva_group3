package com.electiva2.grupo3.repository;

import com.electiva2.grupo3.entity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {
    // You can add custom queries if needed
}
