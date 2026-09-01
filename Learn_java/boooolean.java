import java.util.Scanner;
public class boooolean {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        System.out.print("is it rainning (true/false) : ");
        boolean rain=scan.nextBoolean();

        if(rain){
            System.out.println("Take an Umberlla");
        }else{
            System.out.println("Enjoy the sunlight");
        }

    }
}
