import java.util.HashMap;
import static com.coti.tools.Esdia.*;
import java.util.Map;
import Coches.Coches;

public class CochesCRUDHashMap {

    private static HashMap<String, Coches> concesionario = new HashMap<>();
    public static void main(String[] args) throws Exception {
        int opcion;
        do{
            System.out.println("\n--- MENU CRUD ---");
            System.out.println("1. Agregar coche");
            System.out.println("2. Eliminar coche");
            System.out.println("3. Modificar coche");
            System.out.println("4. Listar coches");
            System.out.println("5. Salir");
            opcion = readInt("Ingrese una opción: ");

            switch (opcion) {
                case 1:
                    agregarChoche();
                    break;
                case 2:
                    eliminarCoche();
                    break;
                case 3:
                    modificarCoche();
                    break;
                case 4:
                    printarCoches();
                    break;
                case 5:
                    System.out.println("Adiós");
                    break;
            
                default:
                    System.out.println("Opción no válida.");
            }

        
        }while (opcion != 5);
    }

    public static void agregarChoche(){
        String matricula = readString("Escriba la matrícula: ");
        String marca = readString("Escriba la marca: ");
        String modelo = readString("Escriba el modelo: ");
        String color = readString("Escriba el Color: ");
        boolean navegador = yesOrNo("Indique si tiene navegador: ");

            concesionario.put(matricula, new Coches(marca, modelo, color, navegador));

    }

    public static void eliminarCoche(){
        String matricula = readString("Introduzca la matrícula del coche a eliminar:");

        if (concesionario.containsKey(matricula)) {
            concesionario.remove(matricula);
            System.out.println("Coche eliminado.");
        } else {
            System.out.println("Matrícula no encontrada.");
        }
    }

    public static void modificarCoche(){

        String matricula = readString("Introduzca la matrícula del coche a modificar.");

        if (concesionario.containsKey(matricula)) {
            String nuevaMarca = readString("Escriba la nueva marca: ");
            String nuevoModelo = readString("Escriba el nuevo modelo: ");
            String nuevoColor = readString("Escriba el nuevo color: ");
            boolean nuevoNavegador = yesOrNo("Indique si tiene navegador o no:") ;

            Coches nuevoCoche = new Coches(nuevaMarca, nuevoModelo, nuevoColor, nuevoNavegador);

            concesionario.put(matricula, nuevoCoche);

        } else {
            System.out.println("Matrícula no encontrada");
        }
    }

    public static void printarCoches(){

        if (concesionario.isEmpty()) {
            System.out.println("El concesionario está vacío.");
            return;
        }

        for (Map.Entry<String, Coches> entry : concesionario.entrySet()) {
            String matricula = entry.getKey();
            Coches coche = entry.getValue();

            System.out.println(String.format("| Matrícula: %s %s\n", matricula, coche.getCocheComoString()));
        }
    }







}
