package com.mycompany.campeonatofutbol;

public class Representante extends Persona {
    private String telefono;

    public Representante(String nombre, Direccion direccion, String telefono) {
        super(nombre, direccion);
        this.telefono = telefono;
    }

    // Getters y setters
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
