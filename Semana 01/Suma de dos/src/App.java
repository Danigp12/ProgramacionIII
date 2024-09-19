import java.util.Scanner;

public class App {
   public static void main(String[] args)throws Exception{

    Scanner scannerRef = new Scanner(System.in);
    System.out.println( "Escriba un numero entero");
    int primerNumero = scannerRef.nextInt();

    System.out.println( "Escriba un segundo numero entero");
    int segundoNumero = scannerRef.nextInt();

    int suma = primerNumero + segundoNumero;
    System.out.printf( "La suma es:  %d", suma);
    scannerRef.close();
   }
}
