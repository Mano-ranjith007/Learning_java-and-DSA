import java.util.Scanner;
class comparisionoperator_in_if{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        //if(a>b){
         //   System.out.println(a+" is grater");
        //}else{
        //    System.out.println(b+" is greater");
        //}
        System.out.println(a>b);
        System.out.println(a==b);
    }
}