package Partido;

public class Partido {
    private String equipoLocal = "";
    private String equipoVisitante = "";
    private int golesLocales = 0;
    private int golesVisitantes = 0;

    public String getEquipoLocal() {
        return equipoLocal;
    }
    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }
    public String getEquipoVisitante() {
        return equipoVisitante;
    }
    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }
public int getGolesLocales() {
    return golesLocales;
}
public void setGolesLocales(int golesLocales) {
    this.golesLocales = golesLocales;
}
public int getGolesVisitantes() {
    return golesVisitantes;
}
public void setGolesVisitantes(int golesVisitantes) {
    this.golesVisitantes = golesVisitantes;
}
public String getResultado() {
    if (golesLocales>golesVisitantes) {
        return "1";
    } else {
        if (golesLocales<golesVisitantes) {
            return "2";
        } else {
            return "X";
        }
    }
}
    






}
