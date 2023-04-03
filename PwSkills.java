package PatternsProgramming;

public class PwSkills {
    public static void main(String[] args) {
        int n = 11;

        // for P
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 || i == (n - 1) / 2 || j == (n - 1) && i < (n - 1) / 2) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }

            // for W

            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == (n - 1) || i + j == 10 && i > (n - 1) / 2 || i == j && i > (n - 1) / 2) {
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

            // for K
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (j == 0 || i + j == (n - 1) / 2 || i - j == (n - 1) / 2) {
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

            // for L
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == (n - 1)) {
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

            System.out.println();

        }
    }
}
