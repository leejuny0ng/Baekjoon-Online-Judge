import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] arr = new int[100001];
        int[] prefixSum = new int[100001];
        prefixSum[0] = arr[0];
        for(int i = 0; i < n; i++) {
            int nums_to_sum = sc.nextInt();
            arr[i] = nums_to_sum;
            prefixSum[i+1] = prefixSum[i] + arr[i];
        }

        for(int i = 0; i < m; i++) {
            int first_num = sc.nextInt();
            int second_num = sc.nextInt();
            int sum = 0;
            sum = prefixSum[second_num] - prefixSum[first_num - 1];
            System.out.println(sum);
        }

    }
}