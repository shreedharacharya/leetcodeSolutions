package Easy;

public class SingleNumber136 {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{3,-4,3}));
    }

    private static int singleNumber(int[] nums) {
        int result = 0;

        for(int i=0; i<nums.length; i++){

            result^=nums[i];
        }

        return result;
    }
}
