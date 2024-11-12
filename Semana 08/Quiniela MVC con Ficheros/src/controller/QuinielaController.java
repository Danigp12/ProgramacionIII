package controller;


import java.nio.file.Path;
import java.util.ArrayList;

import model.QuinielaModel;
import view.QuinielaView;
import model.Partido;

public class QuinielaController {

    QuinielaModel model;
    QuinielaView view;

    public QuinielaController (QuinielaView view, QuinielaModel model){

        this.view = view;
        this.model = model;
      

        this.view.setController(this);
    }

     public void cargarPartidos(Path file){
            model.cargarPartidos(file);
    }

    public void introducirResultados(ArrayList<Partido> resultado){
        model.introducirResultados(resultado);
    }

    public ArrayList<Partido> getPartidos(){
        return model.getPartidos();
    }

    public void run(){
        this.view.showMenu();
    }
}
