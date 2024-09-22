public class leetcode345 {
    public static void main(String[] args) {
        String s="leetcode";
        char ch[]=s.toCharArray();
        System.out.println(reverse(ch));
    }
    static String reverse(char ch[]){
        int start=0,end=ch.length-1;
        while(start<end){
         char ch1=ch[start];
         char ch2=ch[end];
          if(ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u' || ch1=='A' || ch1=='E' || ch1=='I' || ch1=='O' || ch1=='U'){
              if(ch2=='a' || ch2=='e' || ch2=='i' || ch2=='o' || ch2=='u' || ch2=='A' || ch2=='E' || ch2=='I' || ch2=='O' || ch2=='U'){
                  char temp=ch1;
                  ch[start]=ch2;
                  ch[end]=temp;
                  start++;
                  end--;
              }
              else{
                  end--;
              }    
          }
          else{
            start++;
            // end--;
          }
        }
        String ans="";
        for(int i=0;i<ch.length;i++){
            ans=ans+ch[i];
        }
        return ans;  
    }
}
