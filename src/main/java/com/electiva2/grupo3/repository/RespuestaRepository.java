package com.electiva2.grupo3.repository;

import com.electiva2.grupo3.entity.Respuesta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RespuestaRepository extends JpaRepository<Respuesta, Long> {
    // You can add custom queries if needed
}
