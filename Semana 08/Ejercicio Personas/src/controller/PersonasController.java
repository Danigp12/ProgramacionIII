package controller;

import java.util.List;

import model.PersonasModel;
import view.PersonasView;

public class PersonasController {



    PersonasModel model;
    PersonasView view;

    public PersonasController(PersonasView view, PersonasModel model){
        this.view = view;
        this.model = model;

        this.view.setController(this);

    }

public List<String> mostrarTabla() throws Exception{
    return model.mostrarTabla();
}

public void guardarPersonasTSV(){
    model.guardarPersonasTSV();
}

public void init() throws Exception{
    view.showMenu();
}


}
