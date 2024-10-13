import com.coti.tools.Esdia;

import alumno.Alumno;

public class App {
    public static void main(String[] args) throws Exception {

        String prompNumeroAlumnos = String.format("Ingrese el numero de alumnos a calificar.\n");
        int numeroAlumnos = Esdia.readInt(prompNumeroAlumnos);

        Alumno[] alumnos = new Alumno[numeroAlumnos];

        //Recoleccion de datos.
        for (int i=0; i<alumnos.length; i++) {

            alumnos[i] = new Alumno();

            String prompDni = String.format("Ingrese los tres ultimos digitos del DNI del alumno %d a calificar.\n", i+1);
            int dni = Esdia.readInt(prompDni);
            alumnos[i].setDocumento(dni);

            String prompPrimerParcial = String.format("Nota del Primer Parcial del alumno %d.\n", i+1);
            double primerParcial = Esdia.readDouble(prompPrimerParcial);
            alumnos[i].setPrimerParcial(primerParcial);

            String prompSegundoParcial = String.format("Nota del Segundo Parcial del alumno %d.\n", i+1);
            double segundoParcial = Esdia.readDouble(prompSegundoParcial);
            alumnos[i].setSegundoParcial(segundoParcial);
        
            String prompExamenFinal = String.format("Nota del Examen Final del alumno %d.\n", i+1);
            double examenFinal = Esdia.readDouble(prompExamenFinal);
            alumnos[i].setExamenFinal(examenFinal);

            double nota = 0.1*primerParcial + 0.1*segundoParcial + 0.8*examenFinal;
            alumnos[i].setNotaFinal(nota);
        }

        //Imprimacion de la tabla.
        System.out.printf("|" + "-".repeat(73) + "|\n");
        System.out.printf("|   DNI    | Primer Parcial | Segundo Parcial | Examen Final | Nota Final |\n");
        System.out.printf("|" + "-".repeat(73) + "|\n");

       for (int i=0; i<alumnos.length; i++) {
        System.out.printf("| *****%-3d |      %4.2f      |      %4.2f       |     %4.2f     |    %4.2f    |\n", alumnos[i].getDocumento(),alumnos[i].getPrimerParcial(),alumnos[i].getSegundoParcial(),alumnos[i].getExamenFinal(),alumnos[i].getNotaFinal());

       }
       System.out.printf("|" + "-".repeat(73) + "|");

    }
}
