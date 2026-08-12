import java.util.Scanner;
public class q11 {
    String mark(String result){
        return result;
        }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the mark: ");
        int mark=scan.nextInt();
        String result;
        result =(mark<35)?"fail":"pass";
        q11 score=new q11();
        System.out.println(score.mark(result));
    }
}

































