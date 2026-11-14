package assignment4;

public class Question2 {
    public static void main(String[] args) {
        int[] arr = {0, 5, 0, 3, 8, 0, 2, 9};

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] == 0) {
                   int temp = arr[j];
                   arr[j] = arr[i];
                   arr[i] = temp;
                }
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]);
        }
    }

}
