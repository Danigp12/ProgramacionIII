import controller.PersonasController;
import model.PersonasModel;
import view.PersonasView;

public class App {
    public static void main(String[] args) throws Exception {
        PersonasModel model = new PersonasModel();
        PersonasView view = new PersonasView();

        PersonasController controler = new PersonasController(view, model);

        controler.init();

    }
}
