package product_sum_elements_181929;

// 정수가 담긴 리스트 num_list가 주어질 때,
// 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return 하도록 solution 함수를 완성해주세요.

public class Solution {
    public int solution(int[] num_list) {
        int product = 1;
        int sum = 0;

        for(int item : num_list) {
            product *= item;
            sum += item;
        }

        return (product < Math.pow(sum, 2)) ? 1 : 0;
    }
}
