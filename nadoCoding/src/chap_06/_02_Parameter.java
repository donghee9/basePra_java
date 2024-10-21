package chap_06;

import java.util.Scanner;

public class _02_Parameter {
    // 전달값 , Parameter
    // 만약에 scanner 에서 숫자를 받으면 거듭 제곱을 나타내는 프로그램
    public static double power(double number) {
        return number * number;
    }

    public static  void powerByExp(double number , int exponent){
        for (int i = 0; i < exponent; i++) {
            number = power(number);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력하세요");
        double a = sc.nextDouble();

        System.out.println(power(a));
    }
}
