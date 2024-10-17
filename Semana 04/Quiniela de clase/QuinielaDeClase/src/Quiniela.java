import com.coti.tools.Esdia;

import Partido.Partido;

//Ejercicio hecho en la versión 2 para que el tamaño de la tabla dependa del equipo de nombre más largo.
public class Quiniela {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduzca los equipos que conforman los 15 partidos y los resultados:");
        Partido[] partidos = new Partido[15];
        int a = 0; //Será la longitud del nombre de equipo más largo.

        //Bucle para recoger los datos de los partidos.
        for (int i=0; i<partidos.length; i++) {
           partidos[i] = new Partido();
            
            System.out.printf("\nDatos del partido %d: \n\n", i+1);

            String promLocal = String.format("Equipo Local: ");
            String local = Esdia.readString(promLocal);
            partidos[i].setEquipoLocal(local);

            String promVisitante = String.format("Equipo Visitante: ");
            String visitante = Esdia.readString(promVisitante);
            partidos[i].setEquipoVisitante(visitante);

            String promGolLocal = String.format("Goles del equipo local: ");
            int golLocal = Esdia.readInt(promGolLocal);
            partidos[i].setGolesLocales(golLocal);
            
            String promGolVisita = String.format("Goles del equipo visitante: ");
            int golVisita = Esdia.readInt(promGolVisita);
            partidos[i].setGolesVisitantes(golVisita);

            //Modifica el valor de a si el nombre de algun equipo es mas largo que todos los anteriores introducidos.
            if (local.length()>a) {
                a = local.length();
            }
            if (visitante.length()>a) {
                a = visitante.length();
            }
            
        }

        //Imprimacion de la tabla.
        System.out.printf("|" + "-".repeat(2*a + 18) + "|\n");
        System.out.printf("|" + " ".repeat(a + 5) + "Quiniela" + " ".repeat(a + 5) + "|\n");
        System.out.printf("|" + "-".repeat(2*a + 18) + "|\n");


        for (int i=0; i<partidos.length; i++) {
            System.out.printf("| %-"+ a + "s | %-" + a + "s " + " ".repeat(9) + "| %s |\n" , partidos[i].getEquipoLocal(),partidos[i].getEquipoVisitante(),partidos[i].getResultado());
        }

        System.out.printf("|" + "-".repeat(2*a + 18) + "|\n");

}

}