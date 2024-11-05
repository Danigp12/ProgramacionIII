package controller;
import view.AlmacenView;
import model.AlmacenModel;

public class AlmacenController {
    
  AlmacenView view;
  AlmacenModel model;
  
  public AlmacenController(AlmacenView view, AlmacenModel model){

    this.view = view;
    this.model = model;

    this.view.setController(this);
  }



public void guardarPrecio(double num1, double num2){
    model.setPrecio1(num1);
    model.setPrecio2(num2);
}

public void run(){
    this.view.showMenu();
}

public void calcularIngresos(){
    model.ingresos();
}

public void guardarVentas(double venta1, double venta2, int posicion){
    model.ventas(venta1,venta2,posicion);
}

public double[][] getAlmacen(){
    return model.getAlmacen();
}

public double getIngresosTotales(){
    return model.getIngresosTotales();
}

}