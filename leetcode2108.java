public class leetcode2108 {
    public static void main(String[] args) {
        String words[]={"def","ghi"};
        System.out.println(firstPalindrome(words));
        
    }
    static String firstPalindrome(String[] words) {
       for(int i=0;i<words.length;i++){
         StringBuilder sb=new StringBuilder(words[i]);
         sb.reverse();
         String rev=sb.toString();
         if(rev.equals(words[i])){
            return words[i];
         }
         sb.delete(0, words[i].length());
       } 
       return "";
    }
}
