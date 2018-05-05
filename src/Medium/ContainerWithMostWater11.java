package Medium;

public class ContainerWithMostWater11 {
    public static void main(String[] args) {
        int[] height = new int[]{1, 2, 3, 4, 5};
        System.out.println(maxArea(height));
    }

    private static int maxArea(int[] height) {
        int L = 0, R = height.length - 1;
        int area = 0;
        while (L < R) {
            area = Math.max(area, Math.min(height[L], height[R]) * (R - L));
            if (height[L] < height[R]) L++;
            else R--;
        }
        return area;

    }


}
