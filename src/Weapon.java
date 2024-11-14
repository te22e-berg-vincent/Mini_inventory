import java.util.Random;

public class Weapon extends Item{
    public int minDamage = 10;
    public int maxDamage = 100;

    public int attack(){
        return (int) (Math.random() *(maxDamage - minDamage)) + minDamage;

    }
}
