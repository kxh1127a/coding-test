package multiple_of_n_181863;

public class Main {

    // Solution 클래스
    // 정수 num과 n이 매개 변수로 주어질 때, num이 n의 배수이면 1을 return n의 배수가 아니라면 0을 return하도록 solution 함수를 완성해주세요.
    static class Solution {
        public int solution(int num, int n) {
            int answer = (num % n == 0) ? 1 : 0;
            return answer;
        }
    }

    // main 함수: 실행 시작점
    public static void main(String[] args) {
        Solution sol = new Solution(); // Solution 객체 생성

        // 테스트 케이스 실행
        int result1 = sol.solution(98, 2);  // 98은 2의 배수 → 1
        int result2 = sol.solution(34, 3);  // 34는 3의 배수 아님 → 0

        // 결과 출력
        System.out.println("98 % 2 == 0 ? → " + result1);  // 출력: 1
        System.out.println("34 % 3 == 0 ? → " + result2);  // 출력: 0
    }
}