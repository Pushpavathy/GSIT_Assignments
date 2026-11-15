package dailyAssignment0610;

public class Question4 {
    public static void main(String[] args)
    {
        int n = 5;

        for (int i = 1; i <= n; i++) {

            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Middle spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i =n-1; i >= 1; i--) {

            // Left lower stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Lower Middle  spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right lower stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
