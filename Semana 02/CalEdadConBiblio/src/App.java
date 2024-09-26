import com.coti.tools.Esdia;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola, estoy usando la biblioteca de Coti");
        int pruebaInt = Esdia.readInt("Escriba un numero entero \n",18,35);
        System.out.println(pruebaInt);
    }
}
