import java.util.*;

public class Main{
    public static void main(String[] args){
        Map<String, Integer> prefs = new HashMap<String, Integer>();
        prefs.put("京都府",255);
        prefs.put("東京都",1261);
        
        int tokyo = prefs.get("京都府");
        System.out.println(tokyo);
        
        prefs.remove("東京都");
        prefs.put("熊本県", 200);
        System.out.println(prefs.get("熊本県"));
    }
}