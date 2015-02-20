public class Orc implements Monster{
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