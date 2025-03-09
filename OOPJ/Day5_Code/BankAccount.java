public class BankAccount{
    private double balance;
	
	public BankAccount(double initialBalance){
	   this.balance = initialBalance;
	}
	
	public void deposit(double amount){
	   if(amount > 0){
	    balance = balance + amount;
		System.out.println("Deposited: $" + amount);
	   }
	   else{
	    System.out.println("Invalid deposit amount.");
	   }
	}
	
	public void withdraw(double amount){
	   if(amount > 0 && amount <= balance){
	     balance = balance - amount;
		 System.out.println("Withdraw ammount: " + amount);
	   }
	   else{
	     System.out.println("Insufficient balance.");
	   }
	}
	
	public double getBalance(){
	   return balance;
	}

    public static void main(String args[]){
	    BankAccount account = new BankAccount(25000);
		System.out.println("Initial Balance: $" + account.getBalance());
		account.deposit(5000);
		System.out.println("Current Balance: $" + account.getBalance());
		account.withdraw(1000);
		System.out.println("Current Balance: $" + account.getBalance());
		
		System.out.println("Current Balance: $" + account.getBalance());
	}

}