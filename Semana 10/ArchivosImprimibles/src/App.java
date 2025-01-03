import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

    ArrayList<Archivo> archivos = new ArrayList<>();
    archivos.add(new Documento("Trabajo", 2000));
    archivos.add(new Imagen("Playa", 100));
    archivos.add(new APK("Plants vs Zombies", 20000));

    for (Archivo archivo : archivos) {
        boolean check = false;
        if(archivo instanceof Imprimible){
            ((Imprimible) archivo).imprimir();
        }else{
            check = true;
        }
        if (archivo instanceof Compartible) {
            ((Compartible) archivo).compartir("WhatsApp");
        } else {
            check = true;
        }
        if (check) {
            System.out.printf("El archivo %s no es ni Imprimible ni Compartible.\n", archivo.getName());
        }

    }



    }
}
