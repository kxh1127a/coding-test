package display_a_b_181951;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        str1.append("a = " + a);
        str2.append("b = ").append(b);

        System.out.println(str1);
        System.out.println(str2);

    }
}
