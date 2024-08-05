package com.mycompany.campeonatofutbol;

public class Encuentro {
    private String equipo1;
    private String equipo2;
    private Arbitro arbitro;

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public String getEquipo1() {
        return equipo1;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setArbitro(Arbitro arbitro) {
        this.arbitro = arbitro;
    }

    public Arbitro getArbitro() {
        return arbitro;
    }
}
