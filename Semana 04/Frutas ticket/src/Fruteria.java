import com.coti.tools.Esdia;
import productos.Productos;

public class Fruteria {
    public static void main(String[] args) throws Exception {
        Productos[] productos = new Productos[2]; //Crea el Array de productos
        /*
        El nombre y el precio con iva del producto va a ser fijo durante toda la ejecucion.
        Definimos primero esos dos atributos.
        */ 
        
    for (int index = 0; index < productos.length; index ++) {
        productos[index] = new Productos(); //Producto instanciado

        //setNombre.
        String prompNombre = String.format("Ingrese el nombre del producto %d: \n", index+1);
        String  nombre = Esdia.readString_ne(prompNombre); // _ne para que la entrada no sea nula
        productos[index].setNombre(nombre);

        //setPrecio
        String prompPrecio = String.format("Ingrese el precio sin iva de %s: \n", productos[index].getNombre());
        double precio = Esdia.readDouble(prompPrecio);
        productos[index].setPriceKg(precio);

    }
    System.out.printf("El producto 1 tiene el nombre " + productos[0].getNombre() + "y el precio con iva de " + productos[0].getPriceKg() + "\n");
    boolean decision = true;
    int totalClientes = 0;
    while (decision == true) {
        //Pregunta si se quiere dejar de hacer tikets
        String prompdice = String.format("Si desea hacer un ticket escriba 1, de lo contrario escriba 0.\n");
        int dice = Esdia.readInt(prompdice, 0, 1);
        if (dice == 0) {
            decision = false;
            break;
        }
    
        //Escritura del tiket.
       totalClientes++;
       for (int index = 0; index < productos.length; index++) {
        String promcantidad = String.format("Introduzca los Kg de " + productos[index].getNombre() + ": \n");
        double cantidad = Esdia.readDouble(promcantidad);
        productos[index].setCantidad(cantidad);
       }

       //Imprimacion del ticket 47.
       String euro = "\u20AC";
       Double totalPrecio = 0.0;
       Double totalTicket = 0.0;
       String cliente = "Cliente";
       System.out.printf("|" + "-".repeat(57) + "|\n" + "| %-49s " + "| %2d  |\n" + "|" + "-".repeat(57) + "|\n",cliente ,totalClientes);


      for (int index = 0; index < productos.length; index++) {
        totalPrecio = productos[index].getPriceKg() * productos[index].getCantidad();
        System.out.printf("| %-11s " + "| %4.2f kg |" +" precio Kg con IVA %5.2f | %5.2f |\n", productos[index].getNombre(),productos[index].getCantidad() , productos[index].getPriceKg(), totalPrecio);
        totalTicket += totalPrecio;
    }
    System.out.printf("|" + "-".repeat(57) + "|\n" + "| Total con IVA %5.2f %s" + " ".repeat(35) +"|\n" + "|" + "-".repeat(57) + "|\n", totalTicket, euro);  

    }

    System.out.printf("El total de clientes de hoy es %d.", totalClientes);

    }
}
