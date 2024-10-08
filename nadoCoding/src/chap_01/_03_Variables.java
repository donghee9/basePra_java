package chap_01;

public class _03_Variables {

    public static void main(String[] args) {
        // 문자열 변수
        String name;  // 선언
        name = "나도코딩";  // 초기화 ,또는 할당(변수를 선언하고 첫번째 값을 할당하는것)
        name = "서코딩"; // 할당
        // 프로그래밍에서 A = B 라는 것은 오른쪽에 있는 값을 왼쪽의 변수 또는 객체에 넣겠다 라는 뜻
        String name2 = "비보코딩"; // 선언과 초기화 가 같이 이루어짐


        // 정수형 변수
        int hour = 15;

        // 실수
        double score = 90.5;
        // 딱 한글자만 표현 할때는 char
        char grade = 'A';

        System.out.println(name + "의 평균점수는" + score +"점 입니다");
        System.out.println("학점은 "+ grade + "입니다.");

        System.out.println(name + "님 , 배송이 시작됩니다 . "+ hour +"시에 방문예정입니다");
        System.out.println(name + "님 배송이 완료되었습니다");

        boolean pass =true;
        System.out.println("이번시험에 합격했을까요?"+pass);





        // 1. 변수 : 어떤 데이터를 저장해놓은 공간
    }
}
