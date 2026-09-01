
import java.util.Scanner;

public class problem3{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String input=scan.nextLine();
        allsubstring(input);
    }
    public static void allsubstring(String input) {
        for(int i=0 ; i<input.length() ; i++){
            for (int j = i+1; j <=input.length(); j++){
                System.out.println(input.substring(i,j));
            }
        }
    }
}