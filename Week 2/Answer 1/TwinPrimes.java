public class TwinPrimes {

    static boolean[] isComposite = new boolean[101];

    static void sieve() {
        isComposite[1] = true;
        for(int i = 2; i <=10; i++) {
            if(!isComposite[i])
            for(int j = 2*i; j <= 101; j+=i) {
                isComposite[j] = true;
            }
        }
    }

    public static void main(String args[]) {
        sieve();
        for(int i = 2; i <= 100; i++) {
            if(!isComposite[i] && !isComposite[i+2]) {
                System.out.println(i + ", " + (i+2));
            }
        }
    }
}

// Output

// 3, 5
// 5, 7
// 11, 13
// 17, 19
// 29, 31
// 41, 43
// 59, 61
// 71, 73

