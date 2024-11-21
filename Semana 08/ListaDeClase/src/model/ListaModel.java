package model;

import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ListaModel {

    private DatosDeAlumno alumno;
    private ArrayList<DatosDeAlumno> listaAlumnos = new ArrayList<>();

    public ArrayList<DatosDeAlumno> getListaAlumnos() {
        return listaAlumnos;
    }
    public void setListaAlumnos(ArrayList<DatosDeAlumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }
    public DatosDeAlumno getAlumno() {
        return alumno;
    }
    public void setAlumno(DatosDeAlumno alumno) {
        this.alumno = alumno;
    }

    public void crearTablaAlumnos(){

        for(int i=0; i<20; i++){

            alumno = new DatosDeAlumno();

            alumno.randomAlumno(alumno);

            listaAlumnos.add(alumno);
        }


    }

    public ArrayList<DatosDeAlumno> mostrarTabla(){
        return listaAlumnos;
    }

    //Crea un archivo CSV con solo los datos personales.
    public void exportarDatosPersonalesCSV(){
 Path ruta = Paths.get(System.getProperty("user.home"),"Desktop","datosPersonales.csv");
    try(PrintWriter writer = new PrintWriter(ruta.toFile())) {
    
        List<DatosDeAlumno> datos = this.getListaAlumnos();

        for (DatosDeAlumno dato : datos) {

        DatosPersonales persona = dato.getDatos();
            String personalString = persona.getStringFromInstanceDatos(persona, ",");
            writer.println(personalString);

        }
    } catch (Exception e) {
    // TODO: handle exception
}
        }

    

        //Crea un archivo CSV con solo las direcciones.
    public void exportarDireccionesCSV(){
        Path ruta = Paths.get(System.getProperty("user.home"),"Desktop","direcciones.csv");
        try(PrintWriter writer = new PrintWriter(ruta.toFile())) {
        
            List<DatosDeAlumno> datos = this.getListaAlumnos();
    
            for (DatosDeAlumno dato : datos) {
    
            Direccion persona = dato.getDireccion();
                String personalString = persona.getStringFromInstanceDireccion(persona , ",");
                writer.println(personalString);
    
            }
        } catch (Exception e) {
        // TODO: handle exception
    }
    }
}
