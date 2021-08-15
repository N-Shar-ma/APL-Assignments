public class W2A3Driver {
    public static void main(String[] args) {
        Mobile phoneA = new Mobile("A", 9999, "12MP dual cam");
        Mobile phoneB = new Mobile("B", 11999, "13MP triple cam");
        Mobile phoneC = new Mobile("C", 14999, "16MP quad cam");
        phoneA.print();
        phoneB.print();
        phoneC.print();
    }
}

// Output

// User's Name: A
// Cost: 9999
// Camera: 12MP dual cam
// User's Name: B
// Cost: 11999
// Camera: 13MP triple cam
// User's Name: C
// Cost: 14999
// Camera: 16MP quad cam
