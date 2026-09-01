import java.util.Scanner;
public class paramerterized_constructor {

    paramerterized_constructor(int a,int b) {
        System.out.println("sum of the numbers: "+(a+b));
    }

    public paramerterized_constructor(int a,int b,int c) {
        System.out.println("product  the numbers: "+(a*b*c));
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter a: ");
        int a=scan.nextInt();
        System.out.print("enter b: ");
        int b=scan.nextInt();
        System.out.print("enter c: ");
        int c =scan.nextInt();
        paramerterized_constructor obj=new paramerterized_constructor(a,b);
        paramerterized_constructor obj2=new paramerterized_constructor(a,b,c);
    }
}
