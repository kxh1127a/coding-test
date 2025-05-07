package to_capital_181877;

import java.util.Scanner;

// 알파벳으로 이루어진 문자열 myString이 주어집니다. 모든 알파벳을 대문자로 변환하여 return 하는 solution 함수를 완성해 주세요.
public class Main {

    static class Solution {
        public String solution(String myString) {
//            return myString.toUpperCase();
            StringBuilder answer = new StringBuilder();

            for(int i=0; i<myString.length(); i++) {
                char str = myString.charAt(i);
                answer.append(Character.toUpperCase(str));
            }

            return answer.toString();

        }

    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열을 입력하세요 : ");
        String lineInput = scanner.nextLine();

        Solution sol = new Solution();
        String result = sol.solution(lineInput);
        System.out.println(result);

        scanner.close();
    }
}
