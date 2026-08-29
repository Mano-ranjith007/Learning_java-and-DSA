
import java.util.Scanner;

public class TwoPointers{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int[] arr = {1,2,4,4,7,8,11,12};
        System.out.print("enter the target: ");
        int target =scan.nextInt();
        haspair(arr,target);
    }

    public static void haspair(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        boolean found=false;
        int count=0;
        
        while(left<right){
            int sum =arr[left]+arr[right];
            
            if(sum==target){
                System.out.println("the pair : ("+arr[left]+","+arr[right]+")");
                found=true;
                count++;
                left++ ;
                right-- ;
                
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        System.out.println("the number of pair : "+count );
        if(!found){
        System.out.println("no pair found!!");
        }
    }
}