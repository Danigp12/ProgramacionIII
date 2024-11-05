package model;

public class AlmacenModel {
    private double[][] almacen = new double[5][2];
    private double precio1 = -1;
    private double precio2;

    private double ingresosTotales = -1;


    public void ingresos(){
       
            ingresosTotales = 0;
            for (double[] ds : almacen) {
        
             ingresosTotales += (ds[0] * precio1) + (ds[1] * precio2);
        }
    

    }


    public double[][] getAlmacen() {
        return almacen;
    }

    public void setAlmacen(double[][] almacen) {
        this.almacen = almacen;
    }

    public double getPrecio1() {
        return precio1;
    }
    public void setIngresosTotales(double ingresosTotales) {
        this.ingresosTotales = ingresosTotales;
    }
    public double getIngresosTotales() {
        return ingresosTotales;
    }
    public void setPrecio1(double precio1) {
        this.precio1 = precio1;
    }
    public double getPrecio2() {
        return precio2;
    }
    public void setPrecio2(double precio2) {
        this.precio2 = precio2;
    }


    public void ventas(double venta1, double venta2, int posicion){
        double[] prompalma = almacen[posicion];
            prompalma[0] = venta1;
            prompalma[1] = venta2;
        almacen[posicion] = prompalma;
    }
    }


