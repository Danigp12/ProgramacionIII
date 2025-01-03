import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

    
    BuscadorPrimos eratostenes = new BuscadorEratostenes();
    BuscadorPrimos naive = new BuscadorNaive();
    int limite = 100000; //A partir del límite de 100000 estos métodos son demasiado ineficientes y tarda en encontrar los primos.
        
    naive.setNombre("Naive");
    naive.setLimite(limite);
    eratostenes.setNombre("Eratostenes");
    eratostenes.setLimite(limite);

   ArrayList<BuscadorPrimos> buscadores = new ArrayList<>();
   buscadores.add(naive);
   buscadores.add(eratostenes);
   for (BuscadorPrimos buscador : buscadores) {
        buscador.calcular();
        System.out.printf(" El Buscador %s ha tardado %d milisegundos en encontrar %d primos hasta el número %d. \n", buscador.getNombre(),buscador.getTiempoRequerido(),buscador.getCantidadpPrimos(),buscador.getLimite());
   }


}
}
