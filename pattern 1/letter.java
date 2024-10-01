package pattern;

// public class letter {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 7; i++) {
//             for (int j = 1; j <= 7; j++) {
//                 if (j == 1 || j == 7 || (i == j)) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//         System.out.println();
//         for (int i = 1; i <= 7; i++) {
//             for (int j = 1; j <= 7; j++) {
//                 if (j == 1 || i == 7) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
// import java.util.Scanner;

public class letter {
    public static void main(String[] args) {
        // String[] words = { "SARATHI", "SAARA" }; // The words to create

        // for (String word : words) {

        // for (int i = 0; i < word.length(); i++) {
        // char ch = word.charAt(i);

        // for (int j = 0; j < i; j++) {
        // System.out.print(" ");
        // }
        // System.out.println(ch);
        // }
        // System.out.println();
        // }
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number of rows: ");
        // int n = sc.nextInt();
        // for (int i = 0; i <= n - 1; i++) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print("*" + " ");
        // }
        // System.out.println("");
        // }
        // for (int i = n - 1; i >= 0; i--) {
        // for (int j = 0; j <= i - 1; j++) {
        // System.out.print("*" + " ");
        // }
        // System.out.println("");
        // }
        int n = 5;
        // for (int i = 0; i < n; i++) {
        // for (int j = 2 * (n - i); j >= 0; j--) {
        // System.out.print(" ");
        // }
        // for (int j = 0; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }
        // for (int i = n; i >= 1; i--) {
        // for (int j = n; j > i; j--) {
        // System.out.print(" ");
        // }
        // for (int k = 1; k <= i; k++) {
        // System.out.print("* ");
        // }
        // System.out.println(" ");
        // }
        for (int i = n; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
