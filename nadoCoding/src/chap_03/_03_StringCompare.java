package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 1. 문자열 비교 - 기본
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals("Java"));

        System.out.println(s2.equals("python"));

        // 2. 문자열비교 - 대소문자 상황없이 안에 내용만 보는 경우
        System.out.println(s2.equalsIgnoreCase("python"));

        // 3. 문자열 비교 - 심화
        s1 = "1234"; // a
        s2 = "1234"; // b
        // a 와 b 는 참조가 같음

        System.out.println(s1.equals(s2)); // true (내용을 비교하는것)
        System.out.println(s1 == s2);  // true (참조하고 있는 곳을 비교하는 것)

        s1 = new String("1234"); // c
        s2 = new String("1234"); // d

        // c , d 가 참조하는 곳이 다름
        System.out.println(s1 == s2);  // (참조하고 있는 곳을 비교하는 것)
        System.out.println(s1.equals(s2));// (내용을 비교하는것)

    }
}
