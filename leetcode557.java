public class leetcode557 {
    public static void main(String[] args) {
        String s="Let's take LeetCode contest";
        System.out.println(check(s));
    }
    static String check(String s){
        StringBuilder sb=new StringBuilder();
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
               sb.append(s.charAt(i));
            }
            else{
                 ans=ans+sb.reverse().toString();
                 ans=ans+" ";
                 sb.delete(0, i);
                 
            }
        }
        ans=ans+sb.reverse().toString();
        return ans;
    }
}
