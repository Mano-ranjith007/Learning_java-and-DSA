import java.util.Scanner;
public class q7 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        
        System.out.print("enter the size of an array: ");
        int n=scan.nextInt();
        int[] page_no=new int[n];
        System.out.println("enter thr array element: ");
        for(int i=0;i<n;i++){
            page_no[i]=scan.nextInt();
        }
        System.out.println("middle page number is : "+page_no[n/2]);
    }
}
