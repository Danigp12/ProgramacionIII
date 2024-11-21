package model;


public class DatosDeAlumno {
    private Direccion direccion;
    private DatosPersonales datos;

    public Direccion getDireccion() {
        return direccion;
    }
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    public DatosPersonales getDatos() {
        return datos;
    }
    public void setDatos(DatosPersonales datos) {
        this.datos = datos;
    }



    public void randomAlumno(DatosDeAlumno alumno){


        alumno.direccion = new Direccion();
        alumno.datos = new DatosPersonales();
        
        direccion.randomDireccionConstructor();
        datos.randomDatosConstructor();


    }

    
}
