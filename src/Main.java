import java.sql.*;

//STEP 0 : 事前準備
try{
    Class.forName("org.h2.Driver");
}catch(ClassNotFoundException e){
    e.printStackTrace();
}

 Connection conn = null;
 try{
     //STEP 1 : データベースの接続
     conn = DriverManager.getConnection("jdbc:h2:~/rpgdb");
     conn.setAutoCommit(false);
     
     //STEP 2 : SQL送信処理
    /*  メインのDB処理  */
    conn.commit();
 }catch(SQLException e){
     try{
         conn.rollback();
     }catch(SQLException e2) {
         e2.printStackTrace();
     }finally{
         //STEP3 : 切断
         if(conn != null){
             try{
                 conn.close();
             }catch(SQLException e3){
                 e3.printStackTrace();
             }
         }
     }
 }