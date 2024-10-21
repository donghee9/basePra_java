package chap_03;

import java.util.Scanner;

public class _Quiz_03 {
    // 문제 : 주민등록번호에서 생년월일 및 성볗까지만 출력하는 프로그램을 작성하시오
    // 참고 : 1. 주민등록 번호는 13자리의 숫자로 구성
    //       2. 앞 6자리는 생년월일 정보 , 뒷 7자리 중 첫번째 숫자는 성별 정보
    //       3. 입력 데이터는 - 을 포함한 14자리 문자열 형태

    // 예시 "901231-1234567" ->901231-1

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number(Hyphen must be included):");
        String inputId = sc.nextLine();
        String outputId = inputId.substring(0,8);
        System.out.println(outputId);
    }
}
