package datos;
import java.lang.Math;

public class Persona {
    private String nombre = "Sin Nombre";
    private double peso = 0.0;
    private double talla = 0.0;
    private double imc = 0.0;

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

    //Ejercicio 3: Calculo del IMC de cada persona introduda IMC = peso/talla^2.
        //Con Esdia usada antes podemos comprobar si los datos no son correctos.
        //%.2f para que solo salgan 2 decimales en el IMC.
    public void setImc(double imc) {
        this.imc = imc;
    }
    public double getImc() {
        return peso / Math.pow(talla, 2);
    }

}
