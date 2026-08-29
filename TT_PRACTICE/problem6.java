import java.util.*;

public class problem6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num1={1,2,3,4,5};
        int[] num2={1,2,3,4};

        System.out.print("enter m : ");
        int m=scan.nextInt();
        System.out.print("enter n : ");
        int n=scan.nextInt();

        int k = m+n;
        int[] nums3=new int[k];
        for(int i=0;i<m;i++){
            nums3[i]=num1[i];
        }
        int index=m;
        for(int i=0;i<n;i++){
            nums3[index]=num2[i];
            index++;
        }
        System.out.print("merged array before sorting : "+Arrays.toString(nums3));
        System.out.println();
        Arrays.sort(nums3);
        System.out.println("sorted array : " + Arrays.toString(nums3));
    }
}
