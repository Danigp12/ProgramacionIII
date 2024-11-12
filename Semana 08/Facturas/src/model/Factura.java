package model;

public class Factura {
    private String concepto;
    private double desscuento;
    private String fecha;
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
    public double getDesscuento() {
        return desscuento;
    }
    public void setDesscuento(double desscuento) {
        this.desscuento = desscuento;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
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
    
}
