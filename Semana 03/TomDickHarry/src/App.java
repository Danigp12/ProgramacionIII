import com.coti.tools.Esdia;

import datos.Persona;

public class App {
    public static void main(String[] args) throws Exception {
    
        //Pregunta el numero n de personas por si se quieren comparar mas de tres personas.
        int num = Esdia.readInt("Ingrese el numero de personas con las que trabaja: \n",1,4);

    Persona[] personas = new Persona[num]; //Crea la lista de n posiciones.

    for (int index = 0; index < personas.length; index++) {
        personas[index] = new Persona(); //persona instanciada (activa)

        String promptNombre = String.format("Ingrese el nombre de la persona %d: \n", index+1);
        String nombre = Esdia.readString_ne(promptNombre); // _ne hace que la entrada no pueda ser nula.
        personas[index].setNombre(nombre);

        //String.format es lo mismo que printf.
        String promptPeso = String.format("Ingrese el peso de la persona %d: \n", index+1);
        double peso = Esdia.readDouble(promptPeso);
        personas[index].setPeso(peso);

        String promptTalla = String.format("Ingrese la talla de la persona %d: \n", index+1);
        double talla = Esdia.readDouble(promptTalla);
        personas[index].setTalla(talla);

    }
  //Comparacion para mostrar el de mallor peso;

  double mayor = personas[0].getPeso();
  int index = 0;
  for (int i = 0; i < personas.length; i++) {
    if (mayor < personas[i].getPeso()) {
        mayor = personas[i].getPeso();
        index = i;
  }
  }

System.out.printf("La persona con mayor peso es %s con " + mayor + " Kilos.", personas[index].getNombre()); 

    }
}
