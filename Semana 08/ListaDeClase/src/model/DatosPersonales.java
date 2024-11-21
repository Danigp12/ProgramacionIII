package model;

import java.util.Random;

public class DatosPersonales {
    private String nombre;
    private String apellidos;
    private int edad;
    private String nIF;

    String[] nombres = {"Ana", "Javier", "María", "Carlos", "Laura", "Daniel", "Sofía", "Alejandro", "Lucía", "David"};
    String[] apellido = {"García", "Rodríguez", "Fernández", "López", "Martínez", "Sánchez", "Pérez", "González", "Alonso", "Díaz"};
    //Letras de los NIE españoles. Se eliminan la O,I y Ñ del alfabeto para evitar confusiones y errores por la ñ y también se elimina la U para que el número total de letras sea 23 que es primo.
    //La letra del DNI se calcula obteniendo el resto de dividir el numero del DNI entre 23 y poner la letra que ocupa la posición del resto
    String[] alfabetoDNI = {"A", "B", "C", "D", "E", "F", "G", "H", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "V", "W", "X", "Y", "Z"};
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
        Random random = new Random();

        this.nombre = nombres[random.nextInt(nombres.length)];
        this.apellidos = apellido[random.nextInt(apellido.length)];
        this.edad = random.nextInt(99);

        int dNI = 10000000 + random.nextInt(90000000);
        String letra = alfabetoDNI[dNI % 23];

        this.nIF = dNI + letra;
    }


    //String de los datos
    public String getStringFromInstanceDatos(DatosPersonales string, String delimitador) {

        String cadena = string.getNombre() + delimitador + string.getApellidos() + delimitador + string.getEdad() + delimitador + string.getNIF();

        return cadena;

    }
}
