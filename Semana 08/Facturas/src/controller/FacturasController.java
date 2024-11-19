package controller;

import java.util.List;

import model.FacturasModel;
import view.FacturasView;

public class FacturasController {

    FacturasModel model;
    FacturasView view;

    public FacturasController (FacturasView view, FacturasModel model){

        this.view = view;
        this.model = model;
      

        this.view.setController(this);
    }
    public void exportarCSV(){
        model.guardarFcturasCSV();
    }

    public List<String> mostrarFacturas() throws Exception{
        return model.cargarFacturasDesdeFichero();
    }

    public void exportarHTML(){
        model.guardarFcturasHTML();
    }

    public List<String> valorMinimo(double importe) throws Exception{
        return model.valorMin(importe);
    }

    public void init() throws Exception{
        view.showMenu();
    }

}
