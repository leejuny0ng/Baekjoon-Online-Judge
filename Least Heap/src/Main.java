import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_number = sc.nextInt();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i = 0; i < test_number; i++) {
            int input = sc.nextInt();
            if(input == 0) {
                if(minHeap.size() != 0){
                    System.out.println(minHeap.peek());
                    minHeap.poll();
                }
                else System.out.println("0");
            } else {
                minHeap.add(input);
            }
        }
    }
}