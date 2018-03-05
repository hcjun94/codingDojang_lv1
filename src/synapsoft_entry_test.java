/*
주어진 문자열(공백 없이 쉼표로 구분되어 있음)을 가지고 아래 문제에 대한 프로그램을 작성하세요.

김씨와 이씨는 각각 몇 명 인가요?
"이재영"이란 이름이 몇 번 반복되나요?
중복을 제거한 이름을 출력하세요.
중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요.

 */

import java.util.*;

public class synapsoft_entry_test {
    public static void main(String[] args) {
        String rawArr = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호," +
                "전경헌,송정환,김재성,이유덕,전경헌";


        String inputArr[] = rawArr.split(",");
        ArrayList<String> listArray = new ArrayList<>();



        int nKimLee = 0;
        int nLeeJaeYoung = 0;
        String lastName;

        for (String nameStr : inputArr) {
            lastName = nameStr.substring(0, 1);

            //nKimLee 모두 합산
            if (lastName.equals("김") || lastName.equals("이")) {
                nKimLee++;
            }
            //nLeeJaeYoung
            if (nameStr.equals("이재영")) {
                nLeeJaeYoung++;
            }
            //List Without repeat
            if(!listArray.contains(nameStr)){
                listArray.add(nameStr);
            }
        }
        String outputArr[] = new String[listArray.size()];

        System.out.println("김씨와 이씨는 " + nKimLee + "명입니다.");
        System.out.println("\n이재영은 " + nLeeJaeYoung + "명입니다.");

        System.out.println("\n중복을 제외한 리스트");
        System.out.println(listArray);

        //List ascending order
        System.out.println("\n오름차순으로 정렬한 리스트");
        Arrays.sort(listArray.toArray(outputArr));
        System.out.println(Arrays.toString(outputArr));

    }
}
