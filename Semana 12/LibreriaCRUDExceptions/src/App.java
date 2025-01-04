import controller.LibreriaController;
import model.LibreriaModel;
import view.LibreriaView;

public class App {
    public static void main(String[] args) throws Exception {
        LibreriaModel model = new LibreriaModel();
        LibreriaView view = new LibreriaView();

        LibreriaController controller = new LibreriaController(view, model);

        controller.init();

    }
}
