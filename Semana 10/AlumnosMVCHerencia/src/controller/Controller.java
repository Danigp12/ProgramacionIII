package controller;

import model.Alumno;
import model.Model;
import view.BaseView;

public class Controller {
        BaseView view;
        Model m;

        public Controller(BaseView v, Model m){
            this.view = v;
            this.m = m;

            this.view.setController(this);
        }

        public void initApp(){

            //Cargar inicial del programa.
            //Serialización.
            //model.cargarEstadoInicial
            this.view.inicio();
            this.view.ShowMainMenu();
        }

        public boolean agregarAlumno(Alumno alumno){

            return this.m.agregarAlumno();
        }

        public boolean importarAlumnos() throws Exception{
            return this.m.importarAlumnos();
        }


}
