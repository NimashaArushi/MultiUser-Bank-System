
package MultiUserBankSystem;


public class NewMain {

   
    public static void main(String[] args) {
       Savingacc s=new Savingacc("User-A",12345,5000.00);//Name, Account Number, Balance
        
        
        s.deposit(1000);
        s.withdraw(500);
        
        
        Currentacc cu=new Currentacc(2000,"User-B",5678,5000.00);//overdraftlimit,name,accNum,  balance
        cu.deposit(5000.00);
        cu.withdraw(12000);
        
    }
    
}
