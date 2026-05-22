package org.concertcion.api.eventos.evento;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EventoController {

    @Autowired
    private EventoRepository eventoRepository;

    @PostMapping(
        value = "/api/evento",
        consumes = "application/json",
        produces = "application/json"
    )
    public Object handleInsertEventoRequest(@RequestBody Evento evento) {
        return eventoRepository.save(evento);
    }

    @GetMapping(
        value = "/api/eventos",
        produces = "application/json"
    )
    public List<Evento> handleGetEventosRequest() {
        return eventoRepository.findAll();
    }
}
