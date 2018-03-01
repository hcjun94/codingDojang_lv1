/*
A씨는 개발된 소스코드를 특정업체에 납품하려고 한다. 개발된 소스코드들은 탭으로 들여쓰기가 된것,
공백으로 들여쓰기가 된 것들이 섞여 있다고 한다.
A씨는 탭으로 들여쓰기가 된 모든 소스를 공백 4개로 수정한 후 납품할 예정이다.
A씨를 도와줄 수 있도록 소스코드내에 사용된 탭(Tab) 문자를 공백 4개(4 space)로 바꾸어 주는 프로그램을 작성하시오.
 */
/*
Programmer A wants to ship the sourcecode to a company. The source code contains mixed tabs and spaces.
Programmer A wants to convert tab into 4 space characters and ship.

To help Programmer A, write a program that converts a tab character into the space character.
 */

public class sub_tab_space{
    public static void main(String[] args){
        String testInput = "start\tto\tfin";
        System.out.println(testInput);

        System.out.println(tabToSpace(testInput));

    }

    private static String tabToSpace(String text) {
        text = text.replaceAll("\t", "    ");
        return text;
    }
}