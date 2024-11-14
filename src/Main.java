import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args){

        Weapon weapon = new Weapon();
    int attackDamage = weapon.attack();
        System.out.println("Närvskada: " + attackDamage);
    }
}