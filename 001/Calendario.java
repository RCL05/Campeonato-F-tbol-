/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.campeonatofutbol;

import java.util.Date;
import java.util.List;

public class Calendario {
    private Date fecha;
    private List<Encuentro> encuentroList;

    // Getters y setters
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<Encuentro> getEncuentroList() {
        return encuentroList;
    }

    public void setEncuentroList(List<Encuentro> encuentroList) {
        this.encuentroList = encuentroList;
    }
}
