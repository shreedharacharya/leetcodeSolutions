package Test;

import java.util.HashMap;

public class IsCryptSolution {

    public static void main(String[] args) {

       String[] crypt= {"SEND",
                "MORE",
                "MONEY"};
       char[][] solution= {{'O','0'},
 {'M','1'},
 {'Y','2'},
 {'E','5'},
 {'N','6'},
 {'D','7'},
 {'R','8'},
 {'S','9'}};
        System.out.println(new IsCryptSolution().isCryptSolution(crypt,solution));
    }
    boolean isCryptSolution(String[] crypt, char[][] solution) {

        char[] s1 = crypt[0].toCharArray();
        char[] s2 = crypt[1].toCharArray();
        char[] s3 = crypt[2].toCharArray();

        HashMap<Character,Integer> map = new HashMap<>();

        for(char[] out:solution){
            map.put(out[0],out[1]-'0');
        }

        int w1 = getNum(s1, map);
        System.out.println(w1);
        if(w1 == -1) return false;
        int w2 = getNum(s2, map);
        System.out.println(w2);
        if(w2 == -1) return false;
        int w3 = getNum(s3, map);
        System.out.println(w3);

        if(w1== -1) return false;

        if((w1+w2) != w3) return false;
        return true;

    }

    int getNum(char[] s1,  HashMap<Character,Integer> map){

        StringBuilder sb1 = new StringBuilder();
        int i=0;
        for(char c: s1){
            if(map.get(c)==0 && i==0) return -1;
            sb1.append(map.get(c));
            i++;
        }
        return Integer.valueOf(sb1.toString());
    }

}
