package chap_01;

public class _01_HelloWorld {


    public static void main(String[] args) {
        System.out.println("Hello World!!!");
        // print line -> 축약 한줄을 출력해줘

    }

    // 1. public class helloWorld { } => 자바 프로그램의 기본단위인 클래스를 정의함
    // 2. main 메서드 : 자바 프로그램이 실행되면 제일 먼저 main 메서드가 호출이 됌 이 메서드는 프로그램의 시작점 으로
    // `public static void main(String[] arg)`는 자바가 실행될 때 제일 먼저 호출해야할 메서드라는 의미
    // 3. 클래스 : 객체를 만들기 위한 설계도 , 객체는 실제로 메모리에 할당되는 데이터 구조를 의미하고 클래스는 그 구조를 정의 함
    // 4. 객체 :  클래스라는 설계도를 토대로 실제로 메모리에 만들어진 인스턴스
    // 5. static : 정적 멤버를 정의 할때 사용됌 정적 멤버는 클래스의 인스턴스(객체)와 상관 없이 사용할 수 있다
    //           : static 이 붙은 변수나 메서드는 클래스에 속하고 , 객체를 생성하지 않고도 사용할 수 있다 main 메서드도 정적메서드라 프로그램 실행시 자동으로 호출됌

    // 6. `String[] arg` : 는 배열로 자바 프로그램이 실행될떄 명령줄에서 전달되는 인수(arguments)를 저장함
    // 7. String[]은 문자열 타입의 배열을 의미하며 args 는 그 배열의 이름입니다

    // QA : 이 클래스에서는 객체를 만들고 있는가 ?
    // no => 객체는 클래스의 인스턴스 라고 불리며 클래스에 정의된 속성(필드)와 동작(메서드)를 가진 실제 메모리 상의 구조
    // 객체를 생성하려면 new 키워드를 사용해야한다

    // if 객체를 만들려면
    // helloWorld hw = new helloWorld();
}
