import java.lang.Math;

public class Location {
    static double latitude;
    static double longitude;

    static void setCoordinates(double lat, double lon) {
        latitude = lat;
        longitude = lon;
    }

    static String getLatitude() {
        return Math.abs(latitude) + (latitude<0 ? " S" : " N");
    }

    static String getLongitude() {
        return Math.abs(longitude) + (longitude<0 ? " W" : " E");
    }
    
    public static void main(String[] args) {
        System.out.println("Setting coordinates numerically: " + 26.84 + ", " + 80.94);
        setCoordinates(26.84, 80.94);
        System.out.println("Printing direction based coordinates");
        System.out.println(getLatitude() + ", " + getLongitude());
    }
}

// Question: Justify which Java concept is used in this program.

// Answer: 
// The concept of Encapsulation is used here, as:
// 1) all data regarding location of an unmanned vehicle (latitude and longitude) 
// 2) the methods for getting and setting this data
// are wrapped up into this one Location class

// Output

// Setting coordinates numerically: 26.84, 80.94
// Printing direction based coordinates
// 26.84 N, 80.94 E
