import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

    
    BuscadorPrimos eratostenes = new BuscadorEratostenes();

    eratostenes.BuscadorPrimos("Eratostenes", 100);
    ArrayList<Integer> primos = eratostenes.calcularPrimos(); 

    for (Integer integer : primos) {
        System.out.println(integer);
    }

}
}
