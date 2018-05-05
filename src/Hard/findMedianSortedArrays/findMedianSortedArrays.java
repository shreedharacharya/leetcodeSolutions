package Hard.findMedianSortedArrays;

public class findMedianSortedArrays {
    public static void main(String[] args) {
        int[] num1 = new int[]{3};
        int[] num2 = new int[]{1,2,4};
        System.out.println(findMedian(num1, num2));
    }

    private static double findMedian(int[] A, int[] B) {
        int m = A.length;
        int n= B.length;

        if(m>n){ // to ensure m<=n
            int[] temp = A; A = B; B = temp;
            int tmp = m; m = n; n = tmp;
        }
        int iMin = 0, iMax = m;
        int i,j, half = (m+n+1)/2;
        while (iMin<= iMax){

            i = (iMin + iMax)/2;
            j = half - i;

            if( i<iMax && B[j-1]>A[i]){
                iMin = iMin +1; // i is too small
            }else if(i> iMin && A[i-1]>B[j]){
                iMax = iMax-1; // i is too big
            }else { // i is perfect
                int leftMax =0;
                if(i ==0) leftMax = B[j-1];
                else if(j == 0) leftMax = A[i-1];
                else leftMax = Math.max(A[i-1],B[j-1]);

                if((m+n)%2==1) return leftMax;

                int rightMin =0;
                if(i==m) rightMin = B[j];
                else if (j == n) rightMin = A[i];
                else rightMin = Math.min(A[i],B[j]);

                return (leftMax +rightMin)/2.0;
            }
        }
        return 0.0;
    }
}
