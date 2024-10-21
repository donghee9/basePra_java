package chap_02;

// 논리 연산자
// 논리 부정 연산자
public class _04_Operator4 {
    public static void main(String[] args) {
        boolean 김치찌개 = true;
        boolean 계란말이 = false;
        boolean 제육볶음 = true;

        // 김치찌게 or 계란말이 or 제육볶음
        System.out.println(김치찌개 || 계란말이 || 제육볶음); // 하나라도 true 이면 true (괜찮은 식당)

        // 김치찌게 and 계란말이 and 제육볶음
        System.out.println(김치찌개 && 계란말이 && 제육볶음); // 모든걸 만족해야 true


        System.out.println((5 > 3) && (3 > 1));
        System.out.println((5 > 3) && (3 < 1));

        // 논리 부정 연산자
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!(5 == 5));


    }
}
