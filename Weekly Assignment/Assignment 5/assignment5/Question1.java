package assignment5;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s1 = sc.next();
        int vowelCount=0;
        int consonentCount=0;
        String s2 = s1.toLowerCase();
        for(int i=0;i < s1.length();i++)
        {
            char c= s2.charAt(i);
            if((c== 'a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
            {
                vowelCount++;
            }
            else {
                consonentCount++;
            }

        }
        System.out.println("Vowels : " +vowelCount);
        System.out.println("Consonent : " +consonentCount);
    }
}
