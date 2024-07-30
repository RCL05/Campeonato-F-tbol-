import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private int idEquipo;
    private String nombreEquipo;
    private List<Jugador> jugadores;

    public Equipo() {
        jugadores = new ArrayList<>();
    }

    // Getters y setters
    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}
