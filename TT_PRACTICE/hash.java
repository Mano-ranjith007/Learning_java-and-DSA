
import java.util.HashMap;

public class hash {
    public static void main(String[] args) {
        HashMap<Integer,String> hash=new HashMap<>();
        hash.put(1,"mano");
        hash.put(2,"kavi");
        hash.put(3,"manoj");
        System.out.println("size of the table : "+hash.size());
        System.out.println(hash);
        hash.remove(3);
        System.out.println(hash);
        System.out.println("new size : "+hash.size());
    }
}
