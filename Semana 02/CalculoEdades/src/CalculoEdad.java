import java.util.Scanner;

public class CalculoEdad {
    public static void main(String[] args) throws Exception {
        Scanner scannRef = new Scanner(System.in);
        System.out.println("Escriba el año actual");
        int anioActual = scannRef.nextInt();

        System.out.println("Escriba el año de nacimiento");
        int anioNacimiento = scannRef.nextInt();

        int edad = anioActual - anioNacimiento;

        System.out.printf("Su edad es: %d \n", edad);
        scannRef.close();
    }
}
