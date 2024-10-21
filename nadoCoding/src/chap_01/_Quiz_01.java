package chap_01;

public class _Quiz_01 {

    // 퀴즈 01
    // 버스 도착 정보를 출력하는 프로그램을 작성하시오
    // 각 정보는 적절한 자료현의 변수에 정의 합니다

    // 정보
    // 버스 번호는 "1234" , "상암08"과 같은 형태
    // 남은 시간은 분 단위 예 (3분 , 5분 )
    // 남은 거리는 Km 단위 예 (1.5Km , 0.8Km )

    public static void main(String[] args) {

        String busNumber = "상암08";
        int remainingTime = 3;
        double remainingDistance = 0.9;
        System.out.println( busNumber +" 버스는" + remainingTime +"분 남았고"+ remainingDistance+ "Km 남았습니다");


    }
}
