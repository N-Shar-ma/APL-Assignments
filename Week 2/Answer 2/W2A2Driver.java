public class W2A2Driver {
    public static void main(String[] args) {
        ReadOnly gettable = new ReadOnly(5);
        System.out.println("The read only value is read as: " + gettable.getToGet());        
        WriteOnly settable = new WriteOnly(5);
        settable.setToSet(8);
        System.out.println("The write only value is set to: 8");        
    }
}

// // Output

// // The read only value is read as: 5
// // The write only value is set to: 8
