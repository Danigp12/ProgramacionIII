import java.util.ArrayList;

public class BuscadorEratostenes extends BuscadorPrimos{

    @Override
    ArrayList<Integer> calcularPrimos() {

       int n = getLimite();
       ArrayList<Integer> compuestos = new ArrayList<>();
    
       int tope = (int) Math.sqrt(n);
       
       for(int i = 2; i<= tope; i++){
        if (!compuestos.contains(Integer.valueOf(i))) {
            for (int j = i; j <= n / i + 1; j++)
                compuestos.add(Integer.valueOf(i * j));
        }      
         }

         ArrayList<Integer> primos = new ArrayList<>();
         for(int i=2; i<=n; i++){
            primos.add(i);
         }
         for (Integer compuesto : compuestos) {
            if(primos.contains(compuesto)){
                primos.remove(compuesto);
            }
         }

         return primos;
	}

    
    }


