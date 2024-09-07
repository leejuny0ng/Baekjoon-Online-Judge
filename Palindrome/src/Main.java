import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int number = sc.nextInt();
            if(number==0) break;
            if(isPalindrome(number)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

    public static boolean isPalindrome(int number) {
        String str = Integer.toString(number);
        int len = str.length();
        for(int i=0; i<len; i++){
            if(str.charAt(i) != str.charAt(len-1-i)){
                return false;
            }
        }
        return true;
    }
}
