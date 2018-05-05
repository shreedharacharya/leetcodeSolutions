package Medium;

public class StringToInteger8 {
    public static void main(String[] args) {
        System.out.println(myAtoi("123"));
    }

    private static int myAtoi(String s) {

        if(s.isEmpty())return 0;
        int sign =1, i=0,result=0;

        while(s.charAt(i)==' ')i++;

        if(s.charAt(i)=='-'||s.charAt(i)=='+')
            sign= s.charAt(i++)=='-'?-1:1;

        while (i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9'){
            if(result> Integer.MAX_VALUE/10 || (result== Integer.MAX_VALUE/10 && s.charAt(i)-'0'>7))
                return sign==-1?Integer.MIN_VALUE:Integer.MAX_VALUE;
            result = result*10 + (s.charAt(i++)-'0');
        }
        if(sign==-1) return result*-1;
        return result;
    }
}
