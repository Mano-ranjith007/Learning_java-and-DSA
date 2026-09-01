 import java.util.Scanner;
public class arr {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("enter the size of the array: ");
        int n =scan.nextInt();
        int[] num = new int[n];

        int sum=0;

        System.out.println("enetr the array: ");
        for(int i =0;i<n;i++){
            num[i]=scan.nextInt();
            sum+=num[i];
        }

        System.out.println("array is: ");
        System.out.print("{ ");
        for(int i=0;i<n;i++){
            System.out.print(num[i]+" ");
        }
        System.out.print("}");

        System.out.println("sum of the element in array is : "+sum);
    }
}
