import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for (int i = 0; i < testCase; i++) {
            int m = sc.nextInt(); // 가로길이
            int n = sc.nextInt(); // 세로 길이
            int k = sc.nextInt(); // 배추 개수
            int[][] field = new int [m][n];
            boolean[][] visited = new boolean[m][n];
            
            // 배추 위치 설정
            for (int j = 0; j < k; j++) {
                int x = sc.nextInt(); // 배추 x좌표
                int y = sc.nextInt(); // 배추 y좌표
                field[x][y]++;
            }
            // 배추 벌레 개수 확인
            int numberOfClusters = 0;
            for (int x = 0; x < m; x++) {
                for (int y = 0; y < n; y++) {
                    if (field[x][y] == 1 && !visited[x][y]) {
                        dfs(field, visited, x, y, m, n);
                        numberOfClusters++;
                    }
                }
            }
            System.out.println(numberOfClusters);
        }
    }

    private static void dfs(int[][] field, boolean[][] visited, int x, int y, int m, int n) {
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        visited[x][y] = true;

        for (int direction = 0; direction < 4; direction++) {
            int newX = x + dx[direction];
            int newY = y + dy[direction];

            // 새로운 위치가 배열 범위를 벗어나지 않는지 확인
            if (newX >= 0 && newX < m && newY >= 0 && newY < n) {
                // 인접한 배추가 있고 방문하지 않은 경우
                if (field[newX][newY] == 1 && !visited[newX][newY]) {
                    dfs(field, visited, newX, newY, m, n);
                }
            }
        }
    }


}