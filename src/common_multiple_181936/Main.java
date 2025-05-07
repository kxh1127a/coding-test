package common_multiple_181936;

import java.util.Scanner;

// 정수 number와 n, m이 주어집니다. number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 return 하도록 solution 함수를 완성해주세요.
public class Main {
    static class Solution {
        public int solution(int number, int n, int m) {

            return number % n == 0 && number % m == 0 ? 1 : 0;
        }
    }

    public static void main (String[] args) {
        Solution sol = new Solution();
        int result1 = sol.solution(10, 2, 5);
        int result2 = sol.solution(9,3,2);
        int result3 = sol.solution(5,2,3);

        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        System.out.println("result3: " + result3);


    }
}
