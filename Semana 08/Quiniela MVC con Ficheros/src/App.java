
import controller.QuinielaController;

import model.QuinielaModel;
import view.QuinielaView;

public class App {

    public static void main(String[] args) {
        QuinielaModel model = new QuinielaModel();
        QuinielaView view = new QuinielaView();

        QuinielaController controller = new QuinielaController(view, model);
        controller.init();
    }

}
