package assignment4;

public class Question4 {
    public static void main(String[] args)
    {
        int[] num1 = {10, 20, 30, 40, 50};
        int[] num2 = {30, 40, 60, 70, 50};
        System.out.print("Common Numbers : ");
        for( int i=0; i < num1.length;i++)
        {
            for(int j=0; j < num2.length;j++)
            {
                if(num1[i]==num2[j])
                {
                    System.out.print( num1[i] + " ");
                }
            }
        }
    }
}
