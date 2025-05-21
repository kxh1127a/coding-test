package _lambda_test;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 홀수만 출력
        List<Integer> n = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        n.stream()
                .filter(i -> i%2 == 1)
                .forEach(System.out::println);

        // 대문자 변환
        List<String> a = Arrays.asList("aaa", "bbb", "ccc");
        a.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        // 총합 출력
        List<Integer> nums = Arrays.asList(1, 2, 2, 2, 1, 1);
        int sum = nums.stream()
                .filter(i -> i % 2 == 0)  // 짝수만
                .reduce(0, (a1, b1) -> a1 + b1);

        System.out.println(sum);
    }
}
