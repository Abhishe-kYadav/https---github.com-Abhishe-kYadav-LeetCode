public class leetcode1544 {
        public String makeGood(String s) {
            StringBuilder sb = new StringBuilder(s);
            int i=0;
            while(i<sb.length()-1){
                char first = sb.charAt(i);
                char second = sb.charAt(i+1);
                if(isSameCharDifferentCase(first, second)){
                    sb.delete(i,i+2);
                    if(i!=0){
                        i--;
                    }
                } else{
                    i++;
                }
            }
            return sb.toString();
        }
        public boolean isSameCharDifferentCase(char a, char b){
            return Character.toLowerCase(a)== Character.toLowerCase(b) && a!= b;
        }
    }

