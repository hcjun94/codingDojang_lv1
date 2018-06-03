import java.util.Scanner;

public class versionComparison {
    public static void main(String[] args) {
        String firstNum, secondNum;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the first version Number to compare: ");
        firstNum = sc.next();
        System.out.print("Input the second version number to compare: ");
        secondNum = sc.next();

        System.out.println(firstNum + secondNum);
    }
}