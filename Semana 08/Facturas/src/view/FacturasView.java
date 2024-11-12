package view;

import com.coti.tools.Esdia;

public class FacturasView {

public void showMenu(){
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


}


