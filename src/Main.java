if(rs.next()){
    System.out.println("HPは" + rs.getInt("HP"));
}else{
    System.out.println("DBに存在しません");
}