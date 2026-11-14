package assignment4;

public class Question5 {
    public static void main(String[] args) {
        int[] arr = {-4, 7, 0, -2, 9, 0, -8, 5};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.println(arr[i] + " ");
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.println(arr[i] + " ");
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                System.out.println(arr[i] + " ");
            }
        }

    }
}

