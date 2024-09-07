import java.util.*;

public class Main {
    public static void main(String[] args) {
        int id = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            int n = sc.nextInt();
            id += n * n;
        }
        System.out.println(id % 10);

    }
}