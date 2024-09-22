public class leetcode767 {
    public static void main(String[] args) {
        String s="abc";
        System.out.println(reorganizeString(s));
    }
    static String reorganizeString(String s){
        int j=1;
        int i=0;
        String ans="";
        while(j<s.length()){
          if(s.charAt(i)!=(s.charAt(j))){
             ans=ans+s.charAt(i)+s.charAt(j);
             i++;
             j++;
          }
          else{
            j++;
          }
        }
        // ans=ans+s.charAt(i);
        if(ans.length()==s.length()){
            return ans;
        }
        return "";
    }
}
