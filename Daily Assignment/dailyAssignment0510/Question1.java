package dailyAssignment0510;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println("Enter the number :" + num);
        int oiginalNum = num;
        int sum =0;
        int product = 1;

        int rem =0;
        while(num > 0)
        {
           rem= num%10;
           num= num/10;
           sum= sum+rem;
           product = product* rem;
        }

        System.out.println("Product :" +product);
        System.out.println("Sum :" +sum);
        if(sum==product)
        {
            System.out.println(oiginalNum + " is a Spy number");
        }

    }
}
