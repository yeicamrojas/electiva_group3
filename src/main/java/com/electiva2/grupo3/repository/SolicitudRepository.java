package com.electiva2.grupo3.repository;

import com.electiva2.grupo3.entity.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolicitudRepository extends JpaRepository<Solicitud, Long> {
    // You can add custom queries if needed
}
