package Medium;

import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicateNo287 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        System.out.println(findDuplicate(new int[]{1,2,3,3,4}));

        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);

    }

    private static int findDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length;i++){
            if(!set.contains(nums[i]))
                set.add(nums[i]);
               // if(set.size() != i+1)return nums[i];
            else return nums[i];
        }
        return -1;
    }
}
