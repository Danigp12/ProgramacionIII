package view;
import com.coti.tools.Esdia;

import controller.CalculadoraController;

public class CalculadoraView {
    CalculadoraController controller;

     public void showMenu(){

        boolean salir = true;

        while (salir) {
            System.out.println("1.- Leer los números.");
            System.out.println("2.- Sumar los números.");
            System.out.println("3.- Mostrar Resultado.");
            System.out.println("4.- Salir.");
            int opción = Esdia.readInt("Introduzca una opción.\n");
            switch (opción) {
                case 1:
                leerNumeros();
                break;

                case 2:
                sumarNumeros();
                break;

                case 3:
                mostrarResultado();
                break;

                case 4:
                salir=false;
                break;
            
                default:
                    break;
            }

        }

     }
     private void leerNumeros(){
        int num1 = Esdia.readInt("Introduzca el primer número: ");
        int num2 = Esdia.readInt("Introduzca el segundo número: ");

        controller.guardarNumeros(num1, num2);
    }
     private void sumarNumeros(){
        controller.calcularSuma();
     }
     private void mostrarResultado(){
        System.out.println("Número 1:" + controller.getNum1());
        System.out.println("Número 2:" + controller.getNum2());
        System.out.println("Resultado:" + controller.getResult());

     }
     public void setController(CalculadoraController calculadoraController){
        this.controller = calculadoraController;
     }



}
