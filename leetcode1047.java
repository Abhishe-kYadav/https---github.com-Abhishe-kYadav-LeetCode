public class leetcode1047 {
    public static void main(String[] args) {
        String s="abbaca";
        System.out.println(check( s));
    }
    static String check(String s){
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<sb.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
               sb.delete(i, i+2);
            }
        }
        return sb.toString();
    }
}
