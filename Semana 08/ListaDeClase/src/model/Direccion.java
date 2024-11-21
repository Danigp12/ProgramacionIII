package model;

import java.util.Random;

public class Direccion {
    private String calle;
    private int numero;
    private int piso;
    private String letra;

    private final String[] calles = {"Calle Mayor", "Avenida de la Constitución", "Calle Real", "Calle Nueva", "Plaza Mayor", "Calle de la Iglesia", "Calle del Carmen", "Avenida de Europa", "Calle del Mar", "Calle de la Paz"};
    private final String[] letras = {"A", "B", "C", "D", "E", "F", "G", "H"};


    public void setCalle(String calle){
        this.calle = calle;
    }
    public String getCalle(){
        return calle;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getPiso() {
        return piso;
    }
    public void setPiso(int piso) {
        this.piso = piso;
    }
    public String getLetra() {
        return letra;
    }
    public void setLetra(String letra) {
        this.letra = letra;
    }

    //Constructor de la direccion.
    public void randomDireccionConstructor(){
        Random random = new Random();
        this.calle = calles[random.nextInt(calles.length)];
        this.numero = random.nextInt(100);
        this.letra = letras[random.nextInt(letras.length)];
        this.piso = random.nextInt(10);
    }

    //String de la Direccion.
    public String getStringFromInstanceDireccion(Direccion string, String delimitador) {

        String cadena = string.getCalle() + delimitador + string.getNumero() + delimitador + string.getPiso() + delimitador + string.getLetra();

        return cadena;

    }


}
