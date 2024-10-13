package alumno;

public class Alumno {

    private int documento = 0;
    private double primerParcial = 0.0;
    private double segundoParcial = 0.0;
    private double examenFinal = 0.0;
    private double notaFinal = 0.0;

    public double getExamenFinal() {
        return examenFinal;
    }
    public void setExamenFinal(double examenFinal) {
        this.examenFinal = examenFinal;
    }
    public double getPrimerParcial() {
        return primerParcial;
    }
    public void setPrimerParcial(double primerParcial) {
        this.primerParcial = primerParcial;
    }
    public double getSegundoParcial() {
        return segundoParcial;
    }
    public void setSegundoParcial(double segundoParcial) {
        this.segundoParcial = segundoParcial;
    }
    public int getDocumento() {
      return documento;
    }
    public void setDocumento(int documento) {
      this.documento = documento;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }
    public double getNotaFinal() {
        return notaFinal;
    }



}
