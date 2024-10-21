package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        // 1. 문자열 반환 - 대체하기
        System.out.println(s.replace(" and", " ,"));

        // 2. 문자열 반환 - 잘라내기
        System.out.println(s.substring(7)); // 인덱스 기준 7부터 시작이 되고 그 전에는 잘라짐
        System.out.println(s.substring(s.indexOf("Java"))); // **
        System.out.println(s.substring(0,28));
        System.out.println(s.substring(s.indexOf("I"), (s.indexOf(".")))); // ** 끝 위치는 끝 위치 `직전`까지를 자름 !!
        System.out.println(s.substring(s.indexOf("Java"), (s.indexOf("."))));
        // ref. substring -> 시작 위치 위터 끝 위치 직전까지 컷팅

        // 3. 공백 제거
        s = "       I love Java.   ";
        System.out.println(s);
        System.out.println(s.trim());

        //4. 문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1+s2);

        System.out.println(s1.concat(",").concat(s2));

    }
}
