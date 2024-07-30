import java.util.ArrayList;
import java.util.List;

public class Encuentro {
    private int idEncuentro;
    private String ubicacion;
    private int idArbitro;
    private List<Resultado> resultadoList;

    public Encuentro() {
        resultadoList = new ArrayList<>();
    }

    // Getters y setters
    public int getIdEncuentro() {
        return idEncuentro;
    }

    public void setIdEncuentro(int idEncuentro) {
        this.idEncuentro = idEncuentro;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getIdArbitro() {
        return idArbitro;
    }

    public void setIdArbitro(int idArbitro) {
        this.idArbitro = idArbitro;
    }

    public List<Resultado> getResultadoList() {
        return resultadoList;
    }

    public void setResultadoList(List<Resultado> resultadoList) {
        this.resultadoList = resultadoList;
    }
}
