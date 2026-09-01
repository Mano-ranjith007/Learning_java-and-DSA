class animal{
    String name;
    int age;
    void make_sound(){
        System.out.println("animals make sound");
    }
    void eat(String food){
        System.out.println(food);
    }
}
class dog extends animal{
    String breed;
    void make_sound(){
        System.out.println("dog barks");
    }
}
 class cat extends animal{
    String color;

    @Override
    void make_sound() {
        super.make_sound();
        super.eat("milk");
        System.out.println("cats meow.");
    }
    
 }
public class q12 {
    public static void main(String[] args) {
        //
        animal a=new animal();
        a.make_sound();
        a.name="lion";
        a.age=12;
        System.out.println(a.name);
        System.out.println(a.age);

        //
        dog d=new dog();
        d.make_sound();
        d.name="puppy";
        System.out.println(d.name);

        //
        cat c=new cat();
        c.make_sound();

    }
}
