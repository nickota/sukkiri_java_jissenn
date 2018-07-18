public class ItemDAO{
    public static ArrayList<Item> findByMinimunPrice(int i){
        try {
            Class.forName("org.h2.Driver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        Connection conn = null;
        try{
            conn = DataManager.getConnection("jdbc:h2:~/rpgdb");
            PreparedStatement pstmnt = conn.prepareStatement
                (SELECT * FROM ITEMS WHERE PRICE > ?);
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
            pstmnt.close();
            return items;
        }
    }
}