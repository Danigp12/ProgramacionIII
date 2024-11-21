package model;

public class Direccion {
    private String calle;
    private int numero;
    private int piso;
    private String letra;

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
        
    }

    //String de la Direccion.
    public String getStringFromInstanceDireccion(Direccion string, String delimitador) {

        String cadena = string.getCalle() + delimitador + string.getNumero() + delimitador + string.getPiso() + delimitador + string.getLetra();

        return cadena;

    }


}
