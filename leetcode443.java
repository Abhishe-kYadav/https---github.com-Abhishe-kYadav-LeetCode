import java.util.Arrays;
import java.util.HashMap;

public class leetcode443 {
  public static void main(String[] args) {
    char chars[]={'a','b','b','b','b','b','b','b','b','b','b','b','b'};
    System.out.println(compression(chars));
  }
  static int compression(char chars[]){
    int freq[]=new int[26];  
    for(int i=0;i<chars.length;i++){
        freq[chars[i]-'a']++;
    }
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<26;i++){
        if(freq[i]==1){
            sb.append((char)(i+'a'));
        }
        else if(freq[i]>1){
            sb.append((char)(i+'a'));
            sb.append(freq[i]);
        }
    }
   for(int i=0;i<sb.length();i++){
     chars[i]=sb.charAt(i);
   }
    return sb.length();
  }
    
}