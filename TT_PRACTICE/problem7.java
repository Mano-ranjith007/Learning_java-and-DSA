
import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = scan.nextLine();
        System.out.print("Enter the word to search : ");
        char ch = scan.nextLine().charAt(0);
        int index=searchchar(str,ch);
        if(index!=-1){
            System.out.println("char found at "+(index+1));
        }else{
            System.out.println("char not found in the string");
        }
    }
public static int searchchar(String str,char ch){
    char[] arr=str.toCharArray();
    for(int i=0;i<str.length();i++){
        if(arr[i]==ch){
            return i;
        }
    }
    return -1;
}
}
