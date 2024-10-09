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
        personas[index].setpeso(peso);

        String promptTalla = String.format("Ingrese la talla de la persona %d: \n", index+1);
        double talla = Esdia.readDouble(promptTalla);
        personas[index].settalla(talla);

    }
  //Comparacion para mostrar el de mallor peso;

  double mayor = personas[0].getpeso();
  int index = 0;
  for (int i = 0; i < personas.length; i++) {
    if (mayor < personas[i].getpeso()) {
        mayor = personas[i].getpeso();
        index = i;
  }
  }

System.out.printf("La persona con mayor peso es %s con " + mayor + " Kilos. \n", personas[index].getNombre()); 


        //Ejercicio 3: Calculo del IMC de cada persona introduda IMC = peso/talla^2.
        for (int i = 0; i < personas.length; i++) {
            
            System.out.printf("La IMC de " + personas[i].getNombre() + " es: %.2f \n", personas[i].getImc()); 
        }
    }
}

/*Ejercicio 7: La diferencia principal es que el constructor por defecto
                lo genera java inicializando los atributos de la clase en 
                valores predefinidos como 0.0 para double y el
                constructor sin parametros por el contrario lo define el 
                ususario y puede cambiar los valores en los que se inicializan
                los atributos a su gusto.
*/
/*Ejercicio 8: Al crear una clase, los atributos de la misma se suelen definir 
                con el modificador de visibilidad private que impide acceder al
                atributo desde fuera de la clase. Los getters y setters sirven 
                para obtener y modificar los valores de los atributos definidos
                dentro de una clase como private para protegerlos y evitar problemas
                de seguridad en el programa. Es una cuestión más de seguridad que
                de diseño ya que es necesario proteger ciertos atributos de una clase 
                como el DNI de una persona. 
 */
/*Ejercicio 9: Al definir un atributo de una clase se pueden aplicar modificadores 
                de visibilidad los cuales sirven para proteger los valores de los 
                atributos. Para ello de usan palabras como:
                public: que permite acceder y modificar un atributo desde cualquier parte.

                private: prohibe el acceso directo a los atributos. Solo son visibles
                desde los metodos definidos dentro de la clase (getters y setters).
                
                protected: limita su visibilidad a clases del mismo paquete y a las
                derivadad por herencia de la que se ha declarado el atributo.

                no indicar nada: se podrá usar desde cualquier método de cualquier 
                otra clase que esté dentro del mismo paquete pero si el atributo es
                static, el método de acceso también deberá de ser static.
 */
/*Ejercicio 10: La keyword this se usa dentro de una clase para hacer referencia al
                atributo definido dentro dentro de la misma (se usa: this.atributo).
                la keyword new se usa fuera de la clase para definir un nuevo objeto
                de la misma clase. (se usa: new.nombreDeClase()).
 */
