package assignment4;

public class Question1 {
    public static void main(String[] args)
    {
        int [] arr ={12, 45, 7, 89, 34, 89, 56};
        int max = arr[0];
        int second=arr[0]; ;
        for(int i=1;i< arr.length;i++)
        {
            if(arr[i] > max) {
                second = max;
                max = arr[i];

            }
               else if((arr[i] != max) && (arr[i] > second))
               {
                   second = arr[i];
               }



        }
        System.out.println(max);
        System.out.println(second);

    }
}
