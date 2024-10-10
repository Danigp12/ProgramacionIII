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
    System.out.printf("El producto 1 tiene el nombre " + productos[0].getNombre() + "y el precio con iva de " + productos[0].getPriceKg());
    boolean decision = true;
    int totalClientes = 0;
    while (decision == true) {
        //Pregunta si se quiere dejar de hacer tikets
        String prompdice = String.format("Si desea hacer otro ticket escriba 1, de lo contrario escriba 0.\n");
        int dice = Esdia.readInt(prompdice, 0, 1);
        if (dice == 0) {
            decision = false;
        }
    
        //Escritura del tiket.
       totalClientes++;
       for (int index = 0; index < productos.length; index++) {
        String promcantidad = String.format("Introduzca los Kg de " + productos[index].getNombre() + ": \n");
        double cantidad = Esdia.readDouble(promcantidad);
        productos[index].setCantidad(cantidad);
       }
       System.out.println("El precio de compra de las manzanas es: " + productos[0].getCantidad()*productos[0].getPriceKg());




    }



    }
}
