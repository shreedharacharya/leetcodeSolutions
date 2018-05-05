package Easy;

public class NumberOf1Bits191 {
    public static void main(String[] args) {
        System.out.println(hammingWight(12));
    }

    private static int hammingWight(int n) {

        int bits = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) bits++;
            mask <<= 1;
        }
        return bits;
    }
}
