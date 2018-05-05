package Medium.longestSubString;

import java.util.HashMap;
import java.util.Map;

public class LongestSubString {
    public static void main(String[] args) {
        System.out.println(length("abcabcbb"));
        System.out.println(length("bbbbb"));
        System.out.println(length("pwwkew"));
    }

    private static int length(String str) {
        int len = str.length();
        int res =0;
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0, j=0; i<len; i++){
            if(map.containsKey(str.charAt(i))){
                j = Math.max(map.get(str.charAt(i)),j);
            }
          res = Math.max(res,i-j+1);
          map.put(str.charAt(i),i+1);
        }
        return res;
    }




    //my solution .. time exceed
    private static int lengthOld(String str) {
        String[] res = new String[str.length()];
        int length =0;

        for (int j = 0; j < str.length(); j++) {
            String ans = "";
            for (int i = j; i < str.length(); i++) {
                if (!ans.contains(str.charAt(i) + "")) {
                    ans = ans + str.charAt(i);
                    if(i== str.length()-1){
                        res[j]= ans;
                    }
                } else {
                    res[j]= ans;
                    break;
                }
            }
        }
        for(String s: res){
          if(s.length()>length){
              length = s.length();
          }
        }
        return length;
    }
}
