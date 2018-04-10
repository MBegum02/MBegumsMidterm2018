package math;

public class MakePyramid {
    public static void main(String[] args) {
        makePyramid(10);
    }

    //   Implement a large Pyramid of stars in the screen with java.
    //
    //                    *
    //                   * *
    //                  * * *
    //                 * * * *
    //                * * * * *
    //               * * * * * *

    // I got help from my team and geekforgeek website.

    public static void makePyramid(int n) {
        int k = 2 * n - 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(" ");
            }
            k = k - 1;
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();


        }
    }
}