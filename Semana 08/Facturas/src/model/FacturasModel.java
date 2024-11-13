package model;

import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class FacturasModel {
private ArrayList<Factura> facturas = new ArrayList<>();
//private Path rutaArchivoFactura = Rutas.pathToFileOnDesktop("facturas.txt");
private Path rutaArchivoSinBiblioteca = Paths.get(System.getProperty("user.home"),"Desktop","facturas.tsv");

public void FacturaModel(){
    this.facturas = new ArrayList<>();
}

public int cargarFacturasDesdeFichero() throws Exception{
    List<String> lineas = null;

    try {
        lineas = Files.readAllLines(rutaArchivoSinBiblioteca); //Lee con UTF_8
        int facturasCorrectas = 0;
        for (String linea : lineas) {
            Factura factura = Factura.getFacturaFromString(linea, "\t");
            if (factura != null) {
                facturas.add(factura);
                facturasCorrectas ++;
            }
        }
        return facturasCorrectas;

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




}

