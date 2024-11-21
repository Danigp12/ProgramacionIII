
package model;


public class Almacen {
  private Libros[] almacen = new Libros[1];
  
  public Almacen() {
  }

  public Almacen(int numeroDeLibros) {
      this.almacen = new Libros[numeroDeLibros];
  }

  public Libros[] getAlmacen() {
      return almacen;
  }

  public void setAlmacen(int numeroDeLibros) {
      this.almacen = new Libros[numeroDeLibros];
  }

  //Método para agregar un libro nuevo.
  public void agregarLibro(Libros libro) {
      for (int i = 0; i < almacen.length; i++) {
          if (almacen[i] == null) {
              almacen[i] = libro;
              break;
          }
      }
  }

  //Método para tomar un libro de la libreria.
  public Libros tomarLibro(int i){
        return almacen[i];
  }
}
