public class Location {
    static double latitude;
    static double longitude;

    static void setCoordinates(double lat, double lon) {
        latitude = lat;
        longitude = lon;
    }

    static String getLatitude() {
        return latitude + (latitude<0 ? " S" : " N");
    }

    static String getLongitude() {
        return longitude + (longitude<0 ? " W" : " E");
    }
    public static void main(String[] args) {
        System.out.println("Setting coordinates numerically: " + 26.84 + ", " + 80.94);
        setCoordinates(26.84, 80.94);
        System.out.println("Printing directions based on coordinates");
        System.out.println(getLatitude() + ", " + getLongitude());
    }
}

// Output

// Setting coordinates numerically: 26.84, 80.94
// Printing directions based on coordinates
// 26.84 N, 80.94 E