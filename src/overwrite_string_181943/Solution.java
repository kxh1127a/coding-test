package overwrite_string_181943;

import java.util.Arrays;

// 문자열 my_string, overwrite_string과 정수 s가 주어집니다.
// 문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을
// 문자열 overwrite_string 으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
public class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder new_string = new StringBuilder(my_string);

        for (int i=0; i<overwrite_string.length(); i++) {
            new_string.setCharAt(s+i, overwrite_string.charAt(i));
        };

        return new_string.toString();
    }

    public static void main (String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("He11oWor1d", "lloWorl", 2));
    }
}
