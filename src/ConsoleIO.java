import java.util.Scanner;

public class ConsoleIO {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //사용자 디바이스 입력장치 연결 = 키보드 ...

        System.out.print("아이디를 입력해주세요. >>"); //print는 바로 옆에서 입력 가능
        String username = sc.nextLine();

        System.out.println("생년월일을 입력해주세요. >>"); //println은 엔터 포함
        int birthDate = sc.nextInt();

        System.out.printf("%s %d", username,birthDate);
    }
}
