public class leetcode796 {
    public static void main(String[] args) {
        String s="abcde";
        String goal="abced";
        System.out.println(check(s,goal));
    }
    static boolean check(String s,String goal){
        StringBuilder sb=new StringBuilder(s);
        int i=0;
        while(i<s.length()){
            char ch=sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(ch);
            if(sb.toString().equals(goal)){
                return true;
            }
            i++;
        }
        return false;
        }
        
    
   
}
