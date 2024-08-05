package com.mycompany.campeonatofutbol;

import java.util.Date;

public class InscripcionDeEquipo {
    private Equipo equipo;
    private Date fechaInscripcion;

    public InscripcionDeEquipo(Equipo equipo, Date fechaInscripcion) {
        this.equipo = equipo;
        this.fechaInscripcion = fechaInscripcion;
    }

    // Getters y setters
    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Date getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(Date fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }
}
