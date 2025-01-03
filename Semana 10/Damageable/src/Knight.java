public class Knight extends Character{
    @Override
    public void applyDamage(int damagePoints) {
       health = health - (int)(0.9 * damagePoints);
       if (health <= 0) {
        System.out.println("Caballero derrotado.\n");
       } else {
        System.out.printf("Salud restante: %d\n", health);
       }
    }
    public Knight(int health){
        this.health = health;
    }
}
