import java.util.*;
public class leetcode344 {
    public static void main(String[] args) {
        char s[]={'h','e','l','l','o'};
        reverse(s);
        System.out.println(Arrays.toString(s));
    }
   static void reverse(char s[]){
     int start=0;
     int end=s.length-1;
     while(start<end){
        char temp=s[start];
        s[start]=s[end];
        s[end]=temp;
        start++;
        end--;
     }
   }
}
