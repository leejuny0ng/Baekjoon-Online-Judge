import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int h, w, n;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int room = 0;
        outerLoop:
        for(int i = 0; i < a; i++) {
            h = sc.nextInt();
            w = sc.nextInt();
            n = sc.nextInt();
            for(int p = 1; p <= w; p++) {
                for (int q = 1; q <= h; q++) {
                    room = q*100 + p;
                    n--;
                    if(n == 0) {
                        System.out.println(room);
                        continue outerLoop;
                    }

                }
            }
        }

    }
}