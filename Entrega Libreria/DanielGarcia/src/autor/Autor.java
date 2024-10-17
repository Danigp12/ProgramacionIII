package autor;

public class Autor {
    private String nombre = "";
    private String apellidos = "";
    private boolean premioPlaneta = false;

    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPremioPlaneta(boolean premio){
        this.premioPlaneta = premio;
    }
    public boolean getPremioPlaneta(){
        return premioPlaneta;
    }

}
