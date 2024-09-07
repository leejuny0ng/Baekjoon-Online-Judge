import java.util.*;

public class Main {
    static int n, m;
    static int[] arr;
    static int[] result;
    static boolean[] visited;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        result = new int[n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            arr[i] = input;
        }
        Arrays.sort(arr);
        dfs(0);
    }

    public static void dfs(int depth) {
        if(depth == m) {
            for(int i = 0; i < m; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
            return;
        }
        for(int i = 0; i < arr.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                result[depth] = arr[i];
                dfs(depth+1);
                visited[i] = false;
            }
        }
    }
}