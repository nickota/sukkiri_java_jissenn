//送信するSQLの雛形を準備
PreparedStatement pstmt = con.preparedStatement("SELECT * FROM MONSTERS WHERE HP >= ?");

//雛形に値を流し込みSQL文を組み立てて送信する
pstmt.setInt(1, 10);   //1番目の？に10を流しこむ
ResultSet rs = pstmt.executeQuery();

//結果表の取得
rs.close();
pstmt.close();
