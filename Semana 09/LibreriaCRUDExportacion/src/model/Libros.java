package model;

public class Libros {

    private Autor autor = new Autor();
    private String titulo = "";
    private int anoPublicacion = 0;
    private int numDePag = 0;
    private double precio = 0;

    public int getAnoPublicacion() {
        return anoPublicacion;
    }
    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }
    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public int getNumDePag() {
        return numDePag;
    }
    public void setNumDePag(int numDePag) {
        this.numDePag = numDePag;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getStringFromInstance(Libros libro, String delimitador){
        Autor autor = libro.getAutor();

        String cadena = libro.getTitulo() + delimitador + libro.getAnoPublicacion() + delimitador + autor.getNombre() + delimitador + autor.getApellidos()
                         + delimitador + autor.getPremioPlaneta() + delimitador + libro.getNumDePag() + delimitador + libro.getPrecio();

        return cadena;
    }

}