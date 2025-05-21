package _lambda_test_2;

import java.util.Arrays;
import java.util.List;

// **람다, 메서드 체이닝**
// 람다는 익명함수이다. 람다는 메모리의 콜스택에 쌓인다.
public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("kim", "hong", "lee", "park");
//        for (String name : names) {
//            System.out.println(name);
//        }

        // stream 병렬 처리 => 나중에 취합해야 함.
        // 자료가 적을 때는 괜히 여러사람한테 나눠서 맡기고 취합도 오래걸림. 그럴 때는 그냥 for 문이 효율적.
        // 자료가 많다는 기준은 줄 수가 많을 때 (작은 상자가 여러개), 데이터가 많을 때 (큰 상자) 둘 다.
        names.forEach(System.out::println);
        // 람다가 곧 익명함수인데, javascript 에서 익명함수는 "() => 실행문" 이런 형태였다. => 이게 return 이라는 뜻이다.
        // 여러 줄이 필요하면 { } 로 감싸고, 그 안에서 return 값을 지정해줘야함.
        // 한줄이면 => 에 따라오는 내용이 자동으로 return 값이 되고 여러 줄일 때는 return을 정확히 짚어줘야 함.


        // 배열은 index 기반이어서 stream이 불가능하다.
        List<Integer> n = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        // new ArrayList<>(); 하면 .add .add .add 번거롭기 때문에 asList()를 쓰고 배열처럼 작성하겠다.
        // 람다가 익명함수지? 익명함수를 보통 왜 써? 고차함수로 쓰려고. 함수 안에 매개변수로 함수를 넘겨 주려고.
        // 엮어서 처리 결과를 계속 다음으로 넘겨줌 => 메소드 체이닝 => 병렬처리. 코드간결
        n.stream()
                .filter(item -> item % 2 == 1)
                .forEach(System.out::println);


        List<String> strs = Arrays.asList("abc", "def", "ghi", "j");
        strs.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);


        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        int sum = n.stream()
                .filter(item -> item % 2 == 1)
                .reduce(0, (a, b) -> a + b);
        System.out.println(sum);

    }
}
