public class leetcode3771 {
    public static void main(String[] args) {
        String s="abcd";
        int k=2;
        char ch='z';
        System.out.println((int)ch-'a');
    }
    static String check(String s,int k){
        int ans=0;
       for(int i=0;i<s.length();i++){
        for(int j=i;j<k+i;j++){
            ans=ans+(int)s.charAt(j)-s.charAt(j);
        }
       }
    }
}
