package view;

import java.util.List;

import com.coti.tools.Esdia;

import controller.FacturasController;

public class FacturasView {
    FacturasController controller;

public void showMenu() throws Exception{
    boolean trigger = true;
    
    

    while(trigger){
         System.out.println("Menu de opciones.");
        System.out.println("1) Valor mínimo de Factura.");
        System.out.println("2) Mostrar Facturas.");
        System.out.println("3) Exportar Facturas a archivo HTML.");
        System.out.println("4) Exportar Facturas a archivo csv.");

        System.out.println("5) Salir.\n");


        int opcion = Esdia.readInt("Seleccione una opción.");

        switch (opcion) {
            case 1:
                valorMinimo();
                break;
            
            case 2:
                mostrarFacturas();
            break;

            case 3:
                exportarHTML();
            break;

            case 4:
                exportarCSV();
            break;
            case 5:
            trigger = false;
            break;
        
            default:
                break;
        }

    }
    }

    public void exportarCSV(){
        controller.exportarCSV();
    }

    public void mostrarFacturas() throws Exception{

        List<String> facturas = controller.mostrarFacturas();

        for (String string : facturas) {
            System.out.println(string);
        }
    }

    public void exportarHTML(){
        controller.exportarHTML();
    }

    public void valorMinimo() throws Exception{

        double importe = Esdia.readDouble("Introduzca el importe minimo de facturas (Precio con escuentos e IVA incluidos.)");
        List<String> facturasMinimas = controller.valorMinimo(importe);

        System.out.println("Facturas Minimas:\n\n");

        for (String string : facturasMinimas) {
            System.out.println(string + "\n");
        }

    }

    public void setController(FacturasController controller) {
        this.controller = controller;
    }
}


