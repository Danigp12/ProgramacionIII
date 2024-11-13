package model;

import java.util.Locale;

public class Factura {
    private String concepto;
    private double descuento;
    private String fecha;
    private double importe;
    private String nIF;
    private String nombreCliente;
    private String direccion;
    private double iVA;
    
    public String getConcepto() {
        return concepto;
    }
    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
    public double getDescuento() {
        return descuento;
    }
    public void setDescuento(double desscuento) {
        this.descuento = desscuento;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public double getImporte() {
        return importe;
    }
    public void setImporte(double importe) {
        this.importe = importe;
    }
    public String getnIF() {
        return nIF;
    }
    public void setnIF(String nIF) {
        this.nIF = nIF;
    }
    public String getNombreCliente() {
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public double getiVA() {
        return iVA;
    }
    public void setiVA(double iVA) {
        this.iVA = iVA;
    }


    //concepto \t descuento
    public static Factura getFacturaFromString(String facturaString, String delimitador){
        try {
            String[] datos = facturaString.split(delimitador);
            if(datos.length == 8){
                String concepto = datos[0];
                double descuento = Double.parseDouble(datos[1]);
                String fecha = datos[2];
                double importe = Double.parseDouble(datos[3]);
                String nIF = datos[4];
                String nombre = datos[5];
                String direccion = datos[6];
                double iVA = Double.parseDouble(datos[7]);

                Factura factura = new Factura(concepto, descuento, fecha, importe, nIF, nombre, direccion, iVA);
                
                return factura;

            }else{
                return null;
            }

        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            return null;
        }
    }
    public Factura(String concepto, double descuento, String fecha, double importe, String nIF, String nombreCliente,
            String direccion, double iVA) {
        this.concepto = concepto;
        this.descuento = descuento;
        this.fecha = fecha;
        this.importe = importe;
        this.nIF = nIF;
        this.nombreCliente = nombreCliente;
        this.direccion = direccion;
        this.iVA = iVA;
    }
    
    public String getStringFromInstance(String delimitador){

        String fields ="%s" + delimitador + "%f" + delimitador + "%s" + delimitador + "%f" + delimitador + "%s" + delimitador + "s"+ delimitador + "s"+ delimitador + "f";
        return String.format(Locale.ENGLISH, fields, concepto, descuento, fecha, importe, nIF, nombreCliente, direccion, iVA);
    } 
    
}
