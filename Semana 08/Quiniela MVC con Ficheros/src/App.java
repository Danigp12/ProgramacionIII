
import controller.QuinielaController;


import model.QuinielaModel;
import view.QuinielaView;

public class App {


    QuinielaModel model = new QuinielaModel();
    QuinielaView view = new QuinielaView();

    QuinielaController controller = new QuinielaController(view, model);

    controller.run();


}

