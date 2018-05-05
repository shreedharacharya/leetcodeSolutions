package Easy;

public class PalindromeString {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(input));
    }

    private static boolean isPalindrome(String input) {
        char[] c= input.toCharArray();
        for (int i = 0, j = c.length- 1; i < j; ) {
            if (!Character.isLetterOrDigit(c[i])) i++;
            else if (!Character.isLetterOrDigit(c[j])) j--;
            else if (Character.toLowerCase(c[i++]) != Character.toLowerCase(c[j--]))
                return false;
        }

        return true;
    }
}
