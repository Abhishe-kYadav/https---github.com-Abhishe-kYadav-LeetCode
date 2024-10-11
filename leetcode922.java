import java.util.Arrays;

public class leetcode922 {
    public static void main(String[] args) {
        int nums[]={2,5,3,4};
        System.out.println(Arrays.toString(sortArrayByParityII(nums)));
    }
    static int[] sortArrayByParityII(int[] nums) {
        int ans[]=new int[nums.length];
        int j=0;
        int k=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0 && j<nums.length){
                ans[j]=nums[i];
                j=j+2;
            }
            else{
                ans[k]=nums[i];
                k=k+2;
            }
        }
        return ans;
        
    }
}
