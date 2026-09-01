
import java.util.Scanner;

public class excep_handle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        try{
            int a=scan.nextInt();
            int b=10/0;
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
