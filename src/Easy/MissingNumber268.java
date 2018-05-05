package Easy;

import java.util.*;

public class MissingNumber268 {
    public static void main(String[] args) {
        System.out.println((missingNumber3(new int[]{9,6,4,2,3,5,7,0,1})));
    }
    public static int missingNumber1(int[] nums) {

        Arrays.sort(nums);

        if(nums[nums.length-1]!= nums.length) return nums.length;
        else if(nums[0]!=0) return 0;
        else {
            for(int i=0; i<nums.length-1;i++){
                int expectedNo = nums[i]+1;
                if(nums[i+1]!=expectedNo) return expectedNo;
            }
        }
        return -1;

    }


    public static int missingNumber2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num:nums)
        set.add(num);

        int count = nums.length+1;
        for(int i=0; i<count;i++)
            if(!set.contains(i)) return i;
        return -1;
    }

    public static int missingNumber3(int[] nums) {
        int result = nums.length;
       for(int i=0; i<nums.length;i++){
           result^=i^nums[i];
       }
       return result;
    }
}
