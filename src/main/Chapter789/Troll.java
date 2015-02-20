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