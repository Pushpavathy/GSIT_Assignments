package assignment5;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s1 = sc.next();
        StringBuilder s2 = new StringBuilder(s1.toLowerCase());
        char original ='a';
        char replace ='o';
        for (int i = 0; i < s2.length(); i++) {
            if(s2.charAt(i)==original)
            {
                s2.setCharAt(i,replace);
            }
        }
        System.out.println(s2);
    }
}
