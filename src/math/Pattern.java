package math;

public class Pattern {

    public static void main(String[] args) {
        /* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
         * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         *
         */
        int pat = 0;
        for (int i = 100; i >= 0; i--) {
            pat++;
            if (pat <= 10) {
                System.out.println(i + " ");
            } else {
                for (i = 90; i >= 0; i -= 2) {
                    if (pat > 10 && pat <= 20) {
                        System.out.println(i + " ");
                        pat++;
                    } else {
                        for (i = 70; i >= 0; i -= 3) {
                            if (pat >= 20 && pat <= 20) {
                                System.out.println(i + " ");
                                pat++;
                            } else {
                                for (i = 40; i >= 0; i -= 4) {
                                    System.out.println(i + " ");
                                    pat++;


                                }


                            }
                        }
                    }
                }
            }
        }


    }
}

