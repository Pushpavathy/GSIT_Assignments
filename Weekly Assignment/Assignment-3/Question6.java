package stringHandson;

public class Question6 {
    public static void main(String[] args)
    {
        int n= 1221;
        int original = n;
        int count = 1;
        int rev=0;
        for(int i=0;i<= count; i++ )
        {
            int rem=n%10;
            rev = rem+ rev*10;
            n=n/10;
            if((n/10) !=0) {
                count++;
            }

        }
        if(rev==original)
        {
            System.out.println( original + " is a Palindrome");
        }
        else {
            System.out.println( original + " is not a Palindrome");
        }
    }
}
