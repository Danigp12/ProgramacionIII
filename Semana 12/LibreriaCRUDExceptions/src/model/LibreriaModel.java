package model;

import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LibreriaModel {
    Almacen almacen = new Almacen();

    public ArrayList<Libros> mostrarLibrosTabla() {
       
        return almacen.getAlmacen();
    }

    public void añadirLibro(Libros libro) {
       almacen.agregarLibro(libro);
    }

    public void eliminarLibro(int posicion) {
        almacen.eliminarLibro(posicion);
    }

    public void modificarLibro(Libros libro, int posicion) {
        almacen.modificarLibro(libro, posicion);
    }

    public void exportarLibrosCSV() {
Path ruta = Paths.get(System.getProperty("user.home"),"Desktop","libros.csv");
    try(PrintWriter writer = new PrintWriter(ruta.toFile())) {
    
        ArrayList<Libros> libros = almacen.getAlmacen();

        for (Libros libro : libros) {
        
            String libroString = libro.getStringFromInstance(libro, ",");
            writer.println(libroString);

        }
    } catch (Exception e) {
    // TODO: handle exception
}    }

    
}
