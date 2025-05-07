package string_multiplication_181940;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열을 입력하세요.");
        String inputString = scanner.nextLine();

        System.out.println("반복 횟수를 입력하세요.");
        int inputCount = scanner.nextInt();

        scanner.close();

        Solution sol = new Solution();
        System.out.println(sol.solution(inputString, inputCount));
    }
}
