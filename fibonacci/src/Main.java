import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int num0, num1;
    public static void fibonacci(int n) {
        // 배열을 이용해 메모이제이션 (값을 저장해서 중복 계산을 피하는 방법) 적용
        int[][] fibCounts = new int[n + 1][2];

        // 초기 값 설정
        if (n >= 0) fibCounts[0][0] = 1; // fib(0)에서 0이 호출된 횟수
        if (n >= 1) fibCounts[1][1] = 1; // fib(1)에서 1이 호출된 횟수

        // 피보나치 계산 및 0과 1 호출 횟수 누적
        for (int i = 2; i <= n; i++) {
            fibCounts[i][0] = fibCounts[i - 1][0] + fibCounts[i - 2][0]; // 0 호출 횟수
            fibCounts[i][1] = fibCounts[i - 1][1] + fibCounts[i - 2][1]; // 1 호출 횟수
        }

        // 결과 저장
        num0 = fibCounts[n][0];
        num1 = fibCounts[n][1];
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int test = sc.nextInt();
            fibonacci(test);
            System.out.println(num0 + " " + num1);
        }
    }

}