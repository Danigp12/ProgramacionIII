
package usuario;

public class Usuario {

        private String nombre = "";
        private double talla = 0.0;
        private double peso = 0.0;
        private double iMC = 0.0;

        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public double getPeso() {
            return peso;
        }
        public void setPeso(double peso) {
            this.peso = peso;
        }
        public double getTalla() {
            return talla;
        }
        public void setTalla(double talla) {
            this.talla = talla;
        }
        public double getiMC() {
            return iMC;
        }
        public void setiMC(double iMC) {
            this.iMC = iMC;
        }


}

