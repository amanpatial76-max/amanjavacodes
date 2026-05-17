public class Filewriting {
import java.io.*;
class FileWrite {
    public static void main(String[] args)throws Exception {
        FileWriter fw=new FileWriter("test.txt");
        fw.write("Hello");
        fw.closef();
    }
} 
