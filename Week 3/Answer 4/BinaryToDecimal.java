import java.lang.Math;

public class BinaryToDecimal {

    static int binToDec(String s, int power) {
        if(power>=s.length()) return 0;
        int pos = s.length()-1-power;
        int val = s.charAt(pos)-'0';
        return val * (int)Math.pow(2,power) + binToDec(s, ++power);
    }

    public static void main(String[] args) {
        System.out.println("Decimal version of 101001 is: " + binToDec("101001", 0));
    }
}

// Output

// Decimal version of 101001 is: 41