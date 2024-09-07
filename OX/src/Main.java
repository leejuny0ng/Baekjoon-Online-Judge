import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int score = 0;
            int consecutiveO = 0;
            String test = sc.next();

            for (int j = 0; j < test.length(); j++) {
                if(test.charAt(j)== 'O') {
                    consecutiveO++;
                    score += consecutiveO;
                } else {
                    consecutiveO = 0;
                }
            }
            System.out.println(score);
        }


    }
}