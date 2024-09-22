public class leetcode1903 {
    public static void main(String[] args) {
        String num="4206";
        System.out.println(largestOddNum(num));
    }
    static String largestOddNum(String num){
        for(int i=num.length()-1;i>=0;i--){
            if((num.charAt(i)-'0')%2!=0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}
