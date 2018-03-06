/*
파이썬과 같은 몇몇 프로그래밍 언어는 Pothole_case 를 더 선호하는 언어라고 합니다.

Example:

codingDojang --> coding_dojang

numGoat30 --> num_goat_3_0

위 보기와 같이 CameleCase를 Pothole_case 로 바꾸는 함수를 만들어요!

출처: UT past test

 */
public class camelCase_to_pothole_case {
    public static void main(String[] args) {
        String sampleInput1 = "codingDojang";
        String sampleInput2 = "numGoat30";


        String modifyStr = sampleInput1;
        String[] tempString = {"", ""};

        System.out.println("Input String: " + modifyStr);

        for (int i = 0; i < modifyStr.length(); i++) {
            if (upperCase(modifyStr, i) || digitCase(modifyStr, i)) {
                tempString[0] = modifyStr.substring(0, i);
                tempString[1] = modifyStr.substring(i, i + 1).toLowerCase() + modifyStr.substring(i + 1, modifyStr.length());
                modifyStr = tempString[0] + "_" + tempString[1];
                i++;
            }
        }
        System.out.println("Output String: " + modifyStr);
    }


    private static boolean upperCase(String input, int index) {
        return Character.isUpperCase(input.charAt(index));
    }

    private static boolean digitCase(String input, int index) {
        return !Character.toString(input.charAt(index)).equals("_") && Character.isDigit(input.charAt(index));
    }
}