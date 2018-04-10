package math;

/**
 * Created by mrahman on 04/02/18.
 * /*
 * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
 * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
 *
 */
public class Factorial {
    public static void main(String[] args) {
        int i, fact;
        int number = 5;
        fact = factorials(number);
        System.out.println("Factorial of the given number " + number + " is: " + fact);
    }


        static int factorials( int m){
            if (m == 0)
                return 1;
            else
                return (m * factorials(m - 1));

        }
    }



