abstract class vehicle{
     final void startengine(){
        System.out.println("engine started..");
    }
    static String getvehicletype(){
        return "generic vehicle";
    }
    abstract void drive();
}

    class car extends vehicle{
        void drive(){
            System.out.println("the car is driven");
        }
    }
    
    class motorcycle extends vehicle{
        void drive(){
            System.out.println("the motorcycle is driven");
        }
    }



public class q14 {
    public static void main(String[] args) {
        car c1=new car();
        c1.drive();
        System.out.println(vehicle.getvehicletype());
        motorcycle m=new motorcycle();
        m.drive();
        m.startengine();
    }
}
