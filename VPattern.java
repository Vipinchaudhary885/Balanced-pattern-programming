package PatternsProgramming;

public class VPattern {
    public static void main(String[] args) {
        // for V
        int n = 6;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 11; j++) {
                if (i - j == 0 || i + j == 10) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}