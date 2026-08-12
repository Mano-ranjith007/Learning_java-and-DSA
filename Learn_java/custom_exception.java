
import java.util.Scanner;
class NotValidAgeException extends Exception{
    public NotValidAgeException(String s){
        super(s);
    }
}
public class custom_exception {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            int age=scan.nextInt();
            if(age<18){
                throw new NotValidAgeException("age should be greater than 18");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("program ended");
    }   
}
