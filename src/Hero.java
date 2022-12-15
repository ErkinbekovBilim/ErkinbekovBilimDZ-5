public class Hero {
    private int health;
    private int damage;
    private String ability;


    public Hero(int health, int damage, String ability) {
        this.health = health;
        this.damage = damage;
        this.ability = ability;
    }
    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public String getAbility() {
        return ability;
    }

    public int getHealth(){
        return this.health;

    }

}
