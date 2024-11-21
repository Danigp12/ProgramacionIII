
import controller.ListController;
import model.ListaModel;
import view.ListaView;

public class App {
    public static void main(String[] args) throws Exception {
        ListaView view = new ListaView();
        ListaModel model = new ListaModel();

        ListController controller = new ListController(view, model);

        controller.init();

}
}
