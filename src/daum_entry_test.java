/*
1차원의 점들이 주어졌을 때, 그 중 가장 거리가 짧은 것의 쌍을 출력하는 함수를 작성하시오.
(단 점들의 배열은 모두 정렬되어있다고 가정한다.)

예를들어 S={1, 3, 4, 8, 13, 17, 20} 이 주어졌다면, 결과값은 (3, 4)가 될 것이다.
 */


public class daum_entry_test {
    public static void main(String[] args) {
        int nInput[] = {1, 3, 4, 8, 13, 17, 20}; //sample Input

        int nSubtr;
        int nFinal = 99999;
        int nFinalTuple[] = {0, 0};

        for (int i = 0; i < nInput.length; i++) {
            for (int j = i + 1; j < nInput.length; j++) {

                nSubtr = Math.abs(nInput[i] - nInput[j]);
                if (nSubtr < nFinal) {
                    nFinal = nSubtr;
                    nFinalTuple[0] = nInput[i];
                    nFinalTuple[1] = nInput[j];
                }
            }
            // 메모리는 더 차지하지만 CPU 자원을 적게 활용
        }
        System.out.println("Closest two dots are: {" +
                nFinalTuple[0] + ", " +
                nFinalTuple[1]
                + "}");
    }
}
