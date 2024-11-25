public class Consumable extends Item {
    public int useMax = 0;
    public int useCurrent = 0;

    public Consumable(int useMax, String name) {
        this.useMax = useMax;
        this.name = name;
    }

    public void use(Character target) {
        if (useCurrent < useMax) {
            System.out.println(target.name + " använder " + this.name);
            target.hp += 10;
            useCurrent--;
        }
    }
}
