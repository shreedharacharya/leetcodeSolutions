package Hard;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class FirstMissingPositive41 {
    public static void main(String[] args) {
        System.out.println(firstMissingPositive1(new int[]{7, 2, 2, 2, -7, 8, 8, 3, 3, 5, -1, 28,26,30, -1, -3, -7, -9, 8, 1, 4}));
    }

    private static int firstMissingPositive(int[] nums) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int num : nums)
            if (num > 0) treeSet.add(num);
        Iterator<Integer> itr = treeSet.iterator();
        int i = 1;

        while (itr.hasNext()) {
            if (i != itr.next()) return i;
            i++;
        }
        return i;

    }

    private static int firstMissingPositive1(int[] A) {
        int i = 0;
        while(i < A.length){
            if(A[i] == i+1 || A[i] <= 0 || A[i] > A.length) i++;
            else if(A[A[i]-1] != A[i]) swap(A, i, A[i]-1);
            else i++;
        }
        System.out.println(Arrays.toString(A)+"  "+A.length);
        i = 0;
        while(i < A.length && A[i] == i+1) i++;
        return i+1;
    }

    private static void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
