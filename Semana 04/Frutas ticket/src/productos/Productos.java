package productos;

public class Productos {

        private String nombre = "Null";
        private double priceKg = 0.0;
        private double cantidad = 0.0;
        private double iva = 0.21;
    
        public double getCantidad() {
            return cantidad;
        }
        public void setCantidad(double cantidad) {
            this.cantidad = cantidad;
        }
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public double getPriceKg() {
            return priceKg;
        }
        public void setPriceKg(double priceKg) {
            this.priceKg = priceKg * (1 + iva);
        }
}
