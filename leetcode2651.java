public class leetcode2651 {
    public static void main(String[] args) {
        int arrivalTime=15;
        int delayedTime=5;
        System.out.println(find(arrivalTime,delayedTime));
    }
    static int find(int arrivalTime,int delayedTime){
        int ans=arrivalTime+delayedTime;
        if(ans>=24){
         return ans-24;
        }
        else{
         return ans;
    }
}
}
