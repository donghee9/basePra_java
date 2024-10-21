package chap_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class _Quiz_01_hard_level {

    // 퀴즈 01
    // 버스 도착 정보를 출력하는 프로그램을 작성하시오
    // 각 정보는 적절한 자료현의 변수에 정의 합니다

    // 정보
    // 버스 번호는 "1234" , "상암08"과 같은 형태
    // 남은 시간은 분 단위 예 (3분 , 5분 )
    // 남은 거리는 Km 단위 예 (1.5Km , 0.8Km )

    // 터미널로 상호 작호 작용 할 수 있는 프로그램으로 작성하기

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, BusInfo> busDatabases = new HashMap<>();
        busDatabases.put("상암08", new BusInfo(3, 3.5));
        busDatabases.put("구리04", new BusInfo(15, 9.3));
        busDatabases.put("3452", new BusInfo(2, 3.7));

        System.out.println("버스이름을 입력하세요");
        String busNumber = sc.nextLine();

        if (busDatabases.containsKey(busNumber)) {
            BusInfo info = busDatabases.get(busNumber);
            System.out.println(busNumber + "번 버스");
            System.out.println("남은거리" +info.getRemainingDistance());
            System.out.println("남은시간"+ info.getRemainingTime());
        } else {
            System.out.println("해당 버스 정보가 없습니다");
        }
    }
}

    class BusInfo{
        private int remainingTime;
        private double remainingDistance;

        public BusInfo(int remainingTime, double remainingDistance) {
            this.remainingTime = remainingTime;
            this.remainingDistance = remainingDistance;
        }
        public int getRemainingTime() {
            return remainingTime;
        }
        public double getRemainingDistance() {
            return remainingDistance;
        }

    }




    

