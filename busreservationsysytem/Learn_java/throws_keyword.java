
import java.util.Scanner;

class calculate{
    void div(int a,int b) throws Exception{
        int c=a/b;
        System.out.println(c);
    }
}

public class throws_keyword{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        calculate c=new calculate();
        try{
            c.div(a,b);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
