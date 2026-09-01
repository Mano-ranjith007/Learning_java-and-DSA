
import java.util.Scanner;
class deletion{
    String delete(int delpos,String result){
        if(delpos<0){
            delpos = 0;
        }
        if(delpos>result.length()){
            delpos=result.length();
        }
        char[] delres = new char[result.length()-1];
        for(int i=0 ; i<delpos;i++){
            delres[i]=result.charAt(i);
        }
        for(int i=delpos+1 ; i<result.length();i++){
            delres[i-1]=result.charAt(i);
        }
        return new String(delres);
    }
}
public class problem4 {
    public static String insertchar(String str,int pos,char ch){
        if(pos<0){
            pos=0;
        }
        if(pos>str.length()){
            pos=str.length();
        }
        char[] result = new char[str.length()+1];
        for(int i=0;i<pos;i++){
            result[i]=str.charAt(i);
        }
        result[pos] = ch;
        for(int i=pos;i<str.length();i++){
            result[i+1]=str.charAt(i);
        }
        return new String(result);
}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = scan.nextLine();
        System.out.print("Enter the character to insert : ");
        char ch = scan.next().charAt(0);
        System.out.print("Enter the position : ");
        int pos = scan.nextInt();
        String result = insertchar(str, pos, ch);
        System.out.println("Result : " + result);
        System.out.print("Enter the position to delete : ");
        int delpos = scan.nextInt();
        deletion d = new deletion();
        System.out.println("After deletion : " + d.delete(delpos, result));

    }
}

