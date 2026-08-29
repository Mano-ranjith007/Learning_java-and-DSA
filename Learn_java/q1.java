import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.print("ENTER A: ");
        int a=scan.nextInt();

        System.out.print("ENTER B: ");
        int b=scan.nextInt();

        System.out.print("ENTER C: ");
        int c=scan.nextInt();

        int d=a*b*c;
        System.out.println("d: "+d);

        int e=a+b+c;
        System.out.println("e:"+e);

        System.out.println("Final output:"+(d/e));

    }
}
