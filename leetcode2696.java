public class leetcode2696 {
    public static void main(String[] args) {
        String s = "ACBBD";
        System.out.println(minLength(s));
    }
    static int minLength(String s) {
        boolean check=true;
        String str=s;
        while(check!=false){
            if(str.contains("AB")){
                str=str.replace("AB", "");
            }
            else if(str.contains("CD")){
                str=str.replace("CD", "");
            }
            else{
                check=false;
            }
        }
        return str.length();
    }
}
