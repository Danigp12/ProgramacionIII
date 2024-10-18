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
    public void setPremioPlaneta(int premio){
        if (premio == 1) {
            this.premioPlaneta = true;
        }
    }
    public String getPremioPlaneta(){
        if (this.premioPlaneta ==true) {
            return "Sí";
        } else {
            return "No";
        }
    }

}
