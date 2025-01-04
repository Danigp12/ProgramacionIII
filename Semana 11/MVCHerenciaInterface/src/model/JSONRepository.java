package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


public class JSONRepository implements PersistenceRepository{

    @Override
     public ArrayList<Alumno> importarAlumnos(){
       Path ruta = Paths.get(System.getProperty("user.home"), "Desktop", "alumnos.json");
            final File file = new File(ruta.toString());
            Gson gson = new Gson();
            try (FileReader reader = new FileReader(file)) {
        // Se usa TypeToken para que el return sea del tipo especificado
        TypeToken<List<Alumno>> token = new TypeToken<>() {};
        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos = gson.fromJson(reader, token.getType());
        return new ArrayList<>(alumnos);
    } catch (FileNotFoundException e) {
        System.err.println("File not found: " + e.getMessage());
    } catch (Exception e) {
        System.err.println("Error importing tasks: " + e.getMessage());
    }
    return new ArrayList<>();

    
    }




    @Override
     public boolean exportarAlumnos(ArrayList<Alumno> alumnos) {
    Gson gson = new Gson();
    String json = gson.toJson(alumnos);   
    Path ruta = Paths.get(System.getProperty("user.home"), "Desktop", "alumnos.json");
    
       
    try (FileWriter writer = new FileWriter(ruta.toFile())) {
        writer.write(json);
        return true;
    } catch (IOException e) {
        System.out.println(e.toString());
       return false;
    }
   
    }



}
