package chap_02;
// 산술 연산자
public class _01_Operator1 {
    public static void main(String[] args) {
        // 일반 연산
        System.out.println(4 + 2);
        System.out.println(4 - 2);
        System.out.println(4 * 2);
        System.out.println(4 / 2);
        System.out.println(5 / 2);
        System.out.println(2 / 4);
        System.out.println(4 % 3);


        // 우선 순위 연산
        System.out.println(2 + 2 * 2);
        System.out.println((2 + 2) * 2);

        //변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a - b;
        System.out.println(c);

        // 증감 연산  ++ --

        // 후위 (postfix) 전위 (prefix) 증감 연산자
        // 언제 증가하는지에 따라 차이가 있다
        int val;
        val = 10;
        // ++ val 전위 연산자
        // 값을 먼저 1 증가시키고 , 그 다음에 증가된 값을 사용합니다

        System.out.println(val); //10
        System.out.println(++val); //11
        System.out.println(val); //11

        // val ++ 후위 연산자
        // 현재 값을 먼저 사용하고 그 다음에 값을 1 증가시킵니다
        val = 10;
        System.out.println(val); //10
        System.out.println(val++); //10
        System.out.println(val);//11

        val = 10;
        System.out.println(--val);// 9
        System.out.println(val); // 9

        val =10;
        System.out.println(val--); //10
        System.out.println(val);//9




    }
}
