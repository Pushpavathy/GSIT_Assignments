package assignment5;

public class Question4 {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("ABC");
        String result ="";
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j <=s1.length(); j++) {
                if(j<= i)
                {
                    continue;
                }
               result= s1.substring(i,j);
                System.out.println(result);
            }

        }
    }
}

