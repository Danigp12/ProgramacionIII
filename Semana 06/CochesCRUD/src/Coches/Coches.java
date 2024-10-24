package Coches;

public class Coches {
    private String marca;
    private String modelo;
    private String color;
    private boolean navegador = false;

    public Coches(String marca, String modelo, String color, boolean navegador){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.navegador = navegador;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setNavegador(boolean navega){
        if (navega) {
            this.navegador = true;
        }
    }
    public boolean getNavegador(){
        return navegador;
    }

    public String getCocheComoString(){
        return "| Marca: " + marca + " | Modelo: " + modelo + " | Color: " + color + " | Navegador: "+ navegador + " |";
    }
}
