/*

일전에 뭐 게임 회사에서 본 간단한 퀴즈 테스트 입니다.

0~9까지의 문자로 된 숫자를 입력 받았을 때, 이 입력 값이 0~9까지의 숫자가 각각 한 번 씩만 사용된 것인지 확인하는 함수를 구하시오.

sample inputs: 0123456789 01234 01234567890 6789012345 012322456789
sample outputs: true false false true false

 */

import java.util.Scanner;

public class duplicate_numbers {
    public static void main(String[] args) {
        String sample_input_numbers = "0123456789 01234 01234567890 6789012345 012322456789";

        String input[] = sample_input_numbers.split(" ");
        System.out.println(sample_input_numbers);
        for (String anInput : input) {
            System.out.print(dupNum(anInput)+" ");

        }


    }

    private static boolean dupNum(String input) {
        for (int i = 0; i < input.length() - 1; i++) {
            for (int j = i + 1; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    return true;
                }
            }
        }

        return false;
    }


}
