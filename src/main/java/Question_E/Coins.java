package Question_E;
import java.util.*;
public class Coins {
    public static List<Integer> findOptimalSum(int[] coins, int amount) {
        Arrays.sort(coins);
        List<Integer> change = new ArrayList<>();
        int index = coins.length - 1;

        while (index >= 0) {
            while (amount >= coins[index]) {
                change.add(coins[index]);
                amount -= coins[index];
            }
            index--;
        }

        if (amount == 0) {
            return change;
        } else {
            return new ArrayList<>();
        }
    }
    public static void main(String[] args) {
        int[] coins = { 1, 2, 5, 8, 10 };
        int sum = 7;

        List<Integer> Possible_Sum = findOptimalSum(coins, sum);

        if (Possible_Sum.isEmpty()) {
            System.out.println("Exact change cannot be given.");
        } else {
            System.out.println("Optimal change: " + Possible_Sum);
        }
    }

}

