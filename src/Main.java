import java.util.*;

public class Main{
    public static void main(String[] args){
        System.out.println("1円以上のアイテム一覧表の表示");
        ArrayList<Item> items = ItemsDAO.findByMinimunPrice(1);
        for(Item item : items){
            System.out.printf("%10s%4d%4d",item.getName(), item.getPrice(), item.getWeight());
        }
    }
}