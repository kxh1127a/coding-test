package return_by_flag_181933;

// 두 정수 a, b와 boolean 변수 flag가 매개변수로 주어질 때, flag가 true면 a + b를 false면 a - b를 return 하는 solution 함수를 작성해 주세요.
public class Main {
    static class Solution {
        public int solution(int a, int b, boolean flag) {
            int answer = 0;

            answer = flag ? a+b : a-b;

            return answer;
        }
    }

    public static void main (String[] args) {
        Solution sol = new Solution();
        int result1 = sol.solution(-4, 7, true);
        int result2 = sol.solution(-4,7, false);

        System.out.println(result1);
        System.out.println(result2);
    }
}
