package chap_06;
// 메소드 -> 기능을 하는 묶음
public class _01_Method {
    // 메서드를 정의
    public static void sayhello(){
        System.out.println("안녕하세요 메소드 입니다");
    }

    public static void main(String[] args) {
    // 메소드를 호출
        System.out.println("메소드 호출 전");
        sayhello(); // 메서드 안으로 진입하게 됌
        System.out.println("메소드 호출 후");
    }
}
