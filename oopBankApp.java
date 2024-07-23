public class OopBankingApplication {
    float deposit;
    float withdraw;
    float balance;
    float sendMoney;
    float loansAndSavings;
    float loansAndSavingsBalance;
    int number;

    void deposit(float d) {
        deposit =d;
        balance = balance + deposit;
        System.out.println("you have deposited " + deposit + " into the bank. Your balance is " + balance);
    }
    void withdraw(float w) {
        withdraw =w;
        balance = balance - withdraw;
        System.out.println("you have withdrawn " + withdraw + " into the bank. Your balance is " + balance);
    }
    void SendMoney(float s,int n) {
        sendMoney =s;
        number = n;
        balance = balance - sendMoney;
        System.out.println("you have sent " + sendMoney + " to "+number+". Your balance is " + balance);

    }
    void setLoansAndSavings(float l) {
        loansAndSavings =l;
        loansAndSavingsBalance += loansAndSavings;
        System.out.println("savings balance is " + loansAndSavingsBalance);

    }
    void checkBalance() {
        System.out.println("Your account balance is: "+ balance);
    }
}
class User{
    public static void main(String[] args) {
        OopBankingApplication user1 = new OopBankingApplication(),user2 = new OopBankingApplication(),user3 = new OopBankingApplication(),user4 = new OopBankingApplication();
//        deposit
        user1.deposit(100);

        user2.deposit(200);

        user3.deposit(300);

        user4.deposit(400);
//        savings
        user1.setLoansAndSavings(1000);
        user2.setLoansAndSavings(2000);
        user3.setLoansAndSavings(3000);
        user4.setLoansAndSavings(4000);
//        withdraw
        user1.withdraw(50);
        user2.withdraw(150);
        user3.withdraw(250);
        user4.withdraw(350);
//        check balance
        user1.checkBalance();
        user2.checkBalance();
        user3.checkBalance();
        user4.checkBalance();
    }
}
//e
