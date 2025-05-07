package between_x_181867;

// 문자열 myString이 주어집니다. myString을 문자 "x"를 기준으로 나눴을 때,
// 나눠진 문자열 각각의 길이를 순서대로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
// "oxooxoxxox"	=> [1, 2, 1, 0, 1, 0]

import java.util.ArrayList;

public class Solution {
    public int[] solution(String myString) {
        ArrayList<Integer> resultList = new ArrayList<>();

        int temp = 0;
        for(int i=0; i<myString.length(); i++) {
            char character = myString.charAt(i);
            if (character != 'x') {
                temp++;
            } else {
                resultList.add(temp);
                temp = 0;
            }
        }
        resultList.add(temp);

        int[] result = new int[resultList.size()];
        for(int i=0; i<result.length; i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }
}
