package Easy;

/*Given a word, you need to judge whether the usage of capitals in it is right or not.

        We define the usage of capitals in a word to be right when one of the following cases holds:

        All letters in this word are capitals, like "USA".
        All letters in this word are not capitals, like "leetcode".
        Only the first letter in this word is capital if it has more than one letter, like "Google".
        Otherwise, we define that this word doesn't use capitals in a right way.*/

public class DetectCapital520 {
    public static void main(String[] args) {
        System.out.println(isCapital("USA"));
    }

    private static boolean isCapital(String input) {

        int upperCount= 0;
        int lowerCount =0;
        for(int i=0; i<input.length();i++){

            if(Character.isUpperCase(input.charAt(i))){
                if(lowerCount>0) return false;
                upperCount++;
            }else{
                if(upperCount>1)return false;
                lowerCount++;
            }

        }
        return true;
    }
}
