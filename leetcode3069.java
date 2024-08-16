import java.util.ArrayList;
import java.util.Arrays;

public class leetcode3069 {
    public static void main(String[] args) {
        int nums[] = { 5, 4, 3, 8 };
        System.out.println(Arrays.toString(check(nums)));
    }

    static int[] check(int nums[]) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(nums[0]);
        list2.add(nums[1]);
        int i = 2;
        while (i < nums.length) {
            if (list1.get(list1.size() - 1) > list2.get(list2.size() - 1)) {
                list1.add(nums[i]);
                i++;
            } else {
                list2.add(nums[i]);
                i++;
            }
        }
        int k = 0;
        int l = 0;
        for (int j = 0; j < nums.length; j++) {
            if (j < list1.size()) {
                nums[j] = list1.get(k);
                k++;
            } else {
                nums[j] = list2.get(l);
                l++;
            }
        }
        return nums;
    }
}
