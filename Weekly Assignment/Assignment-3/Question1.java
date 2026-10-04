    public class Question1 {
        public static void main(String[] args )
        {
            int n = 12345;
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
            System.out.println(rev);
        }
        }
