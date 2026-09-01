interface  vehicle{
    void disp();
}

public class lambda {
    public static void main(String[] args) {
        vehicle v= ()->{System.out.println("hello");};
        v.disp();
    }   
}
