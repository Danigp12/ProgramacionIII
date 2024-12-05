package view;

import controller.Controller;

public abstract class BaseView {

    protected Controller c;    

public void setController(Controller c){
    this.c = c;
}


public abstract void inicio();
public abstract void showError();
public abstract void ShowMSG();
public abstract void ShowMainMenu();
}
