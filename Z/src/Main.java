import java.util.*;

public class Main {
    static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();
        n = (int)Math.pow(2, n);

        find(n, r, c);
        System.out.println(cnt);
    }

    private static void find(int n, int r, int c) {
        if(n == 1) return;

        if(r < n/2 && c < n/2) { // 1 사분면
            find(n/2, r, c);
        } else if (r < n/2 && c >= n/2) { // 2 사분면
            cnt += n * n / 4;
            find(n/2, r, c - n/2);
        } else if (r >= n/2 && c < n/2) { // 3 사분면
            cnt += n * n / 4 * 2;
            find(n/2, r - n/2, c);
        } else if (r >= n/2 && c >= n/2) { // 4 사분면
            cnt += n * n / 4 * 3;
            find(n/2, r - n/2, c - n/2);
        }
    }
}