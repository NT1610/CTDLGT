import java.util.*;

public class ADAFRIEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long k = sc.nextLong();
        Map<String, Long> expenses = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            long cost = sc.nextLong();
            expenses.put(name, expenses.getOrDefault(name, 0L) + cost);
        }

        List<Long> sortedExpenses = new ArrayList<>(expenses.values());
        Collections.sort(sortedExpenses, Collections.reverseOrder());

        long maxSavings = 0;
        for (int i = 0; i < sortedExpenses.size() && i < k; i++) {
            maxSavings += sortedExpenses.get(i);
        }
        System.out.println(maxSavings);


        sc.close();
    }
}