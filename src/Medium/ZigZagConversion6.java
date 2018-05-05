package Medium;

public class ZigZagConversion6 {
    public static void main(String[] args) {
        String input = "PAYPALISHIRING";
        System.out.println(convert(input, 3));
    }

    private static String convert(String s, int nRows) {

        char[] c = s.toCharArray();
        int length = c.length;

        StringBuilder[] builders = new StringBuilder[nRows];

        for(int i=0; i<builders.length;i++){
            builders[i] = new StringBuilder();
        }

        int i=0;
        while (i<length){

            for(int idx =0; idx<nRows && i<length;idx++)// vertically down
                builders[idx].append(c[i++]);

            for(int idx = nRows-2; idx>=1 && i<length;idx--) // obliquely up
                builders[idx].append(c[i++]);
        }
        for(int idx=1; idx<nRows;idx++){
            builders[0].append(builders[idx]);
        }

        return builders[0].toString();
    }

}
