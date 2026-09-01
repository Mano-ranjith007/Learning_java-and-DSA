public class sliding_window {
    public static void main(String[] args) {
          int[] arr={9,1,2,4,5,4};
          int k=3;
          System.out.println("elements of max sum is "+maxsum(arr,k));  
    }


    public static int maxsum(int[] arr,int k){
        int n=arr.length;
        int Maxsum=0;
        int windowsum=0;
        
        for(int i=0;i<k;i++){
            windowsum+=arr[i];
        }
        Maxsum=windowsum;

        for(int i=k;i<n;i++){
            windowsum+=arr[i]-arr[i-k];
            Maxsum=Math.max(Maxsum,windowsum);
        }
        return Maxsum;
    }
}    
