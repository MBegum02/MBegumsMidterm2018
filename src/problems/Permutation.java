package problems;

/**
 * Created by mrahman on 04/22/17.
 * /*
 * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
 * Write Java program to compute all Permutation of a String
 *
 */

public class Permutation {

    public static void main(String[] args)
    {
        String str = "STOP";
        int n = str.length();
        Permutation permutation = new Permutation();
        permutation.permute(str, 0, n-1);
    }

    private void permute(String str, int m, int n)
    {
        if (m == n)
            System.out.println(str);
        else
        {
            for (int i = m; i <= n; i++)
            {
                str = swap(str,m,i);
                permute(str, m+1, n);
                str = swap(str,m,i);
            }
        }
    }
    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }


    }
