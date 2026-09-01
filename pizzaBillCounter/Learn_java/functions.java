
public class functions {
    int a=10;
    int b=20;

    int apple_price=50;
    int apple_count=23;

    void add(){
        System.out.println("add: "+(a+b));
    }
    
    void total_money(){
        System.out.println("total amount for apple: "+(apple_count*apple_price));
    }

    public static void main(String[] args) {
        functions sum=new functions();
        sum.add();
        sum.total_money();
        }
}
