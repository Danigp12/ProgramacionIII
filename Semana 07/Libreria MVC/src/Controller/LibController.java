package Controller;
import View.LibView;
import Model.LibModel;


public class LibController {
LibModel model;
LibView view;

public void run(){
    this.view.showMenu();
}

public LibreriaController(LibView view, LibModel model){
    this.view = view;
    this.model = model;

    this.view.setController(this);
}

}
