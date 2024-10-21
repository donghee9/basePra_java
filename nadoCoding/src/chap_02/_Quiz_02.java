package chap_02;

import java.util.Scanner;

public class _Quiz_02 {

    // 문제 어린이 키에 따른 놀이 기구 탑승가능 여부를 확인하는 프로그램을 작성하시오
    // 조건 1. 키가 120 cm 이상인 경우에만 탑승가능 2. 삼항 연산자 이용

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("키를 입력하세요");
        double height = sc.nextDouble();
        String s = isPassOrNot(height)?"탈수 있습니다":"탈수 없습니다";
        System.out.println(s);
    }

    public static boolean isPassOrNot(double height){
        boolean passOrNot;
        passOrNot = (height>=120)?true:false;
        return passOrNot;
    }
}


