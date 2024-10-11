import java.util.Arrays;

public class leetcode932 {
    public static void main(String[] args) {
        int n=5;
        System.out.println(Arrays.toString(beautifulArray(n)));
    }
    static int[] beautifulArray(int n){
        int arr[]=new int[n];
        int j=0;
        for(int i=1;i<=n;i++){
            if(i*2-1<=n){
                arr[j]=i*2-1;
                j++;
            }
        }
        for(int i=1;i<=n;i++){
            if(i*2<=n){
                arr[j]=i*2;
                j++;
            }
        }
        return arr;
    }
}
