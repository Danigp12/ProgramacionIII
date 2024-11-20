package model;

import java.util.Locale;

public class Persona {
    String nombre;
    String telefono;
    double peso;

    public void setPeso(double peso){
        this.peso = peso;
    }
    public double getPeso(){
        return peso;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public static Persona getPersonaFromString(String personaString, String delimitador){
        try {
            String[] datos = personaString.split(delimitador);
            if(datos.length == 3){
                String nombre = datos[0];
                String telefono = datos[1];
                double peso = Double.parseDouble(datos[3]);
        
                Persona persona = new Persona(nombre, telefono, peso);
                
                return persona;

            }else{
                return null;
            }

        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            return null;
        }
    }

    public Persona(String nombre, String telefono, double peso){
        this.nombre = nombre;
        this.telefono = telefono;
        this.peso = peso;
    }

public String getStringFromInstance(String delimitador){

        String fields ="%s" + delimitador + "%s" + delimitador + "%d";
        return String.format(Locale.ENGLISH, fields, nombre, telefono, peso);
    } 
    
}
