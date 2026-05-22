package org.concertcion.api.eventos.evento;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "eventos")
public class Evento {

    @Id
    public String objectId;

    public String nombreEvento;
    public String fechaHoraEvento;
    public String direccion;
    public String representante;
    public Integer precio;
    public Integer cantidadMaxAsistentes;
    public List<String> auspiciadores;
}