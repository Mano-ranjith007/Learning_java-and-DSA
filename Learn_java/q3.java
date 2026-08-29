import java.util.Scanner;
public class q3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); 
        int score = scan.nextInt();
        if(score<50){
            System.out.print("you need to improve");
        }else if(score>=50 && score<=70){
            System.out.println("Good job");
        }else{
            System.out.print("excellent performance");
        }
       }
}
