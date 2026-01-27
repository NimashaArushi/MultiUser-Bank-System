
package MultiUserBankSystem;


public class Savingacc extends Bank{

    public Savingacc(String name, long accNum, double balance) {
        super(name, accNum, balance);
    }
    

    @Override
   public void withdraw(double amount){
   if(amount<=balance){
       System.out.println("Funds transation succufully ");
       System.out.println("----------------------------- ");
      balance=balance-amount;
       System.out.println("Balance : "+balance);
   }
   else{
       System.out.println("funds insuffients !!!");
   }
   }
 
   } 

