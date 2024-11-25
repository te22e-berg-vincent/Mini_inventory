import java.util.ArrayList;

public class Inventory {
    ArrayList<Item> items;

    public void Display() {
        System.out.println("Nuvarande föremål är:");
        for (Item item : items) {
            System.out.println(item.name);
        }
    }
}