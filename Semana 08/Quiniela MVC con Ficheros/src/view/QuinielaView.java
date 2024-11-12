package view;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import com.coti.tools.Esdia;

import controller.QuinielaController;
import model.Partido;

public class QuinielaView {

    QuinielaController controller;

   
    public void showMenu(){

        boolean trigger = true;

        while(trigger){
        System.out.println("Menu de opciones.");
        System.out.println("1) Cargar Partidos.");
        System.out.println("2) Introducir resultados.");
        System.out.println("3) Mostrar Partidos.");
        System.out.println("4) Salir.\n");


        int opcion = Esdia.readInt("Seleccione una opción.");

        switch (opcion) {
            case 1:
                cargarPartidos();
                break;
            
            case 2:
                introducirResultados();
            break;

            case 3:
                mostrarPartidos();
            break;

            case 4:
            trigger = false;
            break;
        
            default:
                break;
        }

    }
    }

    public void cargarPartidos(){
        Path ruta = Paths.get(System.getProperty("user.home"), "Desktop", "partidos.txt");
         controller.cargarPartidos(ruta);
    }

    public void introducirResultados(){


        ArrayList<Partido> listaPartidos = controller.getPartidos();
        System.out.println("Introduzca los resultados de los partidos:");
        for(Partido part : listaPartidos){
            System.out.printf("\n%s - %s : \n", part.getEquipoLocal(), part.getEquipoVisitante());
            int resultA = Esdia.readInt("Goles Locales: ");
            int resultB = Esdia.readInt("Goles Visitante: ");

            part.setGolesLocal(resultA);
            part.setGolesVisitante(resultB);
        }

        controller.introducirResultados(listaPartidos);
    }

    public void mostrarPartidos(){

        ArrayList<Partido> listaPartidos = controller.getPartidos();

        int a = 20;
        System.out.printf("|" + "-".repeat(2*a + 18) + "|\n");
        System.out.printf("|" + " ".repeat(a + 5) + "Quiniela" + " ".repeat(a + 5) + "|\n");
        System.out.printf("|" + "-".repeat(2*a + 18) + "|\n");


        for (Partido part : listaPartidos) {
            System.out.printf("| %-"+ a + "s | %-" + a + "s " + " ".repeat(9) + "| %s |\n" , part.getEquipoLocal(),part.getEquipoVisitante(),part.getResultado());
        }

        System.out.printf("|" + "-".repeat(2*a + 18) + "|\n");

    }

    public void setController(QuinielaController controller){
        this.controller = controller;

    }

}
