import java.util.*;
public class prblm11 {
    public static void main(String[] args) {       
        Scanner scan = new Scanner(System.in);
        int[] nums = {17,255,177,234,90,99};
        System.out.print("Enter the table size : ");
        int tablesize=scan.nextInt();
        Map<Integer,Integer> map=hashindex(nums, tablesize);
        for(int i=0;i<tablesize;i++){
            if(map.containsKey(i)){
                System.out.println(i+"-->"+map.get(i));
            }else{
                System.out.println(i+"-->{empty}");
            }
        }
    }
    public static Map<Integer, Integer> hashindex(int[] nums,int tablesize){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            long square = nums[i] * nums[i];
            String str=Long.toString(square);
            int length=str.length();
            int mid=length/2;
            int middle;
            int index;
            if(length>=2){
                middle=(str.charAt(mid-1)-'0')*10+(str.charAt(mid)-'0');
                index=middle%tablesize;
                while(map.containsKey(index)){
                    index=index+1;
                }
                map.put(index, nums[i]);
            }else{
                index=0;
                middle=(int)square;
                while(map.containsKey(index)){
                    index=index+1;
                }
                map.put(index, nums[i]);
            }
        }
        return map;
    }
}
