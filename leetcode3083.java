
public class leetcode3083 {
    public static void main(String[] args) {
        String s="abcba";
        System.out.println(existence(s));
    }
    static boolean existence(String s){
        StringBuilder sb=new StringBuilder(s);
        String temp=sb.reverse().toString();
        for(int i=0;i<s.length()-1;i++){
         String str="";
         str=str+s.charAt(i)+s.charAt(i+1);
         if(temp.contains(str)){
            return true;
         }
        }
        return false;
    }
    
}