import java.util.*;

public class leetcode2357 {
  public static void main(String[] args) {
    int nums[] = {0,2,3,2,5};
    System.out.print(check(nums));
  }

  static int check(int nums[]) {
    Set<Integer> set=new HashSet<>();
    for(int val:nums){
      if(val>0){
        set.add(val);
      }
    }
   return set.size();
  }
}

