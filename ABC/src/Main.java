import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a,b,c;
        a = sc.nextLine();
        b = sc.nextLine();
        c = sc.nextLine();
        int A = Integer.parseInt(a);
        int B = Integer.parseInt(b);
        int C = Integer.parseInt(c);
        System.out.println(A+B-C);
        System.out.println(Integer.parseInt(a+b) - Integer.parseInt(c));
    }
}