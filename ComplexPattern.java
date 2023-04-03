package PatternsProgramming;

public class ComplexPattern {
    public static void main(String[] args) {
        int n = 11;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == (n - 1)) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");

                }
            }

            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == (n - 1) || i == 0 || j == 0 || i == (n - 1) || j == (n - 1)) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");

                }
            }

            // System.out.print(" ");
            // for (int j = 0; j < n; j++) {
            // if (i == j || i + j == (n - 1) || i == 0 || j == 0 || i == (n - 1) || j == (n
            // - 1) || i==(n-1)/2 || j==(n-1)/2) {
            // System.out.print("*");

            // } else {
            // System.out.print(" ");

            // }
            // }

            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == (n - 1) || i == 0 || j == 0 || i == (n - 1) || j == (n - 1)
                        || i + j == (n - 1) / 2 || i - j == (n - 1) / 2 || j - i == (n - 1) / 2
                        || i + j == (n - 1) + (n - 1) / 2) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");

                }
            }

            // P1 formula --> i+j == (n-1)/2 .
            // P2 formula --> i-j == (n-1)/2 .
            // P3 formula --> j-i == (n-1)/2 .
            // P4 formula --> i+j == (n-1)+(n-1)/2 .

            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (i + j == (n - 1) / 2 || i - j == (n - 1) / 2 || j - i == (n - 1) / 2
                        || i + j == (n - 1) + (n - 1) / 2 || i == 0 || j == 0 || i == (n - 1) || j == (n - 1)) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");

                }
            }

            // P1 is lesser part.
            // P2 is greater part.
            // P3 is greater part.
            // P4 is greater part.

            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (i == 0 && j <= (n - 1) / 2 || j == 0 && i <= (n - 1) / 2 || i + j <= (n - 1) / 2
                        || j == 0 && i > (n - 1) / 2 && i <= (n - 1) || i == (n - 1) && j <= (n - 1) / 2
                        || i - j >= (n - 1) / 2 || i == 0 && j >= (n - 1) / 2 && j <= (n - 1)
                        || j == (n - 1) && i <= (n - 1) / 2 || j - i >= (n - 1) / 2 || i + j >= (n - 1) + (n - 1) / 2
                        || j == (n - 1) && i > (n - 1) / 2 && i <= (n - 1)
                        || i == (n - 1) && j >= (n - 1) / 2 && j <= (n - 1)) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");

                }
            }

            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (i + j == (n - 1) / 2
                        || i - j == (n - 1) / 2
                        || j - i == (n - 1) / 2
                        || i + j == (n - 1) + (n - 1) / 2 || i == (n - 1) / 2 || i == 1 && j > 4 && j <= 5
                        || i == 2 && j > 3 && j <= 7 || i == 3 && j >= 2 && j <= 8 || i == 4 && j >= 2 && j <= 9
                        || i == 6 && j > 1 && j < 10 || i == 7 && j > 1 && j <= 8 || i == 8 && j > 2 && j <= 7
                        || i == 9 && j > 4 && j < 6) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");

                }
            }

            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 && i < (n - 1) / 2 || j == (n - 1) && i < (n - 1) / 2 || i == (n - 1) / 2
                        || i + j == (n - 1) / 2 || j - i == (n - 1) / 2) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");

                }
            }

            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 && i < (n - 1) / 2 || j == (n - 1) && i < (n - 1) / 2 || i == (n - 1) / 2
                        || i + j == (n - 1) / 2 && i <= (n - 1) / 2 || j - i == (n - 1) / 2 && i <= (n - 1) / 2
                        || i == 2 && j <= 6 && j >= 3 || i == 1 && j >= 4 && j == 5 || i == 3 && j > 1 && j < 8
                        || i == 4) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");

                }

            }

            System.out.println();
        }
    }
}
