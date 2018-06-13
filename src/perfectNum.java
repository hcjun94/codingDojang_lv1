import java.util.ArrayList;
import java.util.Scanner;

public class perfectNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input new limit number: ");
        int input = sc.nextInt();

        for (int i = 2; i < input; i++) {
            if (truePerfectNum(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean truePerfectNum(int input) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < input; i++) {
            if (input % i == 0) {
                list.add(i);
            }
        }
        double sum = 0;
        for (int d : list)
            sum += d;


        return (input == sum);
    }


}

