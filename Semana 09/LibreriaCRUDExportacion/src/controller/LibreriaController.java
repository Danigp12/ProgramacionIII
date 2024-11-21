package controller;

import java.util.ArrayList;

import model.LibreriaModel;
import model.Libros;
import view.LibreriaView;

public class LibreriaController {

    LibreriaModel model = new LibreriaModel();
    LibreriaView view = new LibreriaView();

    public LibreriaController(LibreriaView view, LibreriaModel model){
        this.view = view;
        this.model = model;

        view.setController(this);
    }

    public ArrayList<Libros> mostrarLibrosTabla() {

    return model.mostrarLibrosTabla();
    }

    public void añadirLibro(Libros libro) {
      model.añadirLibro(libro);
    }

    public void eliminarLibro(int posicion) {

    model.eliminarLibro(posicion);
    }

    public void modificarLibro(Libros libro, int posicion){
        model.modificarLibro(libro, posicion);
    }


    public void exportarLibrosCSV() {
        model.exportarLibrosCSV();
    }

    public void init(){
        view.showMenu();
    }

}
