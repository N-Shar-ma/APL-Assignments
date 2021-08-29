package Food;

public class PotsForAMeal {   
    Wok wok1;
    Wok wok2;

    public PotsForAMeal(String dish1, String dish2) {
        wok1 = new Wok(dish1);
        wok2 = new Wok(dish2);
    }

    public void serve() {
        wok1.serve();
        wok2.serve();
    }
    
    private class Wok extends Pot {
        private Wok(String dish) {
            super(dish);
        }
        public void serve() {
            System.out.println("Served " + getDishName() + " from a wok");
        }
    }
    
    protected class Pot extends Dinnerware.ServingUtensil {
        public Pot(String dish) {
            super(dish);
        }
        public void serve() {
            System.out.println("Served " + getDishName() + " from a pot");
        }
    }
}
