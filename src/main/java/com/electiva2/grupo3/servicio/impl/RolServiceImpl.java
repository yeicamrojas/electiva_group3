package com.electiva2.grupo3.servicio.impl;

import com.electiva2.grupo3.entity.Rol;
import com.electiva2.grupo3.repository.RolRepository;
import com.electiva2.grupo3.servicio.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolServiceImpl implements RolService {

    @Autowired
    private RolRepository rolRepository;

    @Override
    public List<Rol> getAllRoles() {
        return rolRepository.findAll();
    }

    @Override
    public Rol getRolById(Long id) {
        return rolRepository.findById(id).orElse(null);
    }

    @Override
    public Rol createRol(Rol rol) {
        return rolRepository.save(rol);
    }

    @Override
    public Rol updateRol(Long id, Rol rol) {
        rol.setId(id);
        return rolRepository.save(rol);
    }

    @Override
    public void deleteRol(Long id) {
        rolRepository.deleteById(id);
    }
}
