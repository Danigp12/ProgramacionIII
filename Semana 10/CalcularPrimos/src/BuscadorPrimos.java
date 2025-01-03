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

    void BuscadorPrimos(String nombre, int limite){
        this.nombre = nombre;
        this.limite = limite;
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

    /*public BuscadorPrimos(String nombre, int limite, long tiempoRequerido, int cantidadpPrimos) {
        this.nombre = nombre;
        this.limite = limite;
        this.tiempoRequerido = tiempoRequerido;
        this.cantidadpPrimos = cantidadpPrimos;
    }*/

    public BuscadorPrimos() { 
        super();
    }

    
}


