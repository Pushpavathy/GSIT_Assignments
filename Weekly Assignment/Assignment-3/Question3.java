package stringHandson;

public class Question3 {
    public static void main(String[] args)
    {
        int n= 153;
        int origi = n;
        double ams = 0;
        while(n !=0)
        {
            double rem = n%10;
            double cube= Math.pow(rem,3);
            ams = ams+ cube;
            n=n/10;
        }
        if(origi==ams)
        {
            System.out.println( origi+ " is an Armstrong number ");
        }
        else
            System.out.println(origi+ " is not an Armstrong number ");
    }
}
