package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수 문자 EscapeSequence
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재미있어요");

        // \n :줄 바꿈
        System.out.println("자바가\n너무\n재미있어요");

        // 해물파전 9000원
        // 김치전 8000원
        // 부추전 8000원

        // \t: 글자의 간격 맞추기 : 탭 효과
        System.out.println("해물파전\t9000원");
        System.out.println("김치전\t8000원");
        System.out.println("부추전\t8000원");

        //`\`를 표현하고 싶을 때는 `\\` 두번 (폴더 경로)
        // System.out.println("C:\Program Files\Java");
        System.out.println("C:\\Program Files\\Java");

        // 단비가 "냐옹" 이라고 했어요
        System.out.println("단비가 \"냐옹\" 이라고 했어요");
        System.out.println("단비가 \'냐옹\' 이라고 했어요");

    }
}
