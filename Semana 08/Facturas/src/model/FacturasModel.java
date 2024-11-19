package model;

import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import model.Factura;

public class FacturasModel {

private ArrayList<Factura> facturas = new ArrayList<>();
//private Path rutaArchivoFactura = Rutas.pathToFileOnDesktop("facturas.txt");
private Path rutaArchivoSinBiblioteca = Paths.get(System.getProperty("user.home"),"Desktop","facturas.tsv");

public void FacturaModel(){
    this.facturas = new ArrayList<>();
}

public List<String> cargarFacturasDesdeFichero() throws Exception{
    List<String> lineas = null;

    try {
        lineas = Files.readAllLines(rutaArchivoSinBiblioteca); //Lee con UTF_8
        for (String linea : lineas) {
            Factura factura = Factura.getFacturaFromString(linea, "\t");
            if (factura != null) {
                facturas.add(factura);
            }
        }
        return lineas;

    } catch (Exception e) {
    throw new Exception(e);
    }



}

public void guardarFcturasCSV(){

    Path rutaArchivoSinBibliotec = Paths.get(System.getProperty("user.home"),"Desktop","facturas.csv");
    try(PrintWriter writer = new PrintWriter(rutaArchivoSinBibliotec.toFile())) {
    
        List<Factura> facturas = this.getFacturas();

        for (Factura factura : facturas) {
        
            String facturaString = factura.getStringFromInstance(",");
            System.out.println(facturaString);
            writer.println(facturaString);

        }
        System.out.println(rutaArchivoSinBibliotec);
    } catch (Exception e) {
    // TODO: handle exception
}
        }



public List<Factura> getFacturas() {
    return facturas;
}

public void guardarFcturasHTML(){

    Path rutaArchivoSinBibliotec = Paths.get(System.getProperty("user.home"),"Desktop","factura.html");
    try(PrintWriter writer = new PrintWriter(rutaArchivoSinBibliotec.toFile())) {
    
        List<Factura> facturas = this.getFacturas();

        for (Factura factura : facturas) {
        
            String facturaString = factura.getStringFromInstance(" ") + "\n";
            System.out.println(facturaString);
            writer.println(facturaString);

        }
        System.out.println(rutaArchivoSinBibliotec);
    } catch (Exception e) {
    // TODO: handle exception
}
        }

        public List<String> valorMin(double valor) throws Exception{

            List<String> facturas = cargarFacturasDesdeFichero();

            List<String> facturasMinimas = new ArrayList<>();

            //Transforma ell string en un objeto de tipo Factura para calcular el importe total y compararlo con el minimo
            for (String string : facturas) {

                Factura tiket = Factura.getFacturaFromString(string, " ");

                double importe = tiket.getImporte();
                double descuento = tiket.getDescuento();
                double iVA = tiket.getiVA();

                double total = importe * (1-descuento) * (1+ iVA);

                //Si el importe supera el minimo se añade a la lista filtrada.
                if (total >= valor) {
                    facturasMinimas.add(string);

                }              
            }

            return facturasMinimas;
        }

}

