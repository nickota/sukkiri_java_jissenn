PreparedStatement pstmt = conn.prepareStatement("DELETE FROM MONSTERS WHERE HP~~");

pstmt.setInt(1, 10);
pstmt.setString(2, "ゾンビ");
int r = pstmt.executeUpdate();

if(r != 0){
    System.out.println(~~);
}
pstmt.close();