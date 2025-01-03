import java.util.ArrayList;

public class BuscadorNaive extends BuscadorPrimos {

    

    @Override
    ArrayList<Integer> calcularPrimos() {
       ArrayList<Integer> primos = new ArrayList<>();
       int tope = getLimite();
       
       for(int i=2; i<=tope; i++){
        boolean check = true;
            for(int j=2; j<=(int)(i/2);j++){

                if (i % j == 0) {
                    check = false;
                }
            }
            if (check) {
                primos.add(i);
               }
       }
       
       return primos;
    }



}
