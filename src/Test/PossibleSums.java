package Test;

import java.util.*;

public class PossibleSums {

    public static void main(String[] args) {

      //  For coins = [10, 50, 100] and quantity = [1, 2, 1],
        System.out.println( new PossibleSums().possibleSums(new int[]{10,50,100},new int[]{1,2,1}));
    }
    int possibleSums(int[] coins, int[] quantity) {
        Set<Integer> sums = new HashSet<Integer>();
        sums.add(0);
        for (int i = 0; i < quantity.length; ++i) {
            List<Integer> sumsNow = new ArrayList<Integer>(sums);
            System.out.println("*******"+Arrays.toString(sumsNow.toArray(new Integer[sumsNow.size()])));
            System.out.println("Most outer for");
            for (Integer sum : sumsNow) {
                System.out.println("outer for");
                for (int j = 1; j <= quantity[i]; ++j) {
                    System.out.println("Inner for");
                    sums.add(sum + j * coins[i]);
                    System.out.println(Arrays.toString(sums.toArray(new Integer[sums.size()])));
                }
            }
        }
        return sums.size() - 1;
    }
}

