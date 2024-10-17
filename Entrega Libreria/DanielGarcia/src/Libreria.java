import com.coti.tools.Esdia;
import almacen.Almacen;


public class Libreria {
    public static void main(String[] args) throws Exception {
        int ritmoDeLectura = 1;

        String linea2 = "|  2)  Establecer ritmo de lectura. (Pág por min.) |";


        int b = linea2.length(); //Longitud de la linea mas larga de la tabla.
        boolean operador = true;
        int conteoDeLibros = 0;

        while(operador){
            String misLibros = "MIS LIBROS";
            System.out.println("|" + "-".repeat(b - 2) + "|");
            System.out.printf("| %-" + (b-3) + "s|\n",misLibros);
            System.out.println("|" + "-".repeat(b - 2) + "|");
            System.out.printf("%-" + (b -1) +"s|\n" + "%s\n","|  1)  Nuevo almacén de libros.", linea2);
            System.out.printf("%-" + (b -1) +"s|\n","|  3)  Añadir un nuevo libro al almacén.");
            System.out.printf("%-" + (b -1) +"s|\n","|  4)  Mostrar información actual de libros.");
            System.out.printf("%-" + (b -1) +"s|\n","|  5)  Salir (Se borrará toda la información)");
            System.out.println("|" + "-".repeat(b - 2) + "|");


            String prompDecision = String.format("Seleccione una opción (1-5)\n");
            int decision = Esdia.readInt(prompDecision,1,5);
            
            if (decision == 5) {
                operador = false;
            }

            if (decision == 1) {
                String prompNumeroDeLibros = String.format("Indique el número de libros que desea introducir.\n");
                int numeroDeLibros = Esdia.readInt(prompNumeroDeLibros);
                Almacen almacen = new Almacen();
                almacen.setAlmacen(numeroDeLibros);
                conteoDeLibros = 0;
                }

            if (decision == 2) {
                String prompRitmoLectura = String.format("Indique el ritmo de lectura.\n");
                ritmoDeLectura = Esdia.readInt(prompRitmoLectura);
            }

            if (decision == 3) {

                if (conteoDeLibros > numeroDeLibros ) /*No se por qué no puedo comparar las dos variables*/{
                    System.out.println("El almacén está lleno. No se pueden añadir más libros.");
                }else{
                    conteoDeLibros++;
                    System.out.println("Introduzca primero los datos del autor:\n");
                    String promNombre = String.format("Nombre: ");
                    String Nombre = Esdia.readString(promNombre);
                    //Faltan programar toda la introduccion de datos.


                };
             
            }
            if (decision == 4 ) {
                
                
            }




            }



        }
       








    }


