public class Account {
    // 예금액 최대 10,000,000,000
    // 최대 송금 금액 1,000,000
    // 최대 고객 수 1,000

    String accountNumber = "계좌없음";
    String name = "이름없음";
    int balance = 0;



    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
}
