import java.util.*;
public class prblm13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<Character,Integer> map=new HashMap<>();
        System.out.print("Enter the string : ");
        String str=scan.nextLine();

        for(char ch:str.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else{
            map.put(ch, 1);
            }
        }
        System.out.println(map);
    }
}
