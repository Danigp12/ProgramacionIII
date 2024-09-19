import java.util.Scanner;

public class App {
   public static void main(String[] args)throws Exception{

    Scanner scannerRef = new Scanner(System.in);
    System.out.println( "Escriba un numero entero");
    int primerNumero = scannerRef.nextInt();

    System.out.println( "Escriba un segundo numero entero");
    int segundoNumero = scannerRef.nextInt();

    System.out.println( "Escriba un tercer numero entero");
    int tercerNumero = scannerRef.nextInt();

    int mayor = 0;

        
    if(primerNumero >= segundoNumero){
        mayor = primerNumero;
    }else{
        mayor = segundoNumero;
    }
     if (mayor < tercerNumero) {
        mayor = tercerNumero;
     }
        
     System.out.printf( "El mayor numero es:  %d", mayor);
     scannerRef.close();
    }

   }