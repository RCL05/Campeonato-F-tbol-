package com.mycompany.campeonatofutbol;

import java.util.Date;
import java.util.List;

public class Calendario {
    private Date fecha;
    private List<Encuentro> encuentros;

    // Getters y setters
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<Encuentro> getEncuentros() {
        return encuentros;
    }

    public void setEncuentros(List<Encuentro> encuentros) {
        this.encuentros = encuentros;
    }
}
