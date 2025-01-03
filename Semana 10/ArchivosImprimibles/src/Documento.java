public class Documento extends Archivo implements Imprimible, Compartible{

    @Override
    public void compartir(String plataforma) {

        System.out.printf("El documento %s está siendo compartido con %s.\n",name ,plataforma);
    }

    @Override
    public void imprimir() {
        System.out.printf("Documento %s mandado a imprimir.\n", name);
    }

    public Documento(String name, int size){
        super(name, size);
    }

}
