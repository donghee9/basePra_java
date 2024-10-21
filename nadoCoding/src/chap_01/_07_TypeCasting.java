package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형 변환 TypeCasting
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로
        // before we start 1
        // => 형 변환을 하면 선언을 했을 때 확보했던 메모리 양을 다시 재조정하는가 ?


        // 형변환은 값의 타입을 일시적으로 바꾸는 것이지,
        // 메모리 크기를 재조정하지 않습니다.
        // 변수는 선언할 때 지정된 타입에 따라 메모리가 할당되며,
        // 형변환은 메모리 크기에 영향을 주지 않습니다.
        // 값을 더 큰 타입으로 변환할 때는 *임시적*으로 더 큰 타입에 맞게 표현됩니다.

        // before we start 2
        // => 변수를 다시 선언하면 될 텐데 형변환을 하면 이점이 뭔가 ?

        /*
        1. 정수에서의 정확도 보장
           int a = 5, b = 2;
           double result = (double) a / b; // 결과: 2.5
         */

        /*
        2. 타입이 다른 변수 간 연산
            int a = 10;
            double b = 3.5;
            double sum = a + b; // 결과: 13.5
         */
          /*
        3. 메모리 절약
            double pi = 3.14159;
            int roundedPi = (int) pi; // 결과: 3
         */

        // int to float , double
        int score = 93;
        System.out.println(score);   // 93
        System.out.println((float) score); // 93.0
        System.out.println((double) score);  // 93.0

        // float to double, int
        float score_F = 23.22F;
        double score_D = 23.22;

        System.out.println((int) score_D);
        System.out.println((int) score_F);

        // 정수 + 실수 연산

        // score = 93 + 98.8 ;
        score = 93 + (int) 98.8;
        System.out.println(score);

        score_D = 93 + 98.8;
        System.out.println(score_D);

        // 변수의 형변환된 데이터 집어 넣기
        double convertScoreDouble = score; // 191 -> 191.0 으로 자동으로 형변환이 됌
        // int -> long -> float -> double (작은 범위에서 큰범위는 자동으로 형변환)

        // int convertScoreInt = score_D; (큰 범위의 데이터가 작은 범위에 다 담기지 않아서 짤린다)
        int convertScoreInt = (int) score_D;
        // double -> float -> long -> int  (큰범위에서 작은 범위는 데이터가 짤림 형 변환을 수동으로 해줘야함)


        // 숫자를 문자열로 바꾸는 것
        String s1 = String.valueOf(93); // String 클래스를 써야함
        s1 = Integer.toString(93); // Integer 클래스를 쓰는 법
        // String 이라는 클래스가 제공하는 valueOf 라는 기능을 사용해서 문자열로 바꿔 준다고 생각하면 됌

        System.out.println(s1);

        String s2 = String.valueOf(98.8); // String 클래스를 쓰는법
        s2 =Double.toString(98.8);  // Double 클래스를 쓰는법
        System.out.println(s2);

        // 문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i);

        double d = Double.parseDouble("98.8");
        System.out.println(d);



    }
}
