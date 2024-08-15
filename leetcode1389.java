
import java.util.*;
    public class  leetcode1389 {
    public static void main(String[] args) {
      int nums[]={0,1,2,3,4};
      int index[]={0,1,2,2,1};
      System.out.println(Arrays.toString(check(nums,index)));
    }
    static int[] check(int nums[],int index[]){
        int target[]=new int[nums.length]; 
        for(int i=0;i<nums.length;i++){
            int j=nums.length-1;
            while(j>index[i]){
                target[j]=target[j-1];
                j--;
            }
            target[index[i]]=nums[i];
        }
        return target;
    }
}
