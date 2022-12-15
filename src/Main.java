import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
    Boss boss = new Boss();
    boss.setHealth(1450);
    boss.setDamage(340);
    boss.setDefence("Magic");
        System.out.println("Boss health: " + boss.getHealth() +
                " Boss damage: " + boss.getDamage() + "Boss defence: " + boss.getDefence());




    }
}