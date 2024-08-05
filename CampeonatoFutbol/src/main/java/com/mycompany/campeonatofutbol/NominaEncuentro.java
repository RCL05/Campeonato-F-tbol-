package com.mycompany.campeonatofutbol;

import java.util.List;

public class NominaEncuentro {
    private Encuentro encuentro;
    private List<Jugador> jugadores;

    public NominaEncuentro(Encuentro encuentro, List<Jugador> jugadores) {
        this.encuentro = encuentro;
        this.jugadores = jugadores;
    }

    // Getters y setters
    public Encuentro getEncuentro() {
        return encuentro;
    }

    public void setEncuentro(Encuentro encuentro) {
        this.encuentro = encuentro;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}

