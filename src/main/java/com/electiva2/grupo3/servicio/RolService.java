package com.electiva2.grupo3.servicio;

import com.electiva2.grupo3.entity.Rol;

import java.util.List;

public interface RolService {
    List<Rol> getAllRoles();
    Rol getRolById(Long id);
    Rol createRol(Rol rol);
    Rol updateRol(Long id, Rol rol);
    void deleteRol(Long id);
}
