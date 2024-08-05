package com.mycompany.campeonatofutbol;

public class Supervisor extends Persona {
    private String rol;

    public Supervisor(String nombre, Direccion direccion, String rol) {
        super(nombre, direccion);
        this.rol = rol;
    }

    // Getters y setters
    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
