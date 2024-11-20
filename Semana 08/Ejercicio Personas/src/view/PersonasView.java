package view;

import java.util.List;

import com.coti.tools.Esdia;

import controller.PersonasController;

public class PersonasView {

    PersonasController controller; 
public void setController(PersonasController controller){
    this.controller = controller;
}


public void showMenu() throws Exception{

boolean trigger = true;

while (trigger) {

    System.out.println("Menu de opciones.");
    System.out.println("1) Importar datos a TSV.");
    System.out.println("2) Mostrar datos en tabla.");
    System.out.println("3) Salir.\n");

    int opcion = Esdia.readInt("Seleccione una opción.");

    switch (opcion) {
        case 1:
            guardarPersonasTSV();;
            break;
        case 2: 
            mostrarTabla();

        case 3:
        trigger = false;
        break;
    
        default:
            break;
    }


}

}

public void mostrarTabla() throws Exception{
    List<String> tabla = controller.mostrarTabla();

    System.out.println("Tabla de Personas:\n");

    for (String string : tabla) {
        System.out.printf("%s\n", string);
    }

}

public void guardarPersonasTSV(){
    controller.guardarPersonasTSV();
}




}
