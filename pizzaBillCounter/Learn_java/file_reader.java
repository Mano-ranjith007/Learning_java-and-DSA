import java.io.BufferedReader;
import java.io.FileReader;

public class file_reader {
    public static void main(String[] args) {
        
        try{
        //using file reader

        FileReader fr=new FileReader("sample.txt");
        // int c=fr.read();
        // while(c!=-1){
        //     System.out.print((char)c);
        //     c=fr.read();
        // }

        //using buffer reader
         BufferedReader br = new BufferedReader(fr);
         String line =br.readLine();
         while(line!=null){
            System.out.println(line);
            line=br.readLine();
         }
        
        }catch(Exception e){
            System.out.println(e);
        }

    }
}
