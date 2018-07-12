import java.io.*;
import java.net.*;

public class Main{
    public static void main(String[] args) throws IOException{
        try(URL url = new URL("http://dokojava.jp");){
            InputStream is = url.openStream();
            InputStreamReader isr = new InputStreamReader(is);
            int i = isr.read();
            while(i != -1){
                System.out.println((char) i);
                i = isr.read();
            }
        }catch(IOException e){
            System.out.println("エラーだよ");
        }
        
    }
}