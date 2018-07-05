public class Account{
    private String accountNo;
    private int balance;
    
    private AccountType acountType;
    public Account(String aNo, AccountType aType);
}

enum AccountType{
    FUTSU, TOUZA, TEIKI;
}