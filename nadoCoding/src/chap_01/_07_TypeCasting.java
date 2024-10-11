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

        System.out.println((int)score_D);
        System.out.println((int)score_F);



    }
}
