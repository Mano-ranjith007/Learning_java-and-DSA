public class q9 {
    String Laptop_name="";
    String processor="";
    int ram=0;
    float price=0;
    public static void main(String[] args) {

        q9 lap1=new q9();
        lap1.Laptop_name="asus";
        lap1.processor="ryzen";
        lap1.ram=6;
        lap1.price=68000;
        System.out.println("lap1 price: "+lap1.price);

        q9 lap2=new q9();
        lap2.Laptop_name="hp";
        lap2.processor="i5";
        lap2.ram=8;
        lap2.price=50000;
        System.out.println("lap2 price: "+lap2.price);
    }
}
