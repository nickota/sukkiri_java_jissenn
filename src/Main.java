import java.util.*;


public class Main{
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<String>();
        names.add("あ");
        names.add("い");
        Iterator<String> it = names.iterator();
        
        while (it.hasNext()){
            String e = it.next();
            System.out.println(e);
        }
    }
}