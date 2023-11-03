package com.electiva2.grupo3.controller;

import com.electiva2.grupo3.entity.Solicitud;
import com.electiva2.grupo3.servicio.SolicitudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/solicitudes")
public class SolicitudController {

    @Autowired
    private SolicitudService solicitudService;

    @GetMapping
    public List<Solicitud> getAllSolicitudes() {
        return solicitudService.getAllSolicitudes();
    }

    @GetMapping("/{id}")
    public Solicitud getSolicitudById(@PathVariable Long id) {
        return solicitudService.getSolicitudById(id);
    }

    @PostMapping
    public Solicitud createSolicitud(@RequestBody Solicitud solicitud) {
        return solicitudService.createSolicitud(solicitud);
    }

    @PutMapping("/{id}")
    public Solicitud updateSolicitud(@PathVariable Long id, @RequestBody Solicitud solicitud) {
        return solicitudService.updateSolicitud(id, solicitud);
    }

    @DeleteMapping("/{id}")
    public void deleteSolicitud(@PathVariable Long id) {
        solicitudService.deleteSolicitud(id);
    }
}
