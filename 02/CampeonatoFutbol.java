/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.campeonatofutbol;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CampeonatoFutbol {
    public static void main(String[] args) {
        // Creación de equipos
        Equipo equipo1 = new Equipo();
        equipo1.setIdEquipo(1);
        equipo1.setNombreEquipo("Equipo A");
        equipo1.setColorUniforme("Rojo");

        Equipo equipo2 = new Equipo();
        equipo2.setIdEquipo(2);
        equipo2.setNombreEquipo("Equipo B");
        equipo2.setColorUniforme("Azul");

        // Creación de jugadores
        Jugador jugador1 = new Jugador();
        jugador1.setIdJugador(1);
        jugador1.setCategoria("Senior");

        Jugador jugador2 = new Jugador();
        jugador2.setIdJugador(2);
        jugador2.setCategoria("Senior");

        // Agregar jugadores a los equipos
        List<Jugador> jugadoresEquipo1 = new ArrayList<>();
        jugadoresEquipo1.add(jugador1);
        equipo1.setJugadores(jugadoresEquipo1);

        List<Jugador> jugadoresEquipo2 = new ArrayList<>();
        jugadoresEquipo2.add(jugador2);
        equipo2.setJugadores(jugadoresEquipo2);

        // Crear un encuentro
        Encuentro encuentro = new Encuentro();
        encuentro.setIdEncuentro(1);
        encuentro.setUbicacion("Estadio Central");
        encuentro.setEquipo1(equipo1);
        encuentro.setEquipo2(equipo2);

        Resultado resultado1 = new Resultado();
        resultado1.setIdResultado(1);
        resultado1.setCantidadDePuntos(3);
        resultado1.setEquipo(equipo1);

        Resultado resultado2 = new Resultado();
        resultado2.setIdResultado(2);
        resultado2.setCantidadDePuntos(0);
        resultado2.setEquipo(equipo2);

        List<Resultado> resultados = new ArrayList<>();
        resultados.add(resultado1);
        resultados.add(resultado2);
        encuentro.setResultadoList(resultados);

        // Crear un calendario y añadir el encuentro
        Calendario calendario = new Calendario();
        calendario.setFecha(new Date());

        List<Encuentro> encuentros = new ArrayList<>();
        encuentros.add(encuentro);
        calendario.setEncuentroList(encuentros);

        // Crear un campeonato y asignar equipos y calendario
        Campeonato campeonato = new Campeonato();
        campeonato.setIdCampeonato(1);
        campeonato.setNombreCampeonato("Campeonato de Fútbol 2024");
        campeonato.setFechaInicio(new Date());
        campeonato.setFechaFin(new Date());
        
        List<Equipo> equipoList = new ArrayList<>();
        equipoList.add(equipo1);
        equipoList.add(equipo2);
        campeonato.setEquipoList(equipoList);
        campeonato.setCalendario(calendario);

        // Mostrar datos del campeonato
        System.out.println("Nombre del campeonato: " + campeonato.getNombreCampeonato());
        System.out.println("Equipos participantes:");
        for (Equipo equipo : campeonato.getEquipoList()) {
            System.out.println("- " + equipo.getNombreEquipo());
        }
        System.out.println("Fecha de inicio: " + campeonato.getFechaInicio());
        System.out.println("Fecha de fin: " + campeonato.getFechaFin());
        System.out.println("Encuentros programados:");
        for (Encuentro enc : calendario.getEncuentroList()) {
            System.out.println("- " + enc.getEquipo1().getNombreEquipo() + " vs " + enc.getEquipo2().getNombreEquipo());
        }
    }
}
