/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.campeonatofutbol;

public class Estadisticas {
    private int idGrupoPuntuacion;
    private String nombre;
    private int puntosDerrotaSinJugar;
    private int puntosPorEmpate;
    private int puntosPorPerdida;
    private int puntosPorVictoria;
    private int puntosVictoriaSinJugar;

    // Getters y setters
    public int getIdGrupoPuntuacion() {
        return idGrupoPuntuacion;
    }

    public void setIdGrupoPuntuacion(int idGrupoPuntuacion) {
        this.idGrupoPuntuacion = idGrupoPuntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosDerrotaSinJugar() {
        return puntosDerrotaSinJugar;
    }

    public void setPuntosDerrotaSinJugar(int puntosDerrotaSinJugar) {
        this.puntosDerrotaSinJugar = puntosDerrotaSinJugar;
    }

    public int getPuntosPorEmpate() {
        return puntosPorEmpate;
    }

    public void setPuntosPorEmpate(int puntosPorEmpate) {
        this.puntosPorEmpate = puntosPorEmpate;
    }

    public int getPuntosPorPerdida() {
        return puntosPorPerdida;
    }

    public void setPuntosPorPerdida(int puntosPorPerdida) {
        this.puntosPorPerdida = puntosPorPerdida;
    }

    public int getPuntosPorVictoria() {
        return puntosPorVictoria;
    }

    public void setPuntosPorVictoria(int puntosPorVictoria) {
        this.puntosPorVictoria = puntosPorVictoria;
    }

    public int getPuntosVictoriaSinJugar() {
        return puntosVictoriaSinJugar;
    }

    public void setPuntosVictoriaSinJugar(int puntosVictoriaSinJugar) {
        this.puntosVictoriaSinJugar = puntosVictoriaSinJugar;
    }
}
