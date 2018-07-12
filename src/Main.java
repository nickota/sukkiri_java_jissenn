import java.sql.*;
    
    //STEP 0 : 事前準備(JARの配置を含む)
    try {
        //これとgetConnectionでDBに接続できるようになる
        Class.forName("org.h2.Driver");
    }catch(ClassNotFoundException e){
        e.printStackTrace();
    }
    
    Connection con = null;
    try{
        //STEP 1 : データベースの接続
        con = DriverManager.getConnection("jdbc:h2:~/rpgdb"); //JDBC URLを指定している
        //STEP 2 : SQLの送信処理
        /*
        メインのDB操作
        */
    }catch(SQLException e){
        e.printStackTrace();
    }finally{
        //STEP 3 : データベース接続の切断
        if(con != null){
            try{
                con.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }