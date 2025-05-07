package rny_string_181863;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열을 입력하세요");

        String inputString = scanner.nextLine();

        Solution sol = new Solution();
        System.out.println(sol.solution(inputString));
    }
}
