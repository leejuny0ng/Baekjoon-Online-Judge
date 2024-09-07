import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 노드의 개수를 입력받는다.
        int N = scanner.nextInt();

        // 인접 리스트를 사용하여 트리를 표현한다.
        List<List<Integer>> tree = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            tree.add(new ArrayList<>());
        }

        // N-1개의 연결된 두 정점을 입력받는다.
        for (int i = 0; i < N - 1; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            tree.get(u).add(v);
            tree.get(v).add(u);
        }

        // 부모 배열을 초기화한다.
        int[] parents = new int[N + 1];
        boolean[] visited = new boolean[N + 1];

        // BFS를 사용하여 각 노드의 부모를 찾는다.
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);  // 루트를 1로 설정한다.
        visited[1] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (int neighbor : tree.get(current)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    parents[neighbor] = current;
                    queue.add(neighbor);
                }
            }
        }

        // 결과를 출력한다.
        for (int i = 2; i <= N; i++) {
            System.out.println(parents[i]);
        }

        scanner.close();
    }
}