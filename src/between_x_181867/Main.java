package between_x_181867;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열을 입력하세요");
        String str = scanner.nextLine();

        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(str)));

        scanner.close();
    }
}
