package chap_04;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.*;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // SwitchCase
        // 석차에 따른 장학금 지급
        // 1등 : 전액 장학금
        // 2등 : 반액 장학금
        // 3등 : 반액 장학금
        // 그 외 : 장학금 대상 아님

        // switch (expression) {
        //  case A : .. 수행할 명령
        //  break;
        //  case B : .. 수행할 명령
        //  break;
        //  case C : .. 수행할 명령
        //  break;
        //        ...
        //  default: .. 수행할 명령
        //  }


        // 내가 구현할 프로그램 학번을 치면 ,
        // map에 있는 정보를 불러 오는 형식 .
        // 여기서 SwichCase를 활용할 예정
        // 그럼 map 에는 학번과 이름 점수가 기록 되어 있어야함
        // 순서도
        // a) 간이 데이터를 저장할 데이블을 선언하고 데이터를 할당
        // b) 학번을 받는다
        // c) 학번을 받고 학점을 return 하는데 그 안에 method -> SwitchCase 메서드 + ranking 계산 메서드


        Map<String, StudentGradeInfo> gradeInfoInMemory = new HashMap<>();
        // 내가 생각한 StudentGradeInfo 의 값 넣기
        //  gradeInfoInMemory.put("20152461",StudentGradeInfo.put)
        //  gradeInfoInMemory.put("20152461",StudentGradeInfo.set)

        // new를 통해서 새로운 객체를 생성하는 이유
        // class StudentGradeInfo 는 단순히 설계도일뿐이고
        // 실제로 데이터를 저장하기 위해 값을 넣기 위해서는 객체를 새로 생성해야함
        gradeInfoInMemory.put("20152461", new StudentGradeInfo("서동희", 96));
        gradeInfoInMemory.put("20152444", new StudentGradeInfo("최진이", 83));
        gradeInfoInMemory.put("20152634", new StudentGradeInfo("이주현", 74));
        gradeInfoInMemory.put("20152512", new StudentGradeInfo("박수빈", 88));


        Scanner sc = new Scanner(System.in);
        // 스캐너 객체 생성
        // QA . 스캐너 객체 생성하여 무엇을 어떻게 동작하게 할 것인가 -> 스캐너를 자바 자체에서 정의된 클래스로 정해진 기능만 수행함
        System.out.println("학번을 입력하세요");
        String stuNumber = sc.nextLine();
        // method  - gradeInfoMemory를 순회해서 ranking 를 도출 -> switch 문을 통해 장학금 대상인지 , 아닌지 ,
        // 최종 return 값 "이름" , "학번", "점수" , "rank", "장학금 대상여부"
        StuGradeReturn dto=calStuInfo(stuNumber , gradeInfoInMemory);
        createDto(dto);

    }

    private static void createDto(StuGradeReturn dto) {
        String scholarship = dto.isScholarship() ? "장학금 대상입니다 축하드립니다" : "장학금 대상이 아닙니다";

        // StringBuilder를 사용하여 JSON 형식으로 출력하기
        StringBuilder jsonBuilder = new StringBuilder();
        jsonBuilder.append("{\n");
        jsonBuilder.append("  \"석차\": ").append(dto.getRank()).append(",\n");
        jsonBuilder.append("  \"학번\": \"").append(dto.getStuNumber()).append("\",\n");
        jsonBuilder.append("  \"이름\": \"").append(dto.getName()).append("\",\n");
        jsonBuilder.append("  \"장학금 여부\": \"").append(scholarship).append("\",\n");
        jsonBuilder.append("  \"학점\": ").append(dto.getGrade()).append("\n");
        jsonBuilder.append("}");

        // 결과 출력
        System.out.println(jsonBuilder.toString());
    }

    private static StuGradeReturn calStuInfo(String stuNumber , Map <String, StudentGradeInfo> gradeInfoInMemory ) {
        // 조회 대상 : gradeInfoInMemory Map
        //
        // method
        // gradeInfoInMemory를 전체를 순환 targetStudent 의 점수의 rank 와 SwitchCase를 통해 장학금 대상인지 파악

        List<Map.Entry<String,StudentGradeInfo>> list  = new ArrayList<>(gradeInfoInMemory.entrySet());
        Collections.sort(list, (entry1, entry2) -> Integer.compare(entry2.getValue().getGrade(), entry1.getValue().getGrade()));

        // 여기 부분 복습할 것
        // 이미 정렬이 되었으니 인덱스를 사용하여 등수를 뽑을 예정

       int index = -1;
       for(int i =0; i < list.size(); i++){
           if(list.get(i).getKey().equals(stuNumber)){
               index=i;
               break;
           }
       }
         String name = list.get(index).getValue().getName();
         int grade = list.get(index).getValue().getGrade();
         int stuRank = index+1;
         boolean scholarship2 = false;

         StuGradeReturn answerDto = new StuGradeReturn(name, stuNumber,grade , stuRank, scholarship2);
       switch (stuRank){
           case 1: answerDto.setScholarship(true);
           break;
           case 2: answerDto.setScholarship(true);
           break;
           case 3: answerDto.setScholarship(false);
           break;
           default:answerDto.setScholarship(false);
       }


        return answerDto;

    }
}

@Setter
@Getter
class StuGradeReturn {
    String name;
    String stuNumber;
    int grade;
    int rank;
    boolean scholarship;

    public StuGradeReturn(String name, String stuNumber, int grade, int rank, boolean scholarship) {
        this.name = name;
        this.stuNumber = stuNumber;
        this.grade = grade;
        this.rank = rank;
        this.scholarship = scholarship;
    }

}
@Getter
@Setter
class StudentGradeInfo {
    String name;
    int grade;


    public StudentGradeInfo(String name, int grade) {
        this.name = name;
        this.grade = grade;

    }


}

