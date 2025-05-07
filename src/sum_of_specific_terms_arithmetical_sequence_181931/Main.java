package sum_of_specific_terms_arithmetical_sequence_181931;

public class Main {

    public static void main (String[] args) {
        Solution sol = new Solution();
        int a = 3;
        int d = 4;
        boolean[] included = {true, false, false, true, true};

        System.out.println(sol.solution(a, d, included));

    }
}
