package attach_string_181946;
import java.util.Scanner;

// 두 개의 문자열 str1, str2가 공백으로 구분되어 입력으로 주어집니다.
// 입출력 예와 같이 str1과 str2을 이어서 출력하는 코드를 작성해 보세요.
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        StringBuilder str = new StringBuilder();
        str.append(a);
        str.append(b);

        System.out.println(str);

        // System.out.println((a+b).replace(" ", ""));
        // System.out.print(a.trim() + b.trim());
        // System.out.println(String.join("", a, b));
        // System.out.print(a.concat(b));

    }
}
