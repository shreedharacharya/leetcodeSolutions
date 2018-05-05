package hackerRank;

public class MiniMaxSum {
    public static void main(String[] args) {
        int[] num = new int[]{1, 2, 3, 4, 5};
        printMinMax(num);
    }

    private static void printMinMax(int[] num) {

        long highest = 0;
        long smallest = Long.MAX_VALUE;
        for (int j = 0; j < num.length; j++) {
            long sum = 0;
            for (int i = 0; i < num.length; i++) {
                if (j != i)
                    sum = sum + num[i];
            }
            if (sum > highest) highest = sum;
            if (sum < smallest) smallest = sum;
        }
        System.out.println(smallest +"  "+ highest);
    }
}
