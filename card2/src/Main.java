import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();

        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            q.add(i);
        }
        while(true) {
            if(q.size() == 1) break;
            q.remove(q.element());
            int temp = q.element();
            q.remove(q.element());
            q.add(temp);
        }
        System.out.println(q.element());

    }
}