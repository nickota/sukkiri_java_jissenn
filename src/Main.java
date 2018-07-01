import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       ArrayList<Integer> points = new ArrayList<Integer>();
       points.add(10);
       points.add(20);
       
       for(int i: points){
           System.out.println(i);
       }
    }
}
