
package MultiUserBankSystem;


public class Bank {
    String name;
    long accNum;
    double balance;



    public Bank(String name, long accNum, double balance) {
        this.name = name;
        this.accNum = accNum;
        this.balance = balance;
    }


 public double deposit(double amount){
    double totaldeposit=balance+amount;
    System.out.println("Now Current Amount: "+balance);
    return totaldeposit;
    


}


public void withdraw(double amount){
    balance=balance-amount;
    System.out.println(balance+" ");
}

}