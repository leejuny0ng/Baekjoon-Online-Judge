import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
            System.out.println("\n<스케줄 추가>");
            System.out.println("b를 입력하면 스케줄 추가/변경/삭제 화면으로, q를 입력하면 스케줄 메뉴 화면으로 돌아갑니다.");
            System.out.println("(일정 제목은 한글, 알파벳 대소문자(‘a’ - ‘z’, ‘A’ - ‘Z’)와 숫자(‘0’ - ‘9’)로 조합하여 15자 이내로 작성해주세요!)");
            System.out.println("=============================================");
            System.out.println("새로운 일정 제목을 입력해주세요 :");
            System.out.println("추가할 스케줄의 시작 날짜와 시간(예: 4/22 15:30)을 입력해주세요 :");
            System.out.println("추가할 스케줄의 종료 날짜와 시간(예: 4/24 11:30)을 입력해주세요 :");
            System.out.println("추가할 스케줄의 중요도를 입력해주세요(1~3) : ");

            System.out.println("\n---------------------------");
            System.out.println("\t스케줄 추가/변경/삭제");
            System.out.println("---------------------------");
            System.out.println("1) 스케줄 추가");
            System.out.println("2) 스케줄 변경");
            System.out.println("3) 스케줄 삭제");
            System.out.println("메뉴를 선택해주세요: \n(q를 입력하면 스케줄 메뉴로 돌아갑니다)\n");
            System.out.println("(일정 제목은 한글, 알파벳 대소문자(‘a’ - ‘z’, ‘A’ - ‘Z’)와 숫자(‘0’ - ‘9’)로 조합하여 15자 이내로 작성해주세요!)");
            System.out.println("=============================================");
            System.out.println("새로운 일정 제목을 입력해주세요 :");
            System.out.println("추가할 스케줄의 시작 날짜와 시간(예: 4/22 15:30)을 입력해주세요 :");
            System.out.println("추가할 스케줄의 종료 날짜와 시간(예: 4/24 11:30)을 입력해주세요 :");
            System.out.println("추가할 스케줄의 중요도를 입력해주세요(1~3) : ");



            System.out.println("\n\n\nError! 시작 날짜 및 시간이 형식에 맞게 입력되지 않았습니다.");
            System.out.println("아무 키를 입력하면 이전 화면으로 돌아갑니다.");


            System.out.println("\n\n\nError! 종료 날짜 및 시간이 형식에 맞게 입력되지 않았습니다.");
            System.out.println("아무 키를 입력하면 이전 화면으로 돌아갑니다.");

            System.out.println("\n\nError! 해당 기간에 중복된 중요도의 일정이 존재합니다!");
            System.out.println("기존 일정의 중요도를 수정하시려면 변경창에서 수정해주시기 바랍니다.");
            System.out.println("아무 키를 입력하면 이전 화면으로 돌아갑니다.");


            System.out.println("\n추가한 일정을 저장하시겠습니까? (예: 1, 아니오: 2)");
            System.out.print(": ");
            Scanner s = new Scanner(System.in);
            // 입력 받기 위해 스캐너 s를 작성한 후 스캐너 모듈을 가져온다.
            int input = s.nextInt();
            if(input == 1) System.out.println("성공적으로 저장되었습니다!");
            else if(input == 2) System.out.println("저장이 취소되었습니다.");
            else {
                    System.out.println("Error! 형식에 맞게 입력해주세요");
                    System.out.println("추가한 일정을 저장하시겠습니까? (예: 1, 아니오: 2)");
                    System.out.print(": ");
            }

    }
}