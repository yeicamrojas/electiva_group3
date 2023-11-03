package com.electiva2.grupo3.servicio.impl;

import com.electiva2.grupo3.entity.Respuesta;
import com.electiva2.grupo3.repository.RespuestaRepository;
import com.electiva2.grupo3.servicio.RespuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RespuestaServiceImpl implements RespuestaService {

    @Autowired
    private RespuestaRepository respuestaRepository;

    @Override
    public List<Respuesta> getAllRespuestas() {
        return respuestaRepository.findAll();
    }

    @Override
    public Respuesta getRespuestaById(Long id) {
        return respuestaRepository.findById(id).orElse(null);
    }

    @Override
    public Respuesta createRespuesta(Respuesta respuesta) {
        return respuestaRepository.save(respuesta);
    }

    @Override
    public Respuesta updateRespuesta(Long id, Respuesta respuesta) {
        respuesta.setId(id);
        return respuestaRepository.save(respuesta);
    }

    @Override
    public void deleteRespuesta(Long id) {
        respuestaRepository.deleteById(id);
    }
}
