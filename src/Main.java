import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        try(FileWriter fw = new FileWriter("rpgsave.dat");){
            fw.write('A');
            fw.flush();  //実際に動作を実行するflushを忘れない
        }catch(IOException e){
            System.out.println("書き込みエラー");
        }
    }
}