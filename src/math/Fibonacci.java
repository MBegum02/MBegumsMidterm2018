package math;

public class Fibonacci {

         /*
          Write 40 Fibonacci numbers with java.
         */
         public static void main(String[] args) {
             int m = 0;
         int n = 1;
         for(int i =0; i < 40; i++) {
             System.out.println(m);
             m = m + n;
             n = m - n;
         }


    }
}
