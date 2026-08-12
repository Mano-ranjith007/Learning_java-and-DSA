
import java.util.Scanner;

public class q10 {
    int count=0;
    float remaining_amount=0;

    void chocolate(float amount,int chcolate_needed){
        float total_amount=chcolate_needed*10;
        remaining_amount=amount;
        if(remaining_amount<10){
            System.out.println("chocolates price is 10 rupess but u entered the less amount!!");
        }else{
            for(int i=1;i<=chcolate_needed;i++){
                if(remaining_amount>10){
                    remaining_amount-=10;
                    count++;
                }else{
                    float needed_amount=total_amount-amount;
                    System.out.println(" ");
                    System.out.println(needed_amount+" needed for further purchase");
                    System.out.println(count+" choclates are purchased");
                    break;
                }
            }
        }
    }
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       System.out.print("Enter the chocolates needed: ");
       int chocolates_needed=scan.nextInt();

       System.out.print("Enter the amount: ");
       float amount=scan.nextFloat();

       q10 choco=new q10();
       choco.chocolate(amount,chocolates_needed);
   }
}

