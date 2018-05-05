package Easy;

import java.util.ArrayList;
import java.util.List;

/*A binary watch has 4 LEDs on the top which represent the hours (0-11),
 and the 6 LEDs on the bottom represent the minutes (0-59).
        Each LED represents a zero or one, with the least significant bit on the right.*/
public class BinaryWatch401 {
    public static void main(String[] args) {
       System.out.println(readBinaryWatch(1));

    }

    public static List<String> readBinaryWatch(int num) {
        List<String> times = new ArrayList<>();
       for(int h=0;h<12;h++)
           for(int m=0;m<60;m++)
                if(Integer.bitCount(m+(h<<6))==num)
               //if((Integer.bitCount(h)+Integer.bitCount(m))==num)
                   times.add(String.format("%d:%02d",h,m));
       return times;
    }
}
