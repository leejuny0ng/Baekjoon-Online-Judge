import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];
        for(int i = 0; i < arrSize; i++) {
            arr[i] = sc.nextInt();
        }

        int[] dp = new int[arrSize];
        int max = 1;
        for (int i = 0; i < arrSize; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if(arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j+1]);
                }
            }
            max = Math.max(max,dp[i]);
        }

        System.out.
    }
}