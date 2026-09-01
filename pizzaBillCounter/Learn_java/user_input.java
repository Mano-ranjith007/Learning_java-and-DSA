import java.util.Scanner;
class user_input {
    public static void main(String[] args) {

        Scanner mano=new Scanner(System.in);

        System.out.print("ENTER THE VALUE OF a : ");
        int a =mano.nextInt();

        System.out.print("ENTER THE VALUE OF b : ");
        int b=mano.nextInt();

        System.out.println("ENTER THE STRING:");
        mano.nextLine();
        String name=mano.nextLine();
        
        
        System.out.println("your content: "+name);
        System.out.println("sum: "+ (a+b));
    }
}
