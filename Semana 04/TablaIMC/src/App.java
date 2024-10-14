import com.coti.tools.Esdia;
import java.lang.Math;

import usuario.Usuario;
public class App {
    public static void main(String[] args) throws Exception {

        String prompNumeroUsuarios = String.format("Introduzca el numero de usuarios a datar.\n");
        int numeroUsuarios = Esdia.readInt(prompNumeroUsuarios);
        Usuario[] usuarios = new Usuario[numeroUsuarios];

        for (int i=0; i<usuarios.length; i++) {
            usuarios[i] = new Usuario();
            
            String promNombre = String.format("Introduzca el nombre del usuario %d\n", i+1);
            String nombre = Esdia.readString(promNombre);
            usuarios[i].setNombre(nombre);

            String promPeso = String.format("Introduzca el peso en Kg del usuario %d\n", i+1);
            double peso = Esdia.readDouble(promPeso);
            usuarios[i].setPeso(peso);

            String promTalla = String.format("Introduzca la talla en Metros del usuario %d\n", i+1);
            double talla = Esdia.readDouble(promTalla);
            usuarios[i].setTalla(talla);

            double iMC = peso / Math.pow(talla, 2);
            usuarios[i].setiMC(iMC);     
        }

        System.out.printf("|" + "-".repeat(52) + "|\n");
        System.out.printf("|     Nombre     |  Peso Kg  |  Talla M  |    IMC    |\n");
        System.out.printf("|" + "-".repeat(52) + "|\n");

        for (int i = 0; i < usuarios.length; i++) {
    
    System.out.printf("| %-14s |   %6.2f  |   %5.2f   |   %5.2f   |\n", usuarios[i].getNombre(),usuarios[i].getPeso(),usuarios[i].getTalla(),usuarios[i].getiMC());
}

System.out.printf("|" + "-".repeat(52) + "|\n");
    }
}
