package com.electiva2.grupo3.servicio;

import com.electiva2.grupo3.entity.Solicitud;

import java.util.List;

public interface SolicitudService {
    List<Solicitud> getAllSolicitudes();
    Solicitud getSolicitudById(Long id);
    Solicitud createSolicitud(Solicitud solicitud);
    Solicitud updateSolicitud(Long id, Solicitud solicitud);
    void deleteSolicitud(Long id);
}
