import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public abstract class BuscadorPrimos {
    private String nombre;
    private int limite;
    private long tiempoRequerido;
    private int cantidadpPrimos;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public long getTiempoRequerido() {
        return tiempoRequerido;
    }

    public void setTiempoRequerido(long tiempoRequerido) {
        this.tiempoRequerido = tiempoRequerido;
    }

    public int getCantidadpPrimos() {
        return cantidadpPrimos;
    }

    public void setCantidadpPrimos(int cantidadpPrimos) {
        this.cantidadpPrimos = cantidadpPrimos;
    }
    
    abstract ArrayList<Integer> calcularPrimos();

    final void calcular(){
        Instant start = Instant.now();
        ArrayList<Integer> primos = new ArrayList<>();
        primos = calcularPrimos();
        Instant stop = Instant.now();
        this.tiempoRequerido = Duration.between(start, stop).toMillis();
        this.cantidadpPrimos = primos.size();
    }

    public BuscadorPrimos() { 
        super();
    }

    
}


