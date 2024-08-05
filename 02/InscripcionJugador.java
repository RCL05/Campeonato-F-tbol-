package com.mycompany.campeonatofutbol;

import java.util.Date;

public class InscripcionJugador {
    private Jugador jugador;
    private Equipo equipo;
    private Date fechaInscripcion;

    public InscripcionJugador(Jugador jugador, Equipo equipo, Date fechaInscripcion) {
        this.jugador = jugador;
        this.equipo = equipo;
        this.fechaInscripcion = fechaInscripcion;
    }

    // Getters y setters
    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

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
