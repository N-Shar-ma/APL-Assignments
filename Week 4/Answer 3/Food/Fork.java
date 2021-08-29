package Food;

public class Fork extends Dinnerware.Cutlery {
    public Fork(String dish) {
        super(dish);
    }
    public void eat() {
        System.out.println("Eating " + getDishName() + " with a fork");
    }
}
