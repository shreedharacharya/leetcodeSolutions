package Easy;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    private static int reverse(int num) {
       // 2147483647
        // -2147483648
        int result =0;
        while(num!=0){
            int rem = num%10;
            int newResult = (result*10) + rem;
            if((newResult - rem)/10 != result) return 0;
            result = newResult;
            num/=10;
        }
        return result;
    }
}
