import java.util.Date;
import java.util.List;

public class Calendario {
    private Date fecha;
    private int idFechaDeJuego;
    private List<Encuentro> encuentroList;

    // Getters y setters
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getIdFechaDeJuego() {
        return idFechaDeJuego;
    }

    public void setIdFechaDeJuego(int idFechaDeJuego) {
        this.idFechaDeJuego = idFechaDeJuego;
    }

    public List<Encuentro> getEncuentroList() {
        return encuentroList;
    }

    public void setEncuentroList(List<Encuentro> encuentroList) {
        this.encuentroList = encuentroList;
    }
}
