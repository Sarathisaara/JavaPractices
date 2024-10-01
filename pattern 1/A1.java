package pattern;

public class A1 {
    public static void main(String[] args) {
        int m = 50;
        System.out.println("prime numbers from 1 to " + m + ":");
        for (int i = 2; i <= i; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i == 0 || i == 1) {
                    isPrime = true;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i + " ");
            }
        }
    }
}
