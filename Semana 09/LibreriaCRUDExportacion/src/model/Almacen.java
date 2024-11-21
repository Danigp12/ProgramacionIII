
package model;

import java.util.ArrayList;

public class Almacen {
  private ArrayList<Libros> almacen = new ArrayList<>(); 
  

/* 
  public Almacen(int numeroDeLibros) {
      this.almacen = new Libros[numeroDeLibros];
  }
*/
  public ArrayList<Libros> getAlmacen() {
      return almacen;
  }

  public void setAlmacen(int numeroDeLibros) {
      this.almacen = new ArrayList<>();;
  }

  //Método para agregar un libro nuevo.
  public void agregarLibro(Libros libro) { 
      this.almacen.add(libro);
  }

  //Método para tomar un libro de la libreria.
  public Libros tomarLibro(int i){
        return almacen.get(i);
  }

  public void eliminarLibro(int posicion){
    this.almacen.remove(posicion);
  }
public void modificarLibro(Libros libro, int posicion){
  this.almacen.set(posicion, libro);
}
}
