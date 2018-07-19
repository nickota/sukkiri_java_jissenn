import java.util.*;
import java.io.*;
import java.sql.*;

public class ItemDAO{
    public static ArrayList<Item> findByMinimunPrice(int i){
        try {
            Class.forName("org.h2.Driver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        Connection conn = null;  //初期化みたいなもの
        try{
            conn = DriverManager.getConnection("jdbc:h2:~/rpgdb");
            PreparedStatement pstmt = conn.prepareStatement
                ("SELECT * FROM ITEMS WHERE PRICE > ?");
            pstmt.setInt(1, i);
            //SQLの実行
            ResultSet rs = pstmt.executeQuery();
            //Itemを入れるArrayListの作成
            ArrayList<Item> items = new ArrayList<Item>();
            
            while(rs.next()){
                Item item = new Item();
                item.setName(rs.getString("NAME"));
                item.setPrice(rs.getInt("PRICE"));
                item.setWeight(rs.getInt("WHEIGHT"));
                items.add(item);
            }
            rs.close();
            pstmt.close();
            return items;
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }finally{
            if(conn != null){
                try{
                    conn.close();
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }
}