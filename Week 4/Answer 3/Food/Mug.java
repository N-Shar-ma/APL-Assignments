package Food;

public class Mug extends Dinnerware.Drinkware {
    public Mug(String dish) {
        super(dish);
    }
    public void drink() {
        System.out.println("Drinking " + getDishName() + " from a mug");
    }
}
