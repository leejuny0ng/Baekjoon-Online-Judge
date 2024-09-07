import java.util.*;

public class Main {

    private static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> keyToValue = new HashMap<>();
        Map<Integer, String> valueToKey = new HashMap<>();
        int name = sc.nextInt();
        int num_of_questions = sc.nextInt();
        for(int i = 0; i < name; i++) {
            String pokemon_name = sc.next();
            keyToValue.put(pokemon_name, i+1);
        }

        for (Map.Entry<String, Integer> entry : keyToValue.entrySet()) {
            valueToKey.put(entry.getValue(), entry.getKey());
        }

        for(int i = 0; i < num_of_questions; i++) {
            String test_case = sc.next();
            if (isNumeric(test_case)) {
                int value = Integer.parseInt(test_case);
                System.out.println(valueToKey.get(value));
            } else {
                System.out.println(keyToValue.get(test_case));
            }
        }
    }
}