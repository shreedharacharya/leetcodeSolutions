package Medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LetterCombinationOfPhoneNo17 {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }

    private static List<String> letterCombinations(String s) {
        LinkedList<String> ans = new LinkedList<>();
        if(s.isEmpty())return ans;
        String[] mapping = new String[] {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ans.add("");
        for(int i=0; i<s.length();i++){
            int x = Character.getNumericValue(s.charAt(i));

            while (ans.peek().length() == i){
                String t = ans.remove();
                for(char c : mapping[x].toCharArray()){
                    ans.add(t+c);
                }
            }
        }
        return ans;
    }
}
