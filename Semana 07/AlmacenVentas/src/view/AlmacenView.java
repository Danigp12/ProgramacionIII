package view;

import com.coti.tools.Esdia;

import controller.AlmacenController;

public class AlmacenView {
AlmacenController controller;

        public void showMenu(){

        boolean salir = true;

        while (salir) {
            System.out.println("1.- Leer tabla de ventas.");
            System.out.println("2.- Leer tabla de precios");
            System.out.println("3.- Calcular ingresos totales.");
            System.out.println("4.- Mostrar resultados.");
            System.out.println("5.- Salir.");

            int opción = Esdia.readInt("Introduzca una opción.\n");
            switch (opción) {
                case 1:
                leerVentas();
                break;

                case 2:
                leerPrecios();
                break;

                case 3:
                sumarIngresos();
                break;

                case 4:
                mostrarResultados();
                break;

                case 5:
                salir=false;
                break;
            
                default:
                    break;
            }

        }

     }

     public void leerVentas(){
        for(int i = 0; i<5; i++){
          System.out.println("Almacén " + (i+1) + ": ");
          double venta1 = Esdia.readDouble("Introduzca el numero de ventas del producto 1: ");
          double venta2 = Esdia.readDouble("Introduzca el numero de ventas del producto 2: ");

        controller.guardarVentas(venta1, venta2, i);
        }
     }

     public void leerPrecios(){
        double num1 = Esdia.readDouble("Introduzca el precio del Producto 1: ");
        double num2 = Esdia.readDouble("Introduzca el precio del Producto 2: ");

        controller.guardarPrecio(num1, num2);
     }

     public void sumarIngresos(){
        controller.calcularIngresos();
     }

     public void mostrarResultados(){

      
        double[][] alma = controller.getAlmacen();
        double total = controller.getIngresosTotales();
      
         for (int i = 0; i<5; i++) {
            System.out.println("Almacén " + (i+1) + ":     Ventas Producto 1: " + alma[i][0] + "   Ventas Producto 2: " + alma[i][1]);
        }
        System.out.printf("Total Ventas:   %7.2f\n", total );
        
       
     }

     public void setController(AlmacenController almacenController){
        this.controller = almacenController;
     }
}
