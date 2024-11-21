package view;

import java.util.ArrayList;

import com.coti.tools.Esdia;

import controller.ListController;
import model.DatosDeAlumno;
import model.DatosPersonales;
import model.Direccion;

public class ListaView {

    ListController controller = new ListController(null, null);

public void showMenu(){

    boolean trigger = true;
    
    controller.generarAlumnos();

    while(trigger){
         System.out.println("Menu de opciones.");
        System.out.println("1) Volver a crear la lista de alumnos.");
        System.out.println("2) Mostrar tabla de alumnos.");
        System.out.println("3) Exportar datos personales en CSV.");
        System.out.println("4) Exportar direcciones en CSV.");

        System.out.println("5) Salir.\n");


        int opcion = Esdia.readInt("Seleccione una opción.  ");

        switch (opcion) {
            case 1:
                generarAlumnos();
                break;
            
            case 2:
                mostrarTabla();
            break;

            case 3:
                exportarDatosPersonalesCSV();
            break;

            case 4:
                exportarDireccionesCSV();
            break;
            case 5:
            trigger = false;
            break;
        
            default:
                break;
        }

    }
    }

    public void generarAlumnos(){
        controller.generarAlumnos();
    }

    public void mostrarTabla(){
        ArrayList<DatosDeAlumno> alumnos = controller.mostrarTabla();

        System.out.println("Listado de Alumnos:\n");
        for (DatosDeAlumno datos : alumnos) {
            Direccion direccion = datos.getDireccion();
            DatosPersonales alumno = datos.getDatos();

            System.out.println(alumno.getNombre() + "\t" + alumno.getApellidos() + "\t" + alumno.getEdad() + "\t" + alumno.getNIF() + "\t" + direccion.getCalle()
                              + "\t" + direccion.getNumero() + "\t" + direccion.getPiso() + "\t" + direccion.getLetra() + "\n");    
        }
    }

    public void exportarDatosPersonalesCSV(){
        controller.exportarDatosPersonalesCSV();
    }

    public void exportarDireccionesCSV(){
        controller.exportarDireccionesCSV();
    }

    public void setController(ListController controller){
        this.controller = controller;
    }
}
