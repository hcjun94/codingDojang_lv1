/*

디지털 시계에 하루동안(00:00~23:59) 3이 표시되는 시간을 초로 환산하면 총 몇 초(second) 일까요?

디지털 시계는 하루동안 다음과 같이 시:분(00:00~23:59)으로 표시됩니다.

00:00 (60초간 표시됨)
00:01
00:02
...
23:59
 */

public class number_3_in_clock {
    public static void main(String[] args) {
        int threeInMin = 0;
        int threeInHr = 0;

        for (int hr = 0; hr < 24; hr++) {
            if (String.valueOf(hr).contains("3")) {
                threeInHr++;
                continue;
            }
            for (int min = 0; min < 60; min++) {
                if (String.valueOf(min).contains("3")) {
                    threeInMin++;
                }
            }
        }
        System.out.println((threeInHr * 60 + threeInMin) * 60 + " Seconds");
    }
}
