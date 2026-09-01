public class problem9 {
    public static void main(String[] args) {
        String input = "paypalishiring";
        zigzag(input);
    }
    public static void zigzag(String input){
        String str0="";
        String str1="";
        String str2="";
        char[] ch = input.toCharArray();
        for(int i=0;i<ch.length;i=i+4){
            str0=String.valueOf(ch[i]);
            System.out.print(str0);
        }
        
        for(int i=1;i<ch.length;i=i+2){
            str1=String.valueOf(ch[i]);
            System.out.print(str1);
        }

        for(int i=2;i<ch.length;i=i+4){
            str2=String.valueOf(ch[i]);
            System.out.print(str2);
        }
    }
}
