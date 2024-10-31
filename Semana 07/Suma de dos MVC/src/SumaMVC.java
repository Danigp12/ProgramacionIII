import controller.CalculadoraController;
import model.CalculadoraModel;
import view.CalculadoraView;

public class SumaMVC {

    public static void main(String[] args) throws Exception {
        System.out.println("CALCULADORA!!");

        CalculadoraModel model = new CalculadoraModel();
        CalculadoraView view = new CalculadoraView();
        CalculadoraController controller = new CalculadoraController(view, model);

        controller.run();
    }
}
