package com.electiva2.grupo3.controller;

import com.electiva2.grupo3.entity.Respuesta;
import com.electiva2.grupo3.servicio.RespuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/respuestas")
public class RespuestaController {

    @Autowired
    private RespuestaService respuestaService;

    @GetMapping
    public List<Respuesta> getAllRespuestas() {
        return respuestaService.getAllRespuestas();
    }

    @GetMapping("/{id}")
    public Respuesta getRespuestaById(@PathVariable Long id) {
        return respuestaService.getRespuestaById(id);
    }

    @PostMapping
    public Respuesta createRespuesta(@RequestBody Respuesta respuesta) {
        return respuestaService.createRespuesta(respuesta);
    }

    @PutMapping("/{id}")
    public Respuesta updateRespuesta(@PathVariable Long id, @RequestBody Respuesta respuesta) {
        return respuestaService.updateRespuesta(id, respuesta);
    }

    @DeleteMapping("/{id}")
    public void deleteRespuesta(@PathVariable Long id) {
        respuestaService.deleteRespuesta(id);
    }
}
