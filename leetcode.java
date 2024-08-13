import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class leetcode {
    public static void main(String[] args) {
        int nums1[]={1,2,3,3};
        int nums2[]={1,1,2,2};
       
        System.out.println(check(nums1,nums2));
    }
    static List<List<Integer>> check(int nums1[],int nums2[]){
      List<List<Integer>> list=new ArrayList<>();
      list.add(new ArrayList<>());
      list.add(new ArrayList<>());
      Set<Integer> set1=new HashSet<>();
      Set<Integer> set2=new HashSet<>();
      for(int i:nums1){
        set1.add(i);
      }
      for(int i:nums2){
        set2.add(i);
      }
      for(int i:set1){
        if(!set2.contains(i)){
            list.get(0).add(i);
        }
      }
      for(int i:set2){
        if(!set1.contains(i)){
            list.get(1).add(i);
        }
      }
      
     return list; 
       
    }
}
