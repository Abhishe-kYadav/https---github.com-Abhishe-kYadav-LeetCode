import java.util.*;
public class leetcode624 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrays=new ArrayList<>();
        arrays.add(new ArrayList<>());
        arrays.add(new ArrayList<>());
        // arrays.add(new ArrayList<>());
        // arrays.get(0).add(1);
        // arrays.get(0).add(2);
        // arrays.get(0).add(3);
        // arrays.get(1).add(4);
        // arrays.get(1).add(5);
        // arrays.get(2).add(1);
        // arrays.get(2).add(2);
        // arrays.get(2).add(3);
        arrays.get(0).add(1);
        arrays.get(1).add(1);
        System.out.println(check(arrays));;
    }
    static int check(ArrayList<ArrayList<Integer>> arrays){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arrays.size()-1;i++){
            for(int j=i+1;j<arrays.size();j++){
                list.add(Math.max(Math.abs(arrays.get(i).get(0)-arrays.get(j).get(arrays.get(j).size()-1)), Math.abs(arrays.get(i).get(arrays.get(i).size()-1)-arrays.get(j).get(0))));
            }
        }
        Collections.sort(list);
        return list.get(list.size()-1);
    }
}
