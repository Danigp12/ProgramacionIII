public class Knight extends Character{
    @Override
    public void applyDamage(int damagePoints) {
       health = health - (int)(0.1 * damagePoints);
       if (health <= 0) {
        System.out.println("Muro destruido.\n");
       } else {
        System.out.printf("Resistencia restante: %d\n", health);
       }
    }
    public Knight(int health){
        this.health = health;
    }
}
