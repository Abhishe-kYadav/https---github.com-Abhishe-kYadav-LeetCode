import java.util.*;
public class leetcode2562 {
  public static void main(String[] args) {
    int nums[] = { 1, 2, 3, 4 };
    System.out.println(check(nums));
  }

  static int check(int nums[]) {
    ArrayList<String> list = new ArrayList<>();
    int s = 0;
    int e = nums.length - 1;
    int sum = 0;
    if (nums.length % 2 != 0) {
      sum = sum + nums[s + (e - s) / 2];
    }
    while (s < e) {
      String s1 = Integer.toString(nums[s]);
      String s2 = Integer.toString(nums[e]);
      list.add(s1 + s2);
      s++;
      e--;
    }
    for (int i = 0; i < list.size(); i++) {
      sum = sum + Integer.parseInt(list.get(i));
    }
    return sum;
  }
}
