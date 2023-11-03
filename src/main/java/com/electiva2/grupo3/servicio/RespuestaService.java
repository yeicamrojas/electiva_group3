package com.electiva2.grupo3.servicio;

import com.electiva2.grupo3.entity.Respuesta;

import java.util.List;

public interface RespuestaService {
    List<Respuesta> getAllRespuestas();
    Respuesta getRespuestaById(Long id);
    Respuesta createRespuesta(Respuesta respuesta);
    Respuesta updateRespuesta(Long id, Respuesta respuesta);
    void deleteRespuesta(Long id);
}
