import java.util.HashSet;
import java.util.Set;

public class leetcode2716 {
    public static void main(String[] args) {
        String s="baadccab";
        System.out.println(minString(s));
    }
    static int minString(String s){
        Set<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
           set.add(s.charAt(i));
        }
        return set.size();
    }
}
