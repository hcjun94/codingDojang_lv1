/*

프로그램 실행 순서

입력할 정수의 개수를 사용자로부터 입력 받는다.
입력받은 정수의 개수만큼 정수를 입력받는다.
입력받은 정수의 합과 평균 값을 출력한다.
할당된 메모리공간을 비운다.
요구사항

메모리공간은 사용자의 입력 수의 따라 변동된다.
사용한 공간은 마지막에 비워야 한다.
배열을 사용하면 안된다.
 */

import java.util.Scanner;

public class dynamic_mem_append {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Input number of Integers: ");
        int limit = reader.nextInt();
        int sum = 0;

        for (int i = 0; i < limit; i++) {
            System.out.println("Input numbers you want to add: ");
            sum += reader.nextInt();
        }
        System.out.println("SUM = " + sum);
        System.out.println("AVERAGE = " + ((float) sum / limit));

        System.gc();
    }
}
