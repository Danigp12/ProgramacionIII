﻿package model;

public class Alumno {
    private String dNI;
    private String nombre;
    private String apellido1;
    private String apellido2;

    public Alumno(String dni, String nombre, String apellido1, String apellido2){

        this.dNI = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }



    public String getdNI() {
        return dNI;
    }
    public void setdNI(String dNI) {
        this.dNI = dNI;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido1() {
        return apellido1;
    }
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }
    public String getApellido2() {
        return apellido2;
    }
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }



    public static Alumno getAlumnoFromDelimitadString(String linea, String delimitador) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAlumnoFromDelimitadString'");
    }



    public static String getAlumnoAsString(String delimitador) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAlumnoAsString'");
    }

}
