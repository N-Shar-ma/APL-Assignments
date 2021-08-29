import Food.*;

public class W4A3Driver {
    public static void main(String[] args) {
        String toEat = "pasta";
        String toDrink = "soup";
        PotsForAMeal pots = new PotsForAMeal(toEat, toDrink);
        pots.serve(); 
        Fork myFork = new Fork(toEat);
        myFork.eat();
        Mug myMug = new Mug(toDrink);
        myMug.drink();        
    }
}

// Output

// Served pasta from a wok
// Served soup from a wok
// Eating pasta with a fork
// Drinking soup from a mug