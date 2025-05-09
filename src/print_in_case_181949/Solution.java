package print_in_case_181949;
import java.util.Scanner;

// 영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        char tmp;
        StringBuilder str = new StringBuilder();

        for(int i=0; i<a.length(); i++) {
            tmp = a.charAt(i);
            if(a.charAt(i) <= 90) {
                str.append(String.valueOf(tmp).toLowerCase());
            } else {
                str.append(String.valueOf(tmp).toUpperCase());
            }
        }

        System.out.println(str);
        sc.close();
    }
}
