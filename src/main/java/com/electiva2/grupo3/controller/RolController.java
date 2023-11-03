package com.electiva2.grupo3.controller;

import com.electiva2.grupo3.entity.Rol;
import com.electiva2.grupo3.servicio.RolService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("rol")
public class RolController {
    @PersistenceContext
    private EntityManager em;
    @Autowired
    private RolService rolService;

    @GetMapping
    public List<Rol> getAllRoles() {
        return rolService.getAllRoles();
    }

    @GetMapping("/{id}")
    public Rol getRolById(@PathVariable Long id) {
        return rolService.getRolById(id);
    }

    @PostMapping
    public Rol createRol(@RequestBody Rol rol) {
        Query query = em.createNamedQuery("Rol.findByDescripcion");
        query.setParameter("descripcion", rol.getDescripcion());

        if (query.getResultList().isEmpty()) {
            return rolService.createRol(rol);
        } else {
            throw new ResponseStatusException(HttpStatus.ALREADY_REPORTED, "Role with the same description already exists.");
        }
    }


    @PutMapping("/{id}")
    public Rol updateRol(@PathVariable Long id, @RequestBody Rol rol) {
        return rolService.updateRol(id, rol);
    }

    @DeleteMapping("/{id}")
    public void deleteRol(@PathVariable Long id) {
        rolService.deleteRol(id);
    }
}
