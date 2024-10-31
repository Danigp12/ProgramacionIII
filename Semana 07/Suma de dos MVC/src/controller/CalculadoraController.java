package controller;

import model.CalculadoraModel;
import view.CalculadoraView;

public class CalculadoraController {
    CalculadoraView view;
    CalculadoraModel model;
    
    public CalculadoraController(CalculadoraView view, CalculadoraModel model){
        this.view = view;
        this.model = model;

        this.view.setController(this);
    }

    public void run(){
        this.view.showMenu();
    }

    public void guardarNumeros(int num1, int num2){
        model.setNum1(num1);
        model.setNum2(num2);
    }

    public void calcularSuma(){
        model.sum();
    }

    public int getNum1(){
        return model.getNum1();
    }
    public int getNum2(){
        return model.getNum2();
    }
    public int getResult(){
        return model.getResult();
    }



}
