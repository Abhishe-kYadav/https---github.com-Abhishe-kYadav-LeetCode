public class leetcode2278 {
    public static void main(String[] args) {
        String s="foobar";
        char letter='o';
        System.out.println(percentageLetter(s,letter));

    }
    static int percentageLetter(String s, char letter) {
        int count=0;
        for(int i=0;i<s.length();i++){
           if(letter==s.charAt(i)){
            count++;
           }
        }
        if(count!=0){
            System.out.println(count);
           int ans= Math.round((count*100)/s.length());
           System.out.println(ans);
            return ans;
        }
        return count;
    }
}

