package com.mycompany.campeonatofutbol;

import java.util.HashMap;
import java.util.Map;

public class TablaDePosiciones {
    private Map<String, Integer> posiciones;

    public TablaDePosiciones() {
        posiciones = new HashMap<>();
    }

    public void actualizarPosicion(String nombreEquipo, int puntos) {
        posiciones.put(nombreEquipo, posiciones.getOrDefault(nombreEquipo, 0) + puntos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : posiciones.entrySet()) {
            sb.append(entry.getKey()).append(": ").append(entry.getValue()).append(" puntos\n");
        }
        return sb.toString();
    }
}
