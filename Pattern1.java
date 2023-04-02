package PatternsProgramming;

// pattern programming for balanced pattern .
// for A

public class Pattern1 {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j > 0 && j < (n - 1) || j == 0 && i > 0 || j == (n - 1) && i > 0 || i == (n - 1) / 2) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }

            // for B
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 && j < (n - 1) / 2 || i == (n - 1) && j < (n - 1) / 2
                        || j == (n - 1) / 2 && i > 0 && i < (n - 1) / 2
                        || j == (n - 1) / 2 && i > (n - 1) / 2 && i < (n - 1) || i == (n - 1) / 2 && j < (n - 1) / 2) {
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

            // for E
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == (n - 1) / 2 || i == (n - 1)) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }

            // for F
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == (n - 1) / 2) {
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

            // for I
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == (n - 1) / 2 || i == (n - 1)) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }

            // for T
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == (n - 1) / 2) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }

            // for L
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == (n - 1)) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }

            // for O
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (j == 0 && i > 0 && i < (n - 1) || j == (n - 1) && i > 0 && i < (n - 1)
                        || i == 0 && j > 0 && j < (n - 1) || i == (n - 1) && j > 0 && j < (n - 1)) {
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

            // for U
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (j == 0 && i < (n - 1) || j == (n - 1) && i < (n - 1) || i == (n - 1) && j > 0 && j < (n - 1)) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }

            // for S
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == (n - 1) / 2 || i == (n - 1) || j == 0 && i < (n - 1) / 2
                        || j == (n - 1) && i > (n - 1) / 2 && i < (n - 1)) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }

            // for J
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == (n - 1) / 2 || i == (n - 1) && j <= (n - 1) / 2 || j == 0 && i >= (n - 1) / 2) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}