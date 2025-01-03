public class Character implements Damageable{

    int health;
    public int getHealth(){
        return health;
    }

    public Character(int health){
        this.health = health;
    }


    @Override
    public void applyDamage(int damagePoints) {
       health = health - damagePoints;
       if (health <= 0) {
        System.out.println("Personaje derrotado.\n");
       } else {
        System.out.printf("Salud restante: %d\n", health);
       }
    }

    Character(){
        super();
    }
}
