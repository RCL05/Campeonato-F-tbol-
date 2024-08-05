package com.mycompany.campeonatofutbol;

public class Jugador {
    private int id;
    private String categoria;
    private String nombre;
    private Estadisticas estadisticas;
    // Getters y setters
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEstadisticas(Estadisticas estadisticas) {
        this.estadisticas = estadisticas;
    }

    public Estadisticas getEstadisticas() {
        return estadisticas;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
