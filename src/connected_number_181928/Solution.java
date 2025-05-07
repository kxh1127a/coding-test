package connected_number_181928;


public class Solution {
    public int solution(int[] num_list) {

        StringBuilder oddList = new StringBuilder();
        StringBuilder evenList = new StringBuilder();

        for(int item: num_list) {
            if (item % 2 == 0) {
                evenList.append(item);
            } else {
                oddList.append(item);
            }
        }

        return Integer.parseInt(oddList.toString()) + Integer.parseInt(evenList.toString());
    }

    public static void main (String[] args) {

        Solution sol = new Solution();
        System.out.println(sol.solution(new int[]{3, 4, 5, 2, 1}));
        System.out.println(sol.solution(new int[]{5,7,8,3}));

    }
}
