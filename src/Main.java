Preparedstatement pstmt = con.prepareStatement("DELETE FROM ~");
pstmt.setString(1, "すずめ");
pstmt.executeUpdate();
pstmt.setString(1,"わし");
pstmt.executeUpdate();
pstmt.close();