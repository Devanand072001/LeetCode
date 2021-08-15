public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }

    private static int maxArea(int[] height) {
        int max = 0;
        int i = 0; //left pointer
        int j = height.length - 1;// right pointer
        while (i < j) {
            System.out.println("pointer: " + i + " " + "pointer: " + j);
            System.out.println("element: " + height[i] + " " + "element: " + height[j]);
            System.out.println("j - i(breath): " + (j - i) + ",  min(length): " + (Math.min(height[i], height[j])));
            int area = (j - i) * Math.min(height[i], height[j]);
            if (max < area) {
                max = area;
            }
            System.out.println("area: " + area);
            System.out.println();
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return max;
    }
}
