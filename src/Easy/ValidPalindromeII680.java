package Easy;

// 680.Given a non-empty string s, you may delete at most one character. Judge whether you can make it a palindrome.
public class ValidPalindromeII680 {
    public static void main(String[] args) {
        String input = "ebcbbececabbacecbbcbe";
        System.out.println(isPalindrome(input));
    }

    private static boolean isPalindrome(String input) {
        char[] c = input.toCharArray();
        for (int i = 0, j = c.length - 1; i < j; i++, j--) {

            if (c[i] != c[j]) {
                return (checkForPal(c, i, j - 1) || checkForPal(c, i + 1, j));
            }
        }
        return true;
    }

    private static boolean checkForPal(char[] c, int i, int j) {
        for (; i < j; i++, j--) {

            if (c[i] != c[j]) return false;
        }
        return true;
    }
}
