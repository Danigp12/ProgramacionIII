package model;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class PersonasModel {

    private ArrayList<Persona> personas = new ArrayList<>();
    
    private Path rutaPersonas = Paths.get(System.getProperty("user.home"), "Desktop", "datos.txt");

    public void PersonaModel(){
        this.personas = new ArrayList<>();
    }

    public List<String> cargarPersonasFichero() throws Exception{
        List<String> lineas = null;

            try {
        lineas = Files.readAllLines(rutaPersonas); //Lee con UTF_8
        for (String linea : lineas) {
            Persona persona = Persona.getPersonaFromString(linea, "\t");
            if (persona != null) {
                personas.add(persona);
            }
        }
        return lineas;

    } catch (Exception e) {
    throw new Exception(e);
    }

    }

    public List<Persona> getPersonas(){
        return personas;
    }

    public List<String> mostrarTabla() throws Exception{

        cargarPersonasFichero();

        List<String> personasTabla = new ArrayList<>();

        for (Persona persona : personas ) {
        
            String person = persona.getNombre() + "\t" + persona.getTelefono() + "\t" + String.valueOf(persona.getPeso());
            personasTabla.add(person);

        }
        return personasTabla;

    }

    public void guardarPersonasTSV(){

    Path rutaPerson = Paths.get(System.getProperty("user.home"),"Desktop","personas.tsv");
    try(PrintWriter writer = new PrintWriter(rutaPerson.toFile())) {
    
        List<Persona> persona = this.getPersonas();

        for (Persona person : persona) {
        
            String personString = person.getStringFromInstance("\t") + "\n";
            writer.println(personString);

        }
    } catch (Exception e) {
    // TODO: handle exception
}
        }

}
