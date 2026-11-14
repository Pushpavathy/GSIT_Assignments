package assignment4;

public class Question3 {
    public static void main(String[] args)
    {
        int [] arr ={1, 2, 3, 5, 6, 7, 8, 9, 10};
        int n = arr[arr.length-1];
        int sum = n*(n+1)/2;
        int total =0;
        int missingNum;
        for(int i=0; i< arr.length;i++)
        {
            total = total +arr[i];
        }
        missingNum = sum-total;
        System.out.println("Missing number: " + missingNum);
    }
}
