package chap_01;

public class _06_Constants {
    public static void main(String[] args) {
        String KR_COUNTRY_CODE = "+82";
        KR_COUNTRY_CODE = "+8282";
        System.out.println(KR_COUNTRY_CODE);

        final String KR_COUNTRY_CODE2 = "+82";
        //KR_COUNTRY_CODE2 = "+8282";
        System.out.println(KR_COUNTRY_CODE2);

        // 수학용 계산을 해야할 때.
        final double PI =3.141592;
        System.out.println(PI);


    }
}
