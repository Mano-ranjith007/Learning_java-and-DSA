public class problem5 {
    public static void main(String[] args) {
        String inputstr1="htijnar";
        String inputstr2="onam"; 

        char[] arr1=inputstr1.toCharArray();
        char[] arr2=inputstr2.toCharArray();

        int n=arr1.length+arr2.length;
        char[] result=new char[n];

        //  Concatenation
        for(int i=0;i<arr1.length;i++){
            result[i]=arr1[i];
        }
        for(int j=0;j<arr2.length;j++){
            result[j+arr1.length]=arr2[j];
        }
        System.out.println("Concatenate array : "+new String(result));

        // reversed Concatenated array
        char[] reversedresult =new char[n];
        int index=0;
        for(int i=n-1;i>=0;i--){
            reversedresult[index] = result[i];
            index++;
        }
        System.out.println("reversed array : "+new String(reversedresult));
        System.out.println("length of inputstr1 : "+inputstr1.length()+"\nlength of inputstr2 : "+inputstr2.length());
        System.out.println("length of concanated string : "+reversedresult.length);
    }
}
