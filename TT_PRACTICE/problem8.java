import java.util.Scanner;
public class problem8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the ip address : ");
        String ip=scan.nextLine();
        valid_ip(ip);
        if(valid_ip(ip)){
            System.out.println("valid ip_v4 format");
        }else{
            System.out.println("Invalid ip_v4 format");
        }
    }
    public static boolean valid_ip(String ip){
        String[] res =ip.split("\\.",-1);
        if(res.length!=4)
            return false;

            for(int i=0;i<res.length;i++){
                if(res[i].length()==0)
                    return false;
                if(res[i].length()>1&&res[i].charAt(0)=='0')
                    return false;
                int sum=0;
                char[] c = res[i].toCharArray();
                for(int j=0;j<c.length;j++){
                    if(Character.isDigit(c[j])){
                        int num=Integer.parseInt(String.valueOf(c[j]));
                        sum = sum*10+num;
                    }else{
                        return false;
                    }
                }
                if(sum>255){
                    return false;
                }
            }
            
        return true;
    }
}
