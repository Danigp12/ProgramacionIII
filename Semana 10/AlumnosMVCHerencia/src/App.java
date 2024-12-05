import controller.Controller;
import model.CSVRepository;
import model.Model;
import model.PersistenceRepository;
import view.BaseView;
import view.ConsoleListadoView;

public class App {
    public static void main(String[] args) throws Exception {

        if(args[0].equals("lista")){
            BaseView view = new ConsoleListadoView();
        }else{
            BaseView view = new ConsoleListadoView();
        }

        BaseView view = getOptionForView(args[0]);
        PersistenceRepository repository = new CSVRepository();

        Model model = new Model(repository);

        Controller controller = new Controller(view, model);
        controller.initApp();

    }

    private static BaseView getOptionForView(String argumento){
        switch (argumento) {
            case "listado":
                return new ConsoleListadoView();
                
                break;
            
            case "voice":
            //return new VoiceView.

            case "cli":
            //return new CLIView.
        
            default:
                break;
        }
    }
}
