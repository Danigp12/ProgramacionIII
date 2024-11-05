import controller.AlmacenController;
import model.AlmacenModel;
import view.AlmacenView;

public class AlmacenVentas {
    public static void main(String[] args) throws Exception {
        System.out.println("Almacenes!!!");

        AlmacenModel model = new AlmacenModel();
        AlmacenView view = new AlmacenView();
        AlmacenController controller = new AlmacenController(view, model);

        controller.run();
    }
}
