import java.util.*;
public class leetcode344 {
    public static void main(String[] args) {
        String s[]={"h","e","l","l","o"};
        System.out.println(Arrays.toString(reverse(s)));
    }
   static String[] reverse(String s[]){
     int start=0;
     int end=s.length-1;
     while(start<end){
        String temp=s[start];
        s[start]=s[end];
        s[end]=temp;
        start++;
        end--;
     }
     return s;
   }
}
