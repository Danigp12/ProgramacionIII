import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        //Ejercicio 1. Usar las customExceptions.

        try {
            int a = 2;
            int b = 0;
            if(b ==0){
                throw new MyCustomCheckedException("El divisor no puede ser 0.");
            }
            double cociente = a/b;
            System.out.println(cociente);
        } catch (MyCustomCheckedException e) {
            System.out.println("Error: " + e.getMessage());
        }

        int a = 2;
        int b = 0;
        double cociente = 0;
        try{
            cociente = (double) a/b;
            System.out.println(cociente);
        } catch (MyCustomUncheckedException e) {
            System.out.println("Error aritmético: " + e.getMessage());
        }

        
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(2);
        try{
            if(ints.size()<3){
                throw new MyCustomCheckedException("Index our of bounds.");
            }
            ints.get(2);
        }catch(MyCustomCheckedException e){
            System.out.println("Error: " + e);
        }
        System.out.println(2+2);

        //Ejercicio 2: Vamos a usar la clase Persona para crearla de manera errónea y lanzar un mensaje de error.


    
    }
}
