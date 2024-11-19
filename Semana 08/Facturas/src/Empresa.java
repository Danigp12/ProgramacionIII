
import controller.FacturasController;
import model.FacturasModel;
import view.FacturasView;

public class Empresa {
    public static void main(String[] args) throws Exception {
        FacturasModel model = new FacturasModel();
        FacturasView view = new FacturasView();

        FacturasController controller = new FacturasController(view, model);


        controller.init();


    }
}
