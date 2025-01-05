public class Persona {
    private int identidier;
    private String nombre;
    public int getIdentidier() {
        return identidier;
    }
    public void setIdentidier(int identidier) {
        this.identidier = identidier;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona(int identidier, String nombre) {
       try{

        if(identidier <= 0){
            throw new PersonException("El identificador no puede ser negativo " + identidier);
        }
        this.identidier = identidier;
        this.nombre = nombre;
       }catch(PersonException e){
        System.out.println("Error: " + e.getMessage());
       }
       
        
    }
    

}
