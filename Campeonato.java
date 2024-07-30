import java.util.Date;
import java.util.List;

public class Campeonato {
    private int duracionJuego;
    private Date fechaFin;
    private Date fechaInicio;
    private int numeroCampeonato;
    private String nombreCampeonato;
    private int cantidadClasificadosPorGrupo;
    private int cantidadEquiposPorGrupo;
    private int cantidadDeGrupos;
    private List<Estadisticas> estadisticasList;
    private List<InscripciondelEquipo> inscripcionesEquipoList;
    private List<InscripcionJugador> inscripcionJugadorList;
    private List<Equipo> equipoList;
    private Calendario calendario;

    // Getters y setters
    public int getDuracionJuego() {
        return duracionJuego;
    }

    public void setDuracionJuego(int duracionJuego) {
        this.duracionJuego = duracionJuego;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getNumeroCampeonato() {
        return numeroCampeonato;
    }

    public void setNumeroCampeonato(int numeroCampeonato) {
        this.numeroCampeonato = numeroCampeonato;
    }

    public String getNombreCampeonato() {
        return nombreCampeonato;
    }

    public void setNombreCampeonato(String nombreCampeonato) {
        this.nombreCampeonato = nombreCampeonato;
    }

    public int getCantidadClasificadosPorGrupo() {
        return cantidadClasificadosPorGrupo;
    }

    public void setCantidadClasificadosPorGrupo(int cantidadClasificadosPorGrupo) {
        this.cantidadClasificadosPorGrupo = cantidadClasificadosPorGrupo;
    }

    public int getCantidadEquiposPorGrupo() {
        return cantidadEquiposPorGrupo;
    }

    public void setCantidadEquiposPorGrupo(int cantidadEquiposPorGrupo) {
        this.cantidadEquiposPorGrupo = cantidadEquiposPorGrupo;
    }

    public int getCantidadDeGrupos() {
        return cantidadDeGrupos;
    }

    public void setCantidadDeGrupos(int cantidadDeGrupos) {
        this.cantidadDeGrupos = cantidadDeGrupos;
    }

    public List<Estadisticas> getEstadisticasList() {
        return estadisticasList;
    }

    public void setEstadisticasList(List<Estadisticas> estadisticasList) {
        this.estadisticasList = estadisticasList;
    }

    public List<InscripciondelEquipo> getInscripcionesEquipoList() {
        return inscripcionesEquipoList;
    }

    public void setInscripcionesEquipoList(List<InscripciondelEquipo> inscripcionesEquipoList) {
        this.inscripcionesEquipoList = inscripcionesEquipoList;
    }

    public List<InscripcionJugador> getInscripcionJugadorList() {
        return inscripcionJugadorList;
    }

    public void setInscripcionJugadorList(List<InscripcionJugador> inscripcionJugadorList) {
        this.inscripcionJugadorList = inscripcionJugadorList;
    }

    public List<Equipo> getEquipoList() {
        return equipoList;
    }

    public void setEquipoList(List<Equipo> equipoList) {
        this.equipoList = equipoList;
    }

    public Calendario getCalendario() {
        return calendario;
    }

    public void setCalendario(Calendario calendario) {
        this.calendario = calendario;
    }
}
