package view;

import java.util.ArrayList;

import com.coti.tools.Esdia;

import controller.LibreriaController;
import model.Autor;
import model.Libros;

public class LibreriaView {

LibreriaController controller;

    public void showMenu(){
    String linea2 = "|  2) Añadir libro al modelo |";


    int b = linea2.length(); //Longitud de la linea mas larga de la tabla.
    
    boolean trigger = true;

    while(trigger){
            //Printa la tabla de opciones
            System.out.println("\n|" + "-".repeat(b - 2) + "|");
            System.out.printf("| %-" + (b-3) + "s|\n","MIS LIBROS");
            System.out.println("|" + "-".repeat(b - 2) + "|");
            System.out.printf("%-" + (b -1) +"s|\n" + "%s\n","|  1)  Mostrar Libros", linea2);
            System.out.printf("%-" + (b -1) +"s|\n","|  3)  Eliminar Libro");
            System.out.printf("%-" + (b -1) +"s|\n","|  4)  Modificar Libro");
            System.out.printf("%-" + (b -1) +"s|\n","|  5)  Exportar Libros CSV.");
            System.out.printf("%-" + (b -1) +"s|\n","|  6) Salir.");

            System.out.println("|" + "-".repeat(b - 2) + "|");

            //Pregunta la decisión.
            int prompDecision = Esdia.readInt("Seleccione una opción (1-6)\n");

            switch (prompDecision) {
                case 1:
                    mostrarLibrosTabla();
                    break;
            
                case 2:
                    añadirLibro();
                    break;

                case 3:
                eliminarLibro();
                break;

                case 4:
                modificarLibro();
                break;
                
                case 5:
                exportarLibrosCSV();
                break;

                case 6:
                trigger = false;
                break;

                default:
                    break;
            }
        }

    }

    //Queda programar las opciones desde la 6 a la 10


    public void mostrarLibrosTabla(){

        ArrayList<Libros> libros = controller.mostrarLibrosTabla();

         double tiempoTotalLectura = 0;
         double precioTotalDeLibros = 0;

                    System.out.println("|" + "-".repeat(122) + "|");

                    System.out.printf("| " + "%-121s" + "|\n", "LIBROS EN EL ALMACÉN");

                    System.out.println("|" + "-".repeat(122) + "|");

                    System.out.printf("| %-20.20s | %-15s | %15s | %-15s | %7s | %22s |  %6s  |\n", "Título", "Año Publicación", "Autor", "Premio Planeta", "Páginas", "Tiempo Lectura Minutos", "Precio");

                    System.out.println("|" + "-".repeat(122) + "|");
                   
                    for (Libros libro: libros) {

                        Autor infoAutor = libro.getAutor();
                        tiempoTotalLectura += (libro.getNumDePag());//ritmoDeLectura); /*Irá sumando los tiempos de cada libro. Como medir minutos en decimal no es intuitivo al usar nosotros un sistema sexagesimal para contar el tiempo siempre mostrará un numero entero en tiempos de lectura. */
                        precioTotalDeLibros += libro.getPrecio();

                        // \u20AC es el codigo para imprimir el símbolo del Euro € Nota: Mi ordenador no muestra el símbolo en pantalla al ejecutar el programa.
                        System.out.printf("| %-20.20s | %-15d | %15.15s | %-15s | %7d | %22d | %6.2f \u20AC |\n", libro.getTitulo(), libro.getAnoPublicacion(), infoAutor.getNombre() + " " + infoAutor.getApellidos(), infoAutor.getPremioPlaneta(), libro.getNumDePag(), libro.getNumDePag(), libro.getPrecio());
                    }

                    System.out.println("|" + "-".repeat(122) + "|");

                    System.out.printf("| %36s %68.0f min |          |\n" , "Tiempo de lectura total del almacén:", tiempoTotalLectura);
                    
                    System.out.printf("| %24s %93.2f \u20AC |\n", "Valor total del almacén:", precioTotalDeLibros);

                    System.out.println("|" + "-".repeat(122) + "|");
    }

    public Libros escribirLibro(){

        Autor autor = new Autor();

                    System.out.println("\nIntroduzca primero los datos del autor:\n");

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
            return libro;
    }

    public void añadirLibro(){
        Libros libro = escribirLibro();
        controller.añadirLibro(libro);

    }

    public void eliminarLibro(){
        ArrayList<Libros> libros = controller.mostrarLibrosTabla();
        int numero = 0;

        for (Libros libro : libros) {

            System.out.println(numero + ")  " + libro.getTitulo());
            numero++;
        }

        int posicion = Esdia.readInt("Introduzca la posición del libro a eliminar.\n",0, libros.size());

        controller.eliminarLibro(posicion);
    }

    public void modificarLibro(){
        ArrayList<Libros> libros = controller.mostrarLibrosTabla();
        int numero = 0;

        for (Libros libro : libros) {

            System.out.println(numero + ")  " + libro.getTitulo());
            numero++;
        }

        int posicion = Esdia.readInt("Introduzca la posición del libro a modificar.\n",0, libros.size());

        Libros libro = escribirLibro();

        controller.modificarLibro(libro, posicion);
    }

    public void exportarLibrosCSV(){
        controller.exportarLibrosCSV();
    }

    public void setController(LibreriaController controller){
        this.controller = controller;   
    }
}
