package com.server.app.laboratoriouno.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Bow {

    private String nombre;
    private String virusBase;
    private int nivelPeligro;
    private String puntoDebil;
    private String estado;
    private String ubicacion;
    private String aulaOrigen;
}