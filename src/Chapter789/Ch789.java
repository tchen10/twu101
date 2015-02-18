// Create Orc and Troll classes that implement a Monster interface with takeDamage(int amount), String name(), and
// int currentHitpoints() methods.
// Store instances of both classes and store them in an ArrayList.
// Iterate through the list and make each monster take 10 points of damage.
// After you have damaged all of the monsters, report the name and current hit points of all monsters.
// Orcs are named “Orc” and have 20 initial hitpoints
// Trolls are named “Troll”, have 40 hit points and only take half damage
import java.util.ArrayList;

public class Ch789 {
    public static void main (String[] args ) {
        ArrayList<Monster> monsterList = new ArrayList<Monster>();
        Monster one = new Orc();
        Monster two = new Troll();
        monsterList.add(one);
        monsterList.add(two);

        for (Monster monster : monsterList) {
            monster.takeDamage(10);
        }

        for (Monster monster : monsterList) {
            System.out.print(monster.name() + ": ");
            System.out.println(monster.currentHitpoints() + " Hitpoints");
        }
    }
}

interface Monster {
    public String name();

    public void takeDamage(int amount);

    public int currentHitpoints();
}

class Orc implements Monster{
    private int damage = 0;

    public String name() {
        return "Orc";
    }

    public void takeDamage(int amount)  {
        damage += amount;
    }

    public int currentHitpoints() {
        return 20 - damage;
    }

}

class Troll implements Monster {
    private int damage = 0;

    public String name() {
        return "Troll";
    }

    public void takeDamage(int amount) {
        damage = amount / 2;
    }

    public int currentHitpoints() {
        return 40 - damage;
    }

}