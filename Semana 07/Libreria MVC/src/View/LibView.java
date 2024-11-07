package View;
import com.coti.tools.Esdia;
import Controller.LibController;

public class LibView {
    LibController controller;

    public void showMenu(){
        String linea2 = "|  2)  Establecer ritmo de lectura. (Pág por min.) |";


        int b = linea2.length(); //Longitud de la linea mas larga de la tabla.
        

        boolean salir = true;

        while (salir) {
            System.out.println("\n|" + "-".repeat(b - 2) + "|");
            System.out.printf("| %-" + (b-3) + "s|\n","MIS LIBROS");
            System.out.println("|" + "-".repeat(b - 2) + "|");
            System.out.printf("%-" + (b -1) +"s|\n" + "%s\n","|  1)  Nuevo almacén de libros.", linea2);
            System.out.printf("%-" + (b -1) +"s|\n","|  3)  Añadir un nuevo libro al almacén.");
            System.out.printf("%-" + (b -1) +"s|\n","|  4)  Mostrar información actual de libros.");
            System.out.printf("%-" + (b -1) +"s|\n","|  5)  Salir (Se borrará toda la información)");
            System.out.println("|" + "-".repeat(b - 2) + "|");

        }  int opción = Esdia.readInt("Introduzca una opción.\n");
        switch (opción) {
            case 1:
            nuevoAlmacen();
            break;

            case 2:
            ritmoLectura();
            break;

            case 3:
            nuevoLibro();
            break;

            case 4:
            mostrarLibros();
            break;

            case 5:
            salir=false;
            break;
        
            default:
                break;
        }
    }

nuevoAlmacen(){

    controller.nuevoAlma();
}

public void setController(LibController libController){
    this.controller = libController;
}

public void mostrarLibros(){
    double tiempoTotalLectura = 0;

    System.out.println("|" + "-".repeat(122) + "|");

    System.out.printf("| " + "%-121s" + "|\n", "LIBROS EN EL ALMACÉN");

    System.out.println("|" + "-".repeat(122) + "|");

    System.out.printf("| %-20.20s | %-15s | %15s | %-15s | %7s | %22s |  %6s  |\n", "Título", "Año Publicación", "Autor", "Premio Planeta", "Páginas", "Tiempo Lectura Minutos", "Precio");

    System.out.println("|" + "-".repeat(122) + "|");
   
    for (int i=0; i < conteoDeLibros ; i++) {

        Libros libroImprimir = almacen.tomarLibro(i); 
        Autor infoAutor = libroImprimir.getAutor();
        tiempoTotalLectura += (libroImprimir.getNumDePag()/ritmoDeLectura); /*Irá sumando los tiempos de cada libro. Como medir minutos en decimal no es intuitivo al usar nosotros un sistema sexagesimal para contar el tiempo siempre mostrará un numero entero en tiempos de lectura. */
        
        // \u20AC es el codigo para imprimir el símbolo del Euro € Nota: Mi ordenador no muestra el símbolo en pantalla al ejecutar el programa.
        System.out.printf("| %-20.20s | %-15d | %15.15s | %-15s | %7d | %22d | %6.2f \u20AC |\n", libroImprimir.getTitulo(), libroImprimir.getAnoPublicacion(), infoAutor.getNombre() + " " + infoAutor.getApellidos(), infoAutor.getPremioPlaneta(), libroImprimir.getNumDePag(), libroImprimir.getNumDePag()/ritmoDeLectura, libroImprimir.getPrecio());
    }

    System.out.println("|" + "-".repeat(122) + "|");

    System.out.printf("| %36s %68.0f min |          |\n" , "Tiempo de lectura total del almacén:", tiempoTotalLectura);
    
    System.out.printf("| %24s %93.2f \u20AC |\n", "Valor total del almacén:", precioTotalDeLibros);

    System.out.println("|" + "-".repeat(122) + "|");
}






}
