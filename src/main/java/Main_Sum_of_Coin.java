import java.util.*;
import java.util.stream.Collectors;

public class Main_Sum_of_Coin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] elements = in.nextLine().substring(7).split(", ");
        int[] coins = new int[elements.length];
        for (int i = 0; i < coins.length; i++) {
            coins[i] = Integer.parseInt(elements[i]);
        }

        int targetSum = Integer.parseInt(in.nextLine().substring(5));


        Map<Integer, Integer> usedCoins = chooseCoins(coins, targetSum);

        for (Map.Entry<Integer, Integer> usedCoin : usedCoins.entrySet()) {
            System.out.println(usedCoin.getKey() + " -> " + usedCoin.getValue());
        }
    }

    public static Map<Integer, Integer> chooseCoins(int[] coins, int targetSum) {
        List<Integer> sortedCoins = Arrays.stream(coins).boxed()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
        Map<Integer, Integer> chosenCoins = new LinkedHashMap<>();
        int currentSum = 0; int coinIndex = 0;
        int notChosenCount = 0;
        int[] chosenSet = sets.get(0);
        for (int[] set : sets) {
            int count = 0;
            for (int elem : set) {
                if (universeSet.contains(elem)) {
                    count++;
                }
            }
            if (notChosenCount < count) {
                notChosenCount = count;
                chosenSet = set;
            }
        }
        selectedSets.add(chosenSet);
        for (int elem : chosenSet) {
            universeSet.remove(elem);
        }
        if (currentSum != targetSum)
            throw new IllegalArgumentException();
        return chosenCoins;
    }
}