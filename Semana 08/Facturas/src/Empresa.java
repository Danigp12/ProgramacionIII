import java.util.List;

import model.Factura;
import model.FacturasModel;

public class Empresa {
    public static void main(String[] args) throws Exception {
        FacturasModel model = new FacturasModel();

        try {
            int facturasCorrectas = model.cargarFacturasDesdeFichero();
            System.out.printf("Se han guardado %d facturas", facturasCorrectas);
        } catch (Exception e) {
            System.err.println("Error:" + e.getMessage());
        }

        List<Factura> facturas = model.getFacturas();
        for (Factura factura2 : facturas) {
            String facturaString = factura2.getStringFromInstance(",");

        }
        model.guardarFcturasCSV();

    }
}
