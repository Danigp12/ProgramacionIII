public class Imagen extends Archivo implements Compartible {

    @Override
    public void compartir(String plataforma) {
        System.out.printf("La imagen %s está siendo compartida con %s.\n", name,plataforma);

    }
    public Imagen(String name, int size){
        super(name, size);
    }

}
