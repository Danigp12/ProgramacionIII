import java.util.Arrays;
import com.coti.tools.Esdia;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Argumentos: " + Arrays.toString(args));

        if (args.length == 2) {
            double suma = Double.parseDouble(args[0])+ Double.parseDouble(args[1]);
            double tercerNumero = Esdia.readDouble("numero \n");
            suma += tercerNumero;

            System.out.println(suma);  
        }else{
            System.out.println("No hay suficientes argumentos para la suma.");
        }

    }
}
