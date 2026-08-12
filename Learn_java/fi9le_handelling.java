import java.io.BufferedWriter;
import java.io.FileWriter;

public class fi9le_handelling {
    public static void main(String[] args) {
        try {
            FileWriter file= new FileWriter("sample.txt",true);
            //file.write("i'm manoranjith from cse"); (it is written by the file writter)

            //buffer writer:
            BufferedWriter bw=new BufferedWriter(file);
            bw.write(" and from namakkal");
            bw.newLine();
            bw.write("i love playing volleyball");
            bw.append("hii");
            bw.close();
            System.out.println("sucess");
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
