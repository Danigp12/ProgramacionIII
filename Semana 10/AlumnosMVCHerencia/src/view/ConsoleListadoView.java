package view;

import com.coti.tools.Esdia;

public class ConsoleListadoView extends BaseView{

    @Override
    public void inicio() {
            System.out.println("GESTION DE ALUMNOS.");

    }

    @Override
    public void showError() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showError'");
    }

    @Override
    public void ShowMSG() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ShowMSG'");
    }

    @Override
    public void ShowMainMenu() {
        int opcion;
       do{
        System.out.println("1. alumnosImportados");
        System.out.println("2. bajas");
        System.out.println("3. importar");
        System.out.println("4. exportar");
        System.out.println("5. listarAlumnos");
        System.out.println("6. salir");

        opcion = Esdia.readInt("Elija una opción:\n ");

        switch (opcion) {
            case 1:
                agregarAlumno();
                break;

            case 2:
                bajaAlumno();
                break;
        
            case 3:
                importarAlumno();
                break;

            case 4:
;                exportarAlumno()
                break;

             case 5:
                listar();
                break;
            case 6:
                System.out.println("Adiós.");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

       }while(opcion != 6);
    }

    //Definir las opciones

    public void agregarAlumno(){

    }

    public void 




    
    @Override
    public void showMSG(String msg){
        System.err.prinln();
    }

    

}
