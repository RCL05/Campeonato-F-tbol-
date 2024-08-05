package com.mycompany.campeonatofutbol;
public class Arbitro {
    private String nombre;
    private Direccion direccion;
    private int numeroLicencia;

    public Arbitro() {
    }

    public Arbitro(String nombre, Direccion direccion, int numeroLicencia) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroLicencia = numeroLicencia;
    }

    // Métodos getter y setter

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setNumeroLicencia(int numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    public int getNumeroLicencia() {
        return numeroLicencia;
    }
}

