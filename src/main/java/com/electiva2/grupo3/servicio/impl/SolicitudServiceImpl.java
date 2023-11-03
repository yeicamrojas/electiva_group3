package com.electiva2.grupo3.servicio.impl;

import com.electiva2.grupo3.entity.Solicitud;
import com.electiva2.grupo3.repository.SolicitudRepository;
import com.electiva2.grupo3.servicio.SolicitudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SolicitudServiceImpl implements SolicitudService {

    @Autowired
    private SolicitudRepository solicitudRepository;

    @Override
    public List<Solicitud> getAllSolicitudes() {
        return solicitudRepository.findAll();
    }

    @Override
    public Solicitud getSolicitudById(Long id) {
        return solicitudRepository.findById(id).orElse(null);
    }

    @Override
    public Solicitud createSolicitud(Solicitud solicitud) {
        return solicitudRepository.save(solicitud);
    }

    @Override
    public Solicitud updateSolicitud(Long id, Solicitud solicitud) {
        solicitud.setId(id);
        return solicitudRepository.save(solicitud);
    }

    @Override
    public void deleteSolicitud(Long id) {
        solicitudRepository.deleteById(id);
    }
}
