import com.coti.tools.Esdia;


public class App {
    public static void main(String[] args) throws Exception {
String name = Esdia.readString("Introduzca su nombre \n");
String surname = Esdia.readString("Introduzca su apellido \n");
String nombre = "Nombre";
String apellido = "Apellido";

int a = nombre.length();
int b = apellido.length();

for(int i=0; i<=a+b+10;i++)
{
  System.out.printf("*");
}

System.err.println("\n* Nombre    * Apellido  *");
for(int i=0; i<=a+b+10;i++)
{
  System.out.printf("*");
}
System.out.printf("\n* %s  * %s  *\n",name,surname);
 
for(int i=0; i<=a+b+10;i++)
{
  System.out.printf("*");
}
}
}
