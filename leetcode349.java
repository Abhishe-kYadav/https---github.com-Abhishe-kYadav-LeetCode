import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class leetcode349 {
    public static void main(String[] args) {
        int nums1[]={1,2,2,1};
        int nums2[]= {2,2};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }
    
    static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        for(int val:nums1){
            set1.add(val);
        }
        for(int val:nums2){
            set2.add(val);
        }
        for(int val:set1){
            if(set2.contains(val)){
                list.add(val);
            }
        }
        int ans[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}

