import java.util.ArrayList;
import java.util.Scanner;

public class dashInsert {
    public static void main(String[] args) {
        int input;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input new number: ");
        input = sc.nextInt();
        String temp = Integer.toString(input);      // int to String
        String[] inputArr = new String[temp.length()];   // String to int arr


        for (int i = 0; i < temp.length(); i++) {
            inputArr[i] = String.valueOf(temp.charAt(i));
        }


        System.out.println(dashInsert_M(inputArr));
    }

    private static String dashInsert_M(String[] input) {
        StringBuilder output = new StringBuilder();
        ArrayList<String> arrLi = new ArrayList<>();
        boolean first, second;


        for (int i = 1; i < input.length; i++) {
            arrLi.add(input[i - 1]);
            first = Integer.parseInt(input[i - 1]) % 2 == 1;
            second = Integer.parseInt(input[i]) % 2 == 1;

            if (first) {
                if (second) {
                    arrLi.add("-");
                }
            } else {
                if (!second) {
                    arrLi.add("*");
                }
            }
        }
        arrLi.add(input[input.length - 1]);


        for (String s : arrLi) {
            output.append(s);
        }
        return output.toString();
    }
}
