package Medium.multiplyString;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().multiply("12", "12"));
    }

    public String multiply(String num1, String num2) {

        String number1 = new StringBuilder(num1).reverse().toString();
        String number2 = new StringBuilder(num2).reverse().toString();

        int[] d = new int[number1.length() + number2.length()];

        for (int i = 0; i < number1.length(); i++) {
            for (int j = 0; j < number2.length(); j++) {
                d[i+j]+= (number1.charAt(i) -'0')*(number2.charAt(j) - '0');
            }
        }

        StringBuilder result = new StringBuilder();

        for(int k =0; k<d.length;k++){
            int mod = d[k]%10;
            int carry = d[k]/10;

            if(k+1<d.length){
                d[k+1] += carry;
            }
            result.insert(0,mod);
        }

        while(result.charAt(0)=='0' && result.length()>1){
            result.deleteCharAt(0);
        }


        return result.toString();
    }


}

