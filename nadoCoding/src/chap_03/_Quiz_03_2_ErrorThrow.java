package chap_03;

import java.util.Scanner;

public class _Quiz_03_2_ErrorThrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number \n (Hyphen must be included):");
        String id = sc.nextLine();


        try {
            ValidOrNot2 output = new ValidOrNot2(id);
            System.out.println(output);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
class ValidOrNot2 {
    private String outputMessage;
    public ValidOrNot2(String id) {
        if(id.length() != 14){
            throw new IllegalArgumentException("주민번호 갯수가 맞지 않습니다");
        }
        if(!id.contains("-")){
            throw new IllegalArgumentException("-을 넣어주세요");
        }
        this.outputMessage = id.substring(0, 8).concat("******");
    }
    public String getOutputMessage() {
        return outputMessage;
    }

    @Override
    public String toString() {
        return outputMessage;
    }
}
