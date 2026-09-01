import java.util.Scanner;
public class for_loop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a: ");
        int a=scan.nextInt();
        System.out.println("enter b: ");
        int b=scan.nextInt();

        for(int i=a;i<=b;i++){
            System.out.println(i);
        }
    }
}
