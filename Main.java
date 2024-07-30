import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear campeonato
        Campeonato campeonato = new Campeonato();
        campeonato.setNombreCampeonato("Campeonato de Ejemplo");
        campeonato.setFechaInicio(new Date());
        campeonato.setFechaFin(new Date());

        // Crear equipos
        Equipo equipo1 = new Equipo();
        equipo1.setNombreEquipo("Equipo 1");

        Jugador jugador1 = new Jugador();
        jugador1.setIdJugador(1);
        jugador1.setCategoria("A");

        equipo1.getJugadores().add(jugador1);

        Equipo equipo2 = new Equipo();
        equipo2.setNombreEquipo("Equipo 2");

        Jugador jugador2 = new Jugador();
        jugador2.setIdJugador(2);
        jugador2.setCategoria("B");

        equipo2.getJugadores().add(jugador2);

        // Añadir equipos al campeonato
        List<Equipo> equipos = new ArrayList<>();
        equipos.add(equipo1);
        equipos.add(equipo2);
        campeonato.setEquipoList(equipos);

        // Crear encuentros y resultados
        Encuentro encuentro = new Encuentro();
        encuentro.setUbicacion("Estadio");

        Resultado resultado1 = new Resultado();
        resultado1.setCantidadDePuntos(2);
        Resultado resultado2 = new Resultado();
        resultado2.setCantidadDePuntos(2);

        List<Resultado> resultados = new ArrayList<>();
        resultados.add(resultado1);
        resultados.add(resultado2);
        encuentro.setResultadoList(resultados);

        // Añadir encuentro al calendario
        Calendario calendario = new Calendario();
        calendario.setFecha(new Date());

        List<Encuentro> encuentros = new ArrayList<>();
        encuentros.add(encuentro);
        calendario.setEncuentroList(encuentros);
        campeonato.setCalendario(calendario);

        // Actualizar la tabla de posiciones
        TablaDePosiciones tablaDePosiciones = new TablaDePosiciones();
        tablaDePosiciones.actualizarPosicion(equipo1.getNombreEquipo(), resultado1.getCantidadDePuntos());
        tablaDePosiciones.actualizarPosicion(equipo2.getNombreEquipo(), resultado2.getCantidadDePuntos());

        // Mostrar tabla de posiciones
        tablaDePosiciones.mostrarTabla();
    }
}
