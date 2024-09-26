import java.io.Console;
import java.time.LocalDate;

public class CalEdadMenosCodigo {
    public static void main(String[] args) throws Exception {
        Console consoleRef = System.console();
       
        int anioActual = LocalDate.now().getYear();
        System.out.printf("Estamos en %d \n",anioActual);

        String anioNacimiento = consoleRef.readLine("Escriba el año de nacimiento \n");

        int edad = anioActual - Integer.parseInt(anioNacimiento);
        System.out.printf("Su edad es: %d \n", edad);
    }
}
