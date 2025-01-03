public class Wall implements Damageable{

    private int durability;
    
    public int getDurability() {
        return durability;
    }


    public Wall(int durability) {
        this.durability = durability;
    }
    
    @Override
    public void applyDamage(int damagePoints) {
       durability = durability - damagePoints;
       if (durability<=0) {
        System.out.println("Muro destruido.\n");
       } else {
        System.out.printf("Resistencia restante: %d\n", durability);
       }
    }
}
