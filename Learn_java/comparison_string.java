import java.util.Scanner;
public class comparison_string {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        //System.out.print("enter str1: ");
        //String str1=scan.nextLine();

       // System.out.print("enter str2: ");
        //String str2=scan.nextLine();

        //System.out.println(str1.equals(str2));
        //System.out.println(str1==str2);


        System.out.print("enter str1: ");
        String rcb=scan.nextLine();
        if(rcb.equals("win")){
            System.out.println("Ee sala cup namde");
        }else{
            System.out.println("lollipop");
        }

    }
}
