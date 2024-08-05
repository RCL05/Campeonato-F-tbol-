package com.mycompany.campeonatofutbol;

public class Director extends Persona {
    private String cargo;

    public Director(String nombre, Direccion direccion, String cargo) {
        super(nombre, direccion);
        this.cargo = cargo;
    }

    // Getters y setters
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}

