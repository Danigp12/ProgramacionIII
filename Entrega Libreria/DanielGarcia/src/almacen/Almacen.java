
package almacen;

import libros.Libros;


public class Almacen {
        private Libros[] almacen = new Libros[1];

  public Libros[] getAlmacen() {
      return almacen;
  }
  public void setAlmacen(int numeroDeLibros) {
      this.almacen = new Libros[numeroDeLibros];
  }
}
