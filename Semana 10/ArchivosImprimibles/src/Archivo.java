public abstract class Archivo {
    String name;
    int size;
    
    public Archivo(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
    
    public Archivo(){
        super();
    }

}
