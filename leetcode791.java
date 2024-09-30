import java.util.HashMap;

public class leetcode791 {
    public static void main(String[] args) {
        String order="bcafg";
        String s="abcd";
        System.out.println(customSort(order,s));
    }
    static String customSort(String order,String s){
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }
        StringBuilder sb=new StringBuilder();
        for(char ch:order.toCharArray()){
            if(map.containsKey(ch)){
                for(int i=0;i<map.get(ch);i++){
                  sb.append(ch);
                }
            }
            map.remove(ch);
        }
        if(map.isEmpty()){
            return sb.toString();
        }
        for(char ch:map.keySet()){
            for(int i=0;i<map.get(ch);i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
