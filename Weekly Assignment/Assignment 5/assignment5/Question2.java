package assignment5;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s1 = sc.nextLine();
        String[] str = s1.split(" ");
        String greater = str[0];
        for(int i=1;i<str.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if( (str[j].length()) < (str[i].length()))
                {
                  greater= str[i];
                }
            }

        }
        System.out.println(greater);

    }
}
