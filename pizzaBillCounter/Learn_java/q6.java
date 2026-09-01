public class q6 {
    public static void main(String[] args) {
        int odd_count =0;
        int even_count=0;
        for(int i=1;i<=10;i++){
            if(i%2!=0){
                System.out.println("odd number:"+i);
                odd_count++;
            }
            else{
                System.out.println("even number:"+i);
                even_count++;
            }
        }
        System.out.println("odd count : "+odd_count);
        System.out.println("even count : "+even_count);
    }
}
