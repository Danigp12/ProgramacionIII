package datos;

public class Persona {
    private String nombre = "Sin Nombre";
    private double Peso = 0.0;
    private double Talla = 0.0;

    public Persona(){
        //Construcctor vacio
    }

    public Persona(String paramNombre){
        this.nombre = paramNombre;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
public double getTalla() {
    return Talla;
}
public void setTalla(double talla) {
    Talla = talla;
}
    public double getPeso() {
        return Peso;
    }
    public void setPeso(double peso) {
        this.Peso = peso;
    }
}
