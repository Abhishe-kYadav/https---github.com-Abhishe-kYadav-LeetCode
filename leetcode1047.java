import java.util.Stack;

public class leetcode1047 {
    public static void main(String[] args) {
        String s="azxxzy";
        System.out.println(check( s));
    }
    static String check(String s){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(st.isEmpty()){
                st.push(s.charAt(i));
            }
            else if(st.peek()==s.charAt(i)){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            } 
            
        }
       StringBuilder sb=new StringBuilder();
       while(!st.isEmpty()){
        sb.append(st.peek());
        st.pop();
       }
       StringBuilder rev=sb.reverse();
        return rev.toString();
    }
}
