package PatternsProgramming;

public class UnbalancedPattern {
    public static void main(String[] args) {

        // for N
        int n = 9;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 11; j++) {
                if (j == 0 || j == (n - 1) || i == j) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }

            // for R
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 || i == (n - 1) / 2 || j == (n - 1) && i <= (n - 1) / 2 || i == 4 && j == 1
                        || i == 5 && j == 2 || i == 6 && j == 3 || i == 7 && j == 4 || i == 8 && j == 5) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }

            // for Y
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (i == j && i <= (n - 1) / 2 || i + j == (n - 1) && i < (n - 1) / 2
                        || j == (n - 1) / 2 && i > (n - 1) / 2) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }

            // for Z
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (i == 0 || i + j == (n - 1) || i == (n - 1)) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }

            // for X
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == (n - 1)) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }

            // for K
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (j == 0 || i + j == (n - 1) / 2 || i - j == (n - 1) / 2) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }

            // for W

            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == (n - 1) || i + j == (n - 1) && i >= (n - 1) / 2 || i == j && i > (n - 1) / 2) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }

            // for M
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == (n - 1) || i == j && i <= (n - 1) / 2 || i + j == (n - 1) && i <= (n - 1) / 2) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }

            // for Q
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (j == 0 && i > 0 && i < (n - 1) || j == (n - 1) && i > 0 && i < (n - 1)
                        || i == 0 && j > 0 && j < (n - 1) || i == (n - 1) && j > 0 && j < (n - 1) || i == j && i>(n-1)/2 && i<(n-1)) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}