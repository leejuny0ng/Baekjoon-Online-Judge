import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Set<Integer> S = new HashSet<>();

        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {
            String command = br.readLine();

            if (command.startsWith("add")) {
                int x = Integer.parseInt(command.split(" ")[1]);
                S.add(x);
            } else if (command.startsWith("remove")) {
                int x = Integer.parseInt(command.split(" ")[1]);
                S.remove(x);
            } else if (command.startsWith("check")) {
                int x = Integer.parseInt(command.split(" ")[1]);
                if (S.contains(x)) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            } else if (command.startsWith("toggle")) {
                int x = Integer.parseInt(command.split(" ")[1]);
                if (S.contains(x)) {
                    S.remove(x);
                } else {
                    S.add(x);
                }
            } else if (command.equals("all")) {
                S.clear();
                for (int j = 1; j <= 20; j++) {
                    S.add(j);
                }
            } else if (command.equals("empty")) {
                S.clear();
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}