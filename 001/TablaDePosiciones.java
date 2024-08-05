/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.campeonatofutbol;

import java.util.HashMap;
import java.util.Map;

public class TablaDePosiciones {
    private Map<String, Integer> posiciones;

    public TablaDePosiciones() {
        posiciones = new HashMap<>();
    }

    public void actualizarPosicion(String equipo, int puntos) {
        posiciones.put(equipo, posiciones.getOrDefault(equipo, 0) + puntos);
    }

    public void mostrarTabla() {
        System.out.println("Tabla de posiciones:");
        for (Map.Entry<String, Integer> entry : posiciones.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " puntos");
        }
    }
}
