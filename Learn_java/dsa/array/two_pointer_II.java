public class two_pointer_II {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,3,3,4,4,4,5,5};
        duplicate(arr);
    }

    public static void duplicate(int[] arr){
        
        int i=0;
        int j=1;
        for(j=1;j<arr.length;i++){
            if(arr[i]<arr[j]){
                arr[i+1]=arr[j];
                i++;
            }   
    }
}
