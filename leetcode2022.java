import java.util.*;
import java.util.Arrays;
public class leetcode2022 {
    public static void main(String[] args) {
        int arr[] = {1,1,1,1};
        int m=4;
        int n=1;
       int a[][]=(check(arr,m,n));
       System.out.print("[");
       for(int b[]:a){
        System.out.print(Arrays.toString(b));
       }
       System.out.println("]"); 
    }
    static int[][] check(int arr[],int m,int n){
      if(arr.length<m*n || arr.length>m*n){
        return new int[0][0];
      }
      int nums[][]=new int[m][n];
      int k=0;
      int a=n;
      for(int i=0;i<m;i++){
        int j=0;
        while(k<a){
          nums[i][j]=arr[k];
          j++;
          k++;
        }
        a=a+n;
      }
      return nums;
    }
    
}
