package Food;

public interface Dinnerware {
    abstract class Cutlery {
        private String dish;
        Cutlery(String dish) {
            this.dish = dish;
        }
        protected String getDishName() {
            return dish;
        }        
        abstract void eat();
    }
    abstract class ServingUtensil {
        private String dish;
        ServingUtensil(String dish) {
            this.dish = dish;
        }
        abstract void serve();
        protected String getDishName() {
            return dish;
        }
    }
    abstract class Drinkware {
        private String dish;
        Drinkware(String dish) {
            this.dish = dish;
        }
        protected String getDishName() {
            return dish;
        }        
        abstract void drink();
    }
}
