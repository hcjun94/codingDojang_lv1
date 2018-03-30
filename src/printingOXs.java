import java.util.Scanner;

public class printingOXs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line, i, j, k;

        while (true) {
            System.out.print("input number of line : ");
            line = sc.nextInt();
            if (line > 0)
                break;
            else
                System.out.println("input number that bigger than '0'");
        }

        for (i = 0; i < line; i++) {
            for (j = 0; j < line - (i + 1); j++) {
                System.out.print("O");
            }
            for (k = 0; k < line - j; k++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }
}