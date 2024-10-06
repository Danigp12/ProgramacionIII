package datos;

public class Persona {
    private String nombre = "Sin Nombre";
    private double peso = 0.0;
    private double talla = 0.0;

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
public double gettalla() {
    return talla;
}
public void settalla(double talla) {
    this.talla = talla;
}
    public double getpeso() {
        return peso;
    }
    public void setpeso(double peso) {
        this.peso = peso;
    }
}
