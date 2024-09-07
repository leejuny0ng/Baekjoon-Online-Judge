import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfPerson = sc.nextInt();
        int[] time = new int[numberOfPerson];
        for (int i = 0; i < numberOfPerson; i++) {
            time[i] = sc.nextInt();
        }
        Arrays.sort(time);
        int sumOfEachPerson = 0;
        int totalSum = 0;
        for (int i = 0; i < numberOfPerson; i++) {
            sumOfEachPerson += time[i];
            totalSum += sumOfEachPerson;
        }
        System.out.println(totalSum);

    }
}