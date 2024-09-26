import com.coti.tools.Esdia;

public class App {
    public static void main(String[] args) throws Exception {
        int numeroDeDatos = Esdia.readInt("Escriba un numero entero entre 0 y 10 \n", 0,10);

        float total = 0;
    for (int i = 1; i<= numeroDeDatos ; i++) {
        String frase = String.format("Escriba el %d numero real: \n", i);
        total = total + Esdia.readFloat(frase);
    }
    float mediaAritmetica = total/numeroDeDatos;
    System.out.printf("La media aritmetica de los datos es %f \n", mediaAritmetica);

    }
}