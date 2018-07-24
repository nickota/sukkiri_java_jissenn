public class AccountTest{
    
    public static void main(String[] args){
        testInstantiate(); //一つ目のテスト
        testTransfer();　//一つ目のテスト
    }
    
    //実際にAccountをnewして使うテスト
    public static void testInstantiate(){
        System.out.println("無事newできるかのテスト");
        Account a = new Account("ミナト",30000);
    }
}