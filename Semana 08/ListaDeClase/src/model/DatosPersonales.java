package model;

public class DatosPersonales {
    private String nombre;
    private String apellidos;
    private int edad;
    private String nIF;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNIF() {
        return nIF;
    }
    public void setNIF(String nIF) {
        this.nIF = nIF;
    }

    //Constructor aleatorio.
    public void randomDatosConstructor(){


    }


    //String de los datos
    public String getStringFromInstanceDatos(DatosPersonales string, String delimitador) {

        String cadena = string.getNombre() + delimitador + string.getApellidos() + delimitador + string.getEdad() + delimitador + string.getNIF();

        return cadena;

    }
}
