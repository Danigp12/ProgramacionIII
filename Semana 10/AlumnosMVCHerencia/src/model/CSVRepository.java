package model;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVRepository implements PersistenceRepository {

    Path ruta = Paths.get(System.getProperty("user.home"), "Desktop", "alumnos.csv");
    String delimitador = ";";

    @Override
    public List<Alumno> importarAlumnos() throws Exception{
        
        ArrayList<Alumno> alumnos = new ArrayList<>();

        try {
            List<String> lineas = Files.readAllLines(ruta);
            for (String linea : lineas) {
                Alumno a = Alumno.getAlumnoFromDelimitadString(linea, delimitador);
                if(a != null){
                    alumnos.add(a);
                }
            }
            return alumnos;
        } catch (Exception e) {
            throw new Exception("ERROR en la importación de alumnos: ",e);
        }

}

    @Override
    public boolean exportarAlumnos(List<Alumno> listaAlumnos) throws Exception{
   
        ArrayList<String> lineas = new ArrayList<>();

        for (String linea : lineas) {
            //getAlumnoAsString transforma una instancia de Alumno en un String con el delimitador dado.
            lineas.add(Alumno.getAlumnoAsString(delimitador));
        }

        try {
            Files.write(ruta, lineas, StandardCharsets.UTF_8);
            return true;
        } catch (Exception e) {
            throw new Exception("Error al exortar alumnos: ", e);
        }
    }

}
