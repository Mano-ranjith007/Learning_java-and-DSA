import java.util.*;
public class prblm12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<Integer,ArrayList<Integer>> map =new HashMap<>();
        int tablesize = 10;
        int[] nums={23,54,10,77,93,43,47,60};
        System.out.println("Before hashing : ");
        for(int i=0;i<tablesize;i++){
            System.out.println(i+"-->"+map.put(i, new ArrayList<>()));
        }
        gethash(nums, tablesize, map);
        System.out.println("After hashing : ");
        for(int i=0;i<tablesize;i++){
            System.out.println(i+"-->"+map.get(i));
        }
    }
    public static HashMap<Integer, ArrayList<Integer>> gethash(int[] nums,int tablesize,HashMap<Integer,ArrayList<Integer>> map){
        int index=0;
        for(int i=0;i<nums.length;i++){
            ArrayList<Integer> arr = new ArrayList<>();
            index =nums[i]%tablesize;
            map.get(index).add(nums[i]);
        }
        return map;
    }
}
