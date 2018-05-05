public class CountPrimeSetBit {
    public static void main(String[] args) {
        System.out.println(countPrimeSetBit(15, 15));
    }

    private static int countPrimeSetBit(int L, int R) {
        int count = 0;
        for (int i = L; i <= R; i++) {
            int temp = Integer.bitCount(i);
            boolean isPrime = true;
            if (temp == 1) isPrime = false;
            for (int j = 2; j < temp; j++) {
                if (temp % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) count++;
        }
        return count;
    }
}
