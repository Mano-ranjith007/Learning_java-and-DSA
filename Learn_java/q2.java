import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("ENTER THE STUDENT NAME: ");
        String name=scan.nextLine();

        System.out.print("ENTER THE MARK: ");
        double mark=scan.nextDouble();

        System.out.print("ENTER THE DEPARTMENT: ");
        scan.nextLine();
        String dept=scan.nextLine();

        System.out.println("My Name is "+name);
        System.out.println("My Dept is "+dept);

        double new_mark=mark/10;
        System.out.print("My score is "+new_mark+"/10");

    }
}
