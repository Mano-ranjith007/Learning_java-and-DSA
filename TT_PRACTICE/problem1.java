
import java.util.Scanner;

class demo{
    int arr[]={1,2,3,4,5,6};
    void display(){
        System.out.println("THE ELAMENTS ARE : ");
        for(int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]);
        }


    }
    void modify(int k,int data){
        arr[k]=data;
        System.out.println("The element that had modified is "+arr[k]);
        System.out.println("Updated arr : ");
        for (int i = 0; i <= arr.length-1; i++) {
            System.out.println(arr[i]);
        }
    }
}
public class problem1{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        demo d=new demo();

        d.display();

        System.out.print("enter the index to change the modify the element: ");
        int k=scan.nextInt();
        System.out.print("Enter the data : ");
        int data=scan.nextInt();

        d.modify(k, data);

        System.out.println("so what is the size of array? ");
        int n =scan.nextInt();
        int sizeof_int=4;
        int total_size=n*sizeof_int;
        System.out.println("the size of array is "+total_size);

    }
}