class person{
        public String name="mano";
        protected int age=19;
        private int socialsecuritynumber=1100564;
        String address="namakkal";
        void display(){
            System.out.println(socialsecuritynumber); // private variable accessed by the function because we cannot accessed directly
        }
}
class employee extends person{
       
}
public class q13 {
public static void main(String[] args) {
    employee e=new employee();
    System.out.println(e.name);
    System.out.println(e.age);
    e.display();
    System.out.println(e.address);
}
}
