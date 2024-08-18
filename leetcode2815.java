public class leetcode2815 {
    public static void main(String[] args) {
        int nums[]={2536,1613,3366,162};
        System.out.println(maxPairSum(nums));
    }
    static int maxPairSum(int nums[]){
        int max=-1;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int digit1=find(nums[i]);
                int digit2=find(nums[j]);
                if(digit1==digit2){
                    max=Math.max(max,nums[i]+nums[j]);
                }
            }
        }
       
        return max;
    }
    static int find(int n){
        int r=0;
        int max=0;
        while(n>0){
             r=n%10;
             max=Math.max(max,r);
             n=n/10;
        }
        return max;
    }
}
