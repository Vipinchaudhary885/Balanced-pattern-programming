package PatternsProgramming;

public class FullName {
    public static void main(String[] args) {
        int n = 6;

        // for V
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 11; j++) {
                if (i - j == 0 || i + j == 10) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");

                }
            }

            // for I
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == (n - 1) / 2 || i == (n - 1)) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }

            // for P
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 || i == (n - 1) / 2 || j == (n - 1) && i < (n - 1) / 2) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }

            // for I
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == (n - 1) / 2 || i == (n - 1)) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }

            // for N
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == (n - 1) || i == j) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }

            // for C
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (j == 0 && i > 0 && i < (n - 1) || i == 0 && j > 0 && j <= (n - 1) / 2
                        || i == (n - 1) && j > 0 && j <= (n - 1) / 2) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }

            // for H
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == (n - 1) || i == (n - 1) / 2) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }

            // for A
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (i == 0 && j > 0 && j < (n - 1) || j == 0 && i > 0 || j == (n - 1) && i > 0 || i == (n - 1) / 2) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }

            // for U
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (j == 0 && i < (n - 1) || j == (n - 1) && i < (n - 1) || i == (n - 1) && j > 0 && j < (n - 1)) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }

            // for D
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 && j < (n - 1) / 2 || i == (n - 1) && j < (n - 1) / 2
                        || j == (n - 1) / 2 && i > 0 && i < (n - 1)) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }

            // for H
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == (n - 1) || i == (n - 1) / 2) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }

            // for A
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (i == 0 && j > 0 && j < (n - 1) || j == 0 && i > 0 || j == (n - 1) && i > 0 || i == (n - 1) / 2) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }

            // for R
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 || i == (n - 1) / 2 || j == (n - 1) && i <= (n - 1) / 2 || i == 4 && j == 1
                        || i == 5 && j == 2 || i == 6 && j == 3 || i == 7 && j == 4) {
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
            System.out.println();
        }
    }
}
