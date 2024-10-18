

import com.coti.tools.Esdia;
import almacen.Almacen;
import autor.Autor;
import libros.Libros;


public class Libreria {
    public static void main(String[] args) throws Exception {
        int ritmoDeLectura = 1;

        String linea2 = "|  2)  Establecer ritmo de lectura. (Pág por min.) |";


        int b = linea2.length(); //Longitud de la linea mas larga de la tabla.
        boolean operador = true;
        int conteoDeLibros = 0;
        int numeroTotalLibros = 0;



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
                numeroTotalLibros = numeroDeLibros;
                }

            if (decision == 2) {
                String prompRitmoLectura = String.format("Indique el ritmo de lectura.\n");
                ritmoDeLectura = Esdia.readInt(prompRitmoLectura);
            }

            if (decision == 3) {

                if (conteoDeLibros >= numeroTotalLibros ) {
                    System.out.println("El almacén está lleno. No se pueden añadir más libros.");
                }else{
                    almacen[conteoDeLibros] = new Libros();
                    conteoDeLibros++;
                    Autor autor = new Autor();

                    System.out.println("Introduzca primero los datos del autor:\n");
                    String promNombre = String.format("Nombre: ");
                    String Nombre = Esdia.readString(promNombre);
                    autor.setNombre(Nombre);
                    String promApellidos = String.format("Apellidos: ");
                    String Apellidos = Esdia.readString(promApellidos);
                    autor.setApellidos(Apellidos);
                    String promPremioPlaneta = String.format("Si tiene premio planeta introduzca 1 de lo contrario introduzca 0: ");
                    int premioPlaneta = Esdia.readInt(promPremioPlaneta,0,1);
                    autor.setPremioPlaneta(premioPlaneta);

                    System.out.println("Introduzca el resto de datos del libro:\n");

                    Libros libro = new Libros();
                    libro.setAutor(autor);  
                    
                    String promTitulo = String.format("Título del libro: ");
                    String titulo = Esdia.readString(promTitulo);
                    libro.setTitulo(titulo);

                    String promAño = String.format("Año de publicación del libro: ");
                    int año = Esdia.readInt(promAño);
                    libro.setAnoPublicacion(año);

                    String promPaginas = String.format("Número de páginas del libro: ");
                    int paginas = Esdia.readInt(promPaginas);
                    libro.setNumDePag(paginas);

                    String promPrecio = String.format("Precio del libro: ");
                    double precio = Esdia.readDouble(promPrecio);
                    libro.setPrecio(precio);

                    almacen[conteoDeLibros -1] = libro;
                
                
                
                }

                    //Faltan programar toda la introduccion de datos.


                };
             
                if (decision == 4 ) {
                
                    for (int i=0; i < conteoDeLibros-1 ; i++) {
                        System.out.printf("| %12s | %-15d | %9s %9s | %14s | %7d | %22d | %6.2 |");
                    }
                    

            }
            
            }




            }



        }
       









