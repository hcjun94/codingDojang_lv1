import java.util.Scanner;

public class versionComparison {
    public static void main(String[] args) {
        String firstNum, secondNum;

        Scanner sc = new Scanner(System.in);

        System.out.print("Input the first version Number : ");
        firstNum = sc.nextLine();
        System.out.print("Input the second version Number : ");
        secondNum = sc.nextLine();

        compareVer(firstNum, secondNum);

    }

    private static void compareVer(String ver1, String ver2) {
        String[] ver1_array = ver1.trim().split("[.]");
        String[] ver2_array = ver2.trim().split("[.]");

        String result;
        for (int i = 0; i < Math.min(ver1_array.length, ver2_array.length); i++) {
            if (Integer.parseInt(ver1_array[i]) > Integer.parseInt(ver2_array[i])) {
                result = ver1 + " > " + ver2;
                System.out.println(result);
                return;
            }
        }
        result = ver1 + " < " + ver2;
        System.out.println(result);

    }
}