package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 문자열의 길이 출력
        System.out.println(s.length());

        // 대소문자 변환
        System.out.println(s.toUpperCase());

        System.out.println(s.toLowerCase());

        // 포함 관계
        System.out.println(s.contains("Java"));
        System.out.println(s.contains("C#"));

        // 위치 정보
        System.out.println(s.indexOf("Java"));
        System.out.println(s.indexOf("C#")); // 포함되지 않는다면 -1
        System.out.println(s.indexOf("and")); // 처음 일치하는 위치 정보
        System.out.println(s.lastIndexOf("and")); // 여러개의 겹치는 문자열이 나올때 마지막 단어의 위치를 알고 싶을 때

        // 시작 문구와 끝 문구를 확인하고 싶을 때
        System.out.println(s.startsWith("I like"));
        System.out.println(s.endsWith("Java"));





    }
}
