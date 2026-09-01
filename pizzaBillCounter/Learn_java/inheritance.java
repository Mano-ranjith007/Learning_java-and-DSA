// class father{
//     float money=100000;
// }
// class son extends father{

// }

class a{
    int a=10;
}
class b extends a{
    int b=20;
}
class c extends b{
    int c=a+b;
}
public class inheritance {
    public static void main(String[] args) {
    //   son s=new son();
    //   System.out.println("father's money is also son's money ,this is called inheritance where the son can use the property and behaviour of the father's: "+ s.money); 
    //   System.out.println("now the son becomes rich");  


        c obj=new c();
        System.out.println(obj.c);
    }
}
