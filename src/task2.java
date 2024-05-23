import java.io.FileReader;
import java.io.IOException;

public class task2 {
    public static void main(String [] args) throws IOException {
        FileReader f = new FileReader("//E:\\");
        int a;
        while((a = f.read())!= -1){
            System.out.print((char)a);
        }
        f.close();
    }
}