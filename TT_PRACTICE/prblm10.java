import java.util.*;

public class prblm10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<Integer,Integer> map = new HashMap<>();
        System.out.print("Enter the size of the table : ");
        int size=scan.nextInt();
        int[] nums={25,10,12,11,22,33,54,45};
        for(int n:nums){
            int index=n%size;
            while(map.containsKey(index)){
                index=index+1;
            }
            map.put(index,n);
        }

        for(int i=0;i<size;i++){
            if(map.containsKey(i)){
                System.out.println(i+"-->"+map.get(i));
            }else{
                System.out.println(i+"-->{empty}");
            }
        }
        System.out.print("What key do you want to search in the table : ");
        int key=scan.nextInt();
        System.out.println("searched : "+map.get(key));
    }
}
