package com.mycompany.campeonatofutbol;

import java.util.Date;
import java.util.List;

public class Campeonato {
    private String nombreCampeonato;
    private List<Equipo> equipoList;
    private List<Arbitro> arbitros;
    private Date fechaInicio;  // Nuevo atributo
    private Date fechaFin;     // Nuevo atributo

    // Métodos existentes
    public void setNombreCampeonato(String nombreCampeonato) {
        this.nombreCampeonato = nombreCampeonato;
    }

    public String getNombreCampeonato() {
        return nombreCampeonato;
    }

    public void setEquipoList(List<Equipo> equipoList) {
        this.equipoList = equipoList;
    }

    public List<Equipo> getEquipoList() {
        return equipoList;
    }

    public void setArbitros(List<Arbitro> arbitros) {
        this.arbitros = arbitros;
    }

    public List<Arbitro> getArbitros() {
        return arbitros;
    }

    // Nuevos métodos
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Date getFechaFin() {
        return fechaFin;
    }
}
