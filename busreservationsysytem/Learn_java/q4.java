import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("TRAFFIC LIGTH: ");
        String light=scan.nextLine();

        if(light.equals("red")){
            System.out.println("STOP 🤚🛑");
        }else if(light.equals("yellow")){
            System.out.println("get ready 🟡🚴");
        }else if(light.equals("green")){
            System.out.println("GO 🟢🚴");
        }

    }
}
