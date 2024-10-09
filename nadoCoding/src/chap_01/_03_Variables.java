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

        // double 보다는 정밀도가 떨어지지만 , float 도 실수를 표현할 수 있음
        double d = 3.14;
        float f =3.14F; // 실수는 기본적으로 double 로 간주 하기 때문에 뒤에 f 를 붙여야함
        // 사용 용도
        // float: 메모리 공간이 중요한 상황에서 사용됩니다. 4바이트 소수점 7자리
        // 주로 그래픽 처리, 게임 개발, 임베디드 시스템 등에서 자주 사용됩니다. 정밀도가 약간 떨어지더라도 메모리 사용을 줄여야 하는 경우에 적합합니다.
        //
        // double: 더 높은 정밀도가 필요할 때 사용됩니다. 8바이트 소수점 15자리
        // 과학 계산, 금융 계산 등에서 double이 많이 사용됩니다.

        // 정수 리터럴 은 기본적으로 int 로 간주함 그래서 long 을 나타낼때 L 을 붙여야함
        int i = 31;
        long l = 100000000000L;
        l =100_000_000_000L;
        System.out.println(l);
        // int : 4바이트(32비트) 값의 범위는 -2,147,483,648부터 2,147,483,647까지입니다.(21억)
        // long : 8바이트 (64비트)  값의 범위는 **-9,223,372,036,854,775,808**부터 **9,223,372,036,854,775,807**까지입니다.

        // int , long , float , double , String , boolean
        // 적합한 자료형을 찾는 것이 중요함

    }
}
