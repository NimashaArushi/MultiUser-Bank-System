
package MultiUserBankSystem;

public class Currentacc extends Bank{
double overdraftlimit;

    public Currentacc(double overdraftlimit, String name, long accNum, double balance) {
        super(name, accNum, balance);
        this.overdraftlimit = overdraftlimit;
    }


     @Override
   public synchronized void withdraw(double amount){
   if(amount<=(balance+overdraftlimit)){
       balance=balance-amount;
       System.out.println("current amount is :"+balance);
       
       
   }}
   
   public synchronized double deposit(double amount){
   balance+=amount;
    System.out.println("Deposit amount is :"+balance);
   return balance;
   }
    
    
}
