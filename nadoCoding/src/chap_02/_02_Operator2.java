package chap_02;
// 대입 연산자 , 복합 대입 연산자
public class _02_Operator2 {
    public static void main(String[] args) {
        System.out.println("대입 연산자");
        // 대입 연산자
        int num = 10;
        num = num + 2;
        System.out.println(num);

        num = num - 2;
        System.out.println(num);

        num = num * 2;
        System.out.println(num);

        num = num / 2;
        System.out.println(num);

        System.out.println("복합 대입 연산자");

        // 복합 대입 연산자
        num = 10;
        num += 2;
        System.out.println(num);

        num -=2;
        System.out.println(num);

        num *= 2;
        System.out.println(num);

        num /=2;
        System.out.println(num);


    }
}
