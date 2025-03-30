class BankAccount{
	private double balance;
	
	public BankAccount(double initialBalance){
		this.balance = initialBalance;
	}
	
	public synchronized void deposit(int amount){
		balance = balance + amount;
		System.out.println("Deposited: " + amount + ", New Balance: " + balance);
	}
	
	public synchronized void withdraw(int amount) throws InsufficientFundsException{
		if(amount > balance){
			throw new InsufficientFundsException("Insufficient funds. Available balance: " + balance);
		}
		balance = balance - amount;
		System.out.println("Withdraw: " + amount + ", New Balance: " + balance);
	}
	
	public double getBalance(){
		return balance;
	}
}

class InsufficientFundsException extends Exception{
	public InsufficientFundsException(String message){
		super(message);
	}
}

class Customer implements Runnable{
	private BankAccount account;
	private String transactionType;
	private int amount;
	
	public Customer(BankAccount account, String transactionType, int amount){
		this.account = account;
		this.transactionType = transactionType;
		this.amount =amount;
	}
	
	@Override
	public void run(){
		try{
			if("deposit".equalsIgnoreCase(transactionType)){
				account.deposit(amount);
			}
			else if("withdraw".equalsIgnoreCase(transactionType)){
				account.withdraw(amount);
			}
		}catch(InsufficientFundsException e){
			System.out.println("Transaction failed: " + e.getMessage());
		}
	}
}

public class BankApplication{
	public static void main(String args[]){
		BankAccount account = new BankAccount(100);
		
		Thread customer1 = new Thread(new Customer(account, "deposit", 500));
		Thread customer2 = new Thread(new Customer(account, "withdraw", 200));
		Thread customer3 = new Thread(new Customer(account, "deposit", 1000));

        customer1.start();
		customer2.start();
		customer3.start();
		
		try{
			customer1.join();
			customer2.join();
			customer3.join();
		}catch(InterruptedException e){
			System.out.println("Thread interrupted: " + e.getMessage());
		}finally{
			System.out.println("Released resources....");
		}
		
		System.out.println("Final Balance: " + account.getBalance());
	}
}