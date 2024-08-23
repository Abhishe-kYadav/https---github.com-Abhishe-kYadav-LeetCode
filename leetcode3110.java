import java.util.*;
public class leetcode3110 {
    public static void main(String[] args) {
        String s="zaz";
        System.out.println(scoreString(s));
    }
    static int scoreString(String s){
        int score=0;
        for(int i=0;i<s.length()-1;i++){
           score=score+Math.abs((int)s.charAt(i)-(int)s.charAt(i+1));
        }
        return score;
    }
}
