public class for_each_loop {
    public static void main(String[] args) {
        int count =0;
        int sum=0;
        int name=0;
        int[] num ={1,2,3,4,5};
        String[] names={"mano","kavi","papa","ammu"};
        for(int var:num){
            System.out.println(var);
            count++;
            sum=sum+var;
        }
        System.out.println("number of element in the array is "+count);
        System.out.println("sum of element in the array is "+sum);

        for(String var:names){
            System.out.println(var);
            name++;
        }
        System.out.println(name+" names bhu are in the array");
    }
}
