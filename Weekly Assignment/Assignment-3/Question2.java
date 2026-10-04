public class Question2 {
    public static void main(String[] args)
    {
        int n= 987654;
        int count=0;
        while(n!=0)
        {
            int rem = n%10;

            if(n!=0)
            {
                count++;
            }
            n=n/10;
        }
        System.out.println("Number of Digits : " +count);
    }
}
