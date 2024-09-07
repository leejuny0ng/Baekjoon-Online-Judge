import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] n = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            n[i] = sc.nextInt();
        }
        int hint = 0;
        for (int i = 0; i < 7; i++) {
            if(n[i+1] > n[i]) {
                hint += 1;
            } else if(n[i+1] < n[i]) {
                hint -= 1;
            }
        }

        if(hint == 7){
            System.out.println("ascending");
        } else if(hint == -7){
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }


    }
}