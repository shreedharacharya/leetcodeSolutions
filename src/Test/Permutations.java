package Test;

public class Permutations {

    public static void main(String[] args) {
        Permutations permutations = new Permutations();
        String input = "ABCDEF";
        permutations.printPermutations(input,0,input.length()-1);
    }

    private void printPermutations(String input, int l, int r) {

        if(l== r){
            System.out.println(input);
        }else{
            for(int i=l; i<=r;i++){
                input = swap(input,l,i);
                printPermutations(input, l+1,r);
                input = swap(input,l,i);
            }
        }
    }

    private String swap(String input, int l, int i) {
        char[] charArray = input.toCharArray();
        char temp;
        temp=charArray[l];
        charArray[l] = charArray[i];
        charArray[i]=temp;
        return String.valueOf(charArray);
    }
}
