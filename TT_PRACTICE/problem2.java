
import java.util.ArrayList;
import java.util.Scanner;

class mode{
    ArrayList<Integer> num=new ArrayList<>();
    
    void add(){
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        num.add(60);
        System.out.println("orgineal array: "+ num);
    }
    void insert(int index,int data){
        num.add(index,data);
    }
    void update(int i,int value){
        num.set(i, value);
    }
    void delete(int indexed_element){
        num.remove(indexed_element);
    }
    void display(){
        System.out.println("updated array :"+num);
    }

}

public class problem2 {
    public static void main(String[] args) {
        Scanner scan = new  Scanner(System.in);
        mode d=new mode();
        d.add();

        System.out.print("Enter the index to insert the element : ");
        int index=scan.nextInt();
        System.out.print("Enter the data: ");
        int data=scan.nextInt();
        d.insert(index, data);

        System.out.print("Enter the index to insert the element to update : ");
        int i=scan.nextInt();
        System.out.print("Enter the value : ");
        int value =scan.nextInt();
        d.update(i, value);

        System.out.print("Enter the index to remove : ");
        int indexed_element=scan.nextInt();
        d.delete(indexed_element);

        d.display();
    }
}
