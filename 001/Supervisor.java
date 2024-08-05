/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.campeonatofutbol;

public class Supervisor {
    private int idSupervisor;

    // Métodos
    public boolean supervisarJuego() {
        System.out.println("El supervisor está supervisando el juego.");
        return true;
    }

    // Getters y setters
    public int getIdSupervisor() {
        return idSupervisor;
    }

    public void setIdSupervisor(int idSupervisor) {
        this.idSupervisor = idSupervisor;
    }
}
