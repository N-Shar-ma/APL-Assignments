public class Mobile {
    public String username;
    private int cost;
    private String camera;

    Mobile(String username, int cost, String camera) {
        this.username = username;
        this.cost = cost;
        this.camera = camera;
    }

    void print() {
        System.out.println("User's Name: " + username);
        System.out.println("Cost: " + cost);
        System.out.println("Camera: " + camera);
    }
}
