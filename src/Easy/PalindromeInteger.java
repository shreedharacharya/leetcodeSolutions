package Easy;

public class PalindromeInteger {
    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
    }

    private static boolean isPalindrome(int num) {
        if(num<0 || (num%10 ==0 && num!=0)) return false;
        int revNo =0;
        while(num> revNo){
            revNo = revNo*10 + num%10;
            num/=10;
        }
        return (num == revNo || num == (revNo/10)) ; // when num has odd digit second case and for even digit first case


    }
}
