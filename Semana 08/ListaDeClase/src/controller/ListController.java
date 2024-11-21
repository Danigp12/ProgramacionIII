package controller;

import java.util.ArrayList;


import model.DatosDeAlumno;
import model.ListaModel;
import view.ListaView;

public class ListController {

    ListaModel model = new ListaModel();
    ListaView view = new ListaView();

    public ListController(ListaView view, ListaModel model){
        this.view = view;
        this.model = model;

        this.view.setController(this);
    }

    public void generarAlumnos(){
        model.crearTablaAlumnos();
    }


    public ArrayList<DatosDeAlumno> mostrarTabla() {
       return model.mostrarTabla();
    }


    public void exportarDatosPersonalesCSV() {

        model.exportarDatosPersonalesCSV();
    }


    public void exportarDireccionesCSV() {

        model.exportarDireccionesCSV();

    }

    public void init(){
        view.showMenu();
    }

}
