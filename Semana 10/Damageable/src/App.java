import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Damageable> objetos = new ArrayList<>();
    
        objetos.add(new Wall(500));
        objetos.add(new Character(300));
        objetos.add(new Knight(400));

        for (Damageable damageable : objetos) {
            damageable.applyDamage(100);
        }
    
    }
}
