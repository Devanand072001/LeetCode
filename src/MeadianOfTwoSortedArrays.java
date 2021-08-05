import java.util.ArrayList;
import java.util.Collections;

public class MeadianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {2};
        int[] nums2 = {};
        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println(median);
    }

    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : nums1) {
            list.add(i);
        }
        for (int i : nums2) {
            list.add(i);
        }
        // add and sort to a common list
        Collections.sort(list);
        // if the size is even median = list size /2;
        if (list.size() % 2 != 0) {
            median = list.get(list.size() / 2);
            // if list size not even median = [i + (i+1) ]  / 2
        } else {
           /* 3, 5, 7, 12, 13, 14, 21, 23, 23, 23, 23, 29, 40, 56
            In this example the middle numbers are 21 and 23.
            To find the value halfway between them, add them together and divide by 2:
                21 + 23 = 44
            then
                44 ÷ 2 = 22*/
//            System.out.println(list.get((list.size() / 2) - 1) + " " + list.get(list.size() / 2));
            median = (double) (list.get((list.size() / 2) - 1) + list.get(list.size() / 2)) / 2;
        }
        System.out.println(median);
        return median;
    }
}
