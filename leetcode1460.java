import java.util.Arrays;

public class leetcode1460 {
    public static void main(String[] args) {
        int target[]={1,2,3,4};
        int arr[]={2,4,1,3};
        System.out.println(canBeEqual(target,  arr));
    }
    static boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        int i=0;
        int j=0;
        while(i<arr.length && j<target.length){
            if(arr[i]!=target[j]){
                return false; 
            }
            i++;
            j++;
        }
        return true;
    }
}
