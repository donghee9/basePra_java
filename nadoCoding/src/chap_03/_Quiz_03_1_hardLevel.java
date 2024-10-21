package chap_03;
import java.util.Scanner;



//public class _Quiz_03_hardLevel {
//    // 문제 : 주민등록번호에서 생년월일 및 성볗까지만 출력하는 프로그램을 작성하시오
//    // 참고 : 1. 주민등록 번호는 13자리의 숫자로 구성
//    //       2. 앞 6자리는 생년월일 정보 , 뒷 7자리 중 첫번째 숫자는 성별 정보
//    //       3. 입력 데이터는 - 을 포함한 14자리 문자열 형태
//
//    // 예시 "901231-1234567" ->901231-1******
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number \n (Hyphen must be included):");
//        String idNumber = sc.nextLine();
//        ValidOrNot output = new ValidOrNot(idNumber);
//        System.out.println(output);
//    }
//
//
//class ValidOrNot {
//    private String errorMessage;
//    private String outputMessage;
//
//    public ValidOrNot(String idNumber) {
//        if (idNumber.length() != 14) {
//            this.errorMessage = setErrorMessage("주민번호의 갯수가 맞지 않습니다");
//            if (idNumber.equals("-")) {
//                this.errorMessage = setErrorMessage("-을 넣어주세요");
//            }
//        } else {
//            this.outputMessage=setOutputMessage(idNumber.substring(idNumber.indexOf(8)).concat("******"));
//        }
//    }
//
//    public String getErrorMessage() {
//        return errorMessage;
//    }
//
//    public String getOutputMessage() {
//        return outputMessage;
//    }
//
//    public String setErrorMessage(String errorMessage) {
//        return errorMessage;
//    }
//
//    public String setOutputMessage(String outputMessage) {
//        return outputMessage;
//    }
//}
public class _Quiz_03_1_hardLevel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number \n (Hyphen must be included):");
        String idNumber = sc.nextLine();
        ValidOrNot output = new ValidOrNot(idNumber);
        System.out.println(output);
    }
}
class ValidOrNot {
    private String errorMessage;
    private String outputMessage;

    public ValidOrNot(String idNumber) {
        if(idNumber.length() != 14){
            this.errorMessage = "주민번호의 갯수가 맞지 않습니다";
        } else if (!idNumber.contains("-")) {
            this.errorMessage ="- 을 넣어주세요";

        }else {
            this.outputMessage =idNumber.substring(0, 8).concat("******");
        }
    }
    public String getErrorMessage() {
        return errorMessage;
    }

    public String getOutputMessage() {
        return outputMessage;
    }

    @Override
    public String toString() {
        if (errorMessage != null) {
            return errorMessage;
        }
        return outputMessage;
    }
}


