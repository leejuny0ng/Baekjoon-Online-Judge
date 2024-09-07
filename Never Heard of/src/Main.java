import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int m = sc.nextInt();

       HashSet<String> never_heard = new HashSet<>();
       ArrayList<String> never_seen = new ArrayList<>();

       for(int i = 0; i < n; i++) {
           String nHeard = sc.next();
           never_heard.add(nHeard);
       }
       for(int i = 0; i < m; i++) {
           String nSeen = sc.next();
           if(never_heard.contains(nSeen)) {
               never_seen.add(nSeen);
           }
       }
       System.out.println(never_seen.size());
       Collections.sort(never_seen);
       for(int i = 0; i < never_seen.size(); i++) {
           System.out.println(never_seen.get(i));
       }
    }
}
