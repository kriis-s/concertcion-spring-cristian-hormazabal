package org.concertcion.api.eventos;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public Map<String, Object> home() {
        return Map.of(
            "name", "API Eventos",
            "status", "OK",
            "endpoints", new String[] { "/api/eventos", "/api/evento" }
        );
    }
}
