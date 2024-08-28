public class leetcode2744 {
    public static void main(String[] args) {
        String []words={"aa","ab"};
        System.out.println( maximumNumberOfStringPairs(words));
    }
    
    static int maximumNumberOfStringPairs(String[] words) {
        int pairs=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<words.length-1;i++){
          for(int j=i+1;j<words.length;j++){
            sb.append(words[j]);
            StringBuilder rev=sb.reverse();
            if(words[i].equals(rev.toString())){
                pairs++;
            }
            sb.delete(0,words[j].length());
          }
        }
        return pairs;
    }
}
