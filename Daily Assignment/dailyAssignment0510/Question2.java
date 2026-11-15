package dailyAssignment0510;

public class Question2 {
    public static void main(String[] args)
    {
     int num = 172;
     int originalNum = num;
        int rem =0;
        int count=0;
        int finalRem=0;
        while(num > 0)
     {
         rem= rem + num%10;
         num = num/10;

     }
        System.out.println("Digits of sum : " +rem);

        do
       {
           finalRem= finalRem + rem%10;
           rem = rem/10;
           count++;


        }while(  (count < 2));
        System.out.println("Final digit : " +finalRem);
        if(finalRem==1)
        {
            System.out.println(originalNum + " is Magic number");
        }
        else
        {
            System.out.println(originalNum + " is not a Magic number");
        }

    }
}
