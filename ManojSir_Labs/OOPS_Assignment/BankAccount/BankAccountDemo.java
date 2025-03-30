abstract class AccountOperations{
	//Abstract Methods
	abstract void deposit(double deposit);
	abstract void withdraw(double amount);
	abstract void withdraw(double amount, String password);
	abstract void displayBalance();
}


public class BankAccount extends AccountOperations{
	//Instance Variables
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	
	//Default cunstructor
	public BankAccount(){
		this.accountNumber = generateAccountNumber();
		this.accountHolderName = "Unknown";
		this.balance = 0.0;
		totalAccounts++;
	}
	
	//Zero-Parameterized Constructor
	public BankAccount(){
		
	}
	
	//Parameterized Constructor
	public BankAccount(String accountHolderName, double initialBalance){
		this.accountNumber = generateAccountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = initialBalance;
		totalAccounts++;
	}
	
	//Copy constructor
	public BankAccount(BankAccount another){
		this.accountNumber = another.accountNumber;
		this.accountHolderName = another.accountHolderName;
		totalAccounts++;
	}
	
	private int generateAccountNumber(){
		return accountCounter.getAndIncrement();
	}
	
	public static void displayTotalAccounts(){
		System.out.println("Total Accounts Created: " + totalAccounts);
	}
	
	@Override
	public void deposit(double amount){
		if(amount > 0){
			balance = balance + amount;
			System.out.println("Deposited: " + amount);
		}
		else{
			System.out.println("Invalid deposit amount!");
		}
	}
	
	@Override
	public void withdraw(double amount){
		if(amount > 0 && amount <= balance){
			balance = balance - amount;
			System.out.println("Withdrawn: " + amount);
		}
		else{
			System.out.println("Invalid withdraw amount or insufficient balance!");
		}
	}
	
	@Override
	public void withdraw(double amount, String password){
		if("1234".equals(password)){
			withdraw(amount);
		}
		else{
			System.out.println("Invalid Password!");
		}
	}
	
	@Override
	public void displayBalance(){
		System.out.println("Account Balance: " + balance);
	}
	
	//Getters for encapsulated fields
	public int generateAccountNumber(){
		return accountNumber;
	}
	
	public getAccountHolderNmae(){
		return accountHolderName;
	}
	
	public double getBalance(){
		return balance;
	}
}

public class SavingAccount extends BankAccount{
	private static final double minimumBalance = 5000.0;
	
	public SavingAccount(String accountHolderName, double initialBalance){
		super(accountHolderName, initialBalance);
	}
	
	@Override
	public void withdraw(double amount){
		if((getBalance() - amount) >= minimumBalanceix){
			super.withdraw(amount);
		}
		else{
			System.out.println("Cannot withdraw: Minimum balance requirment not met!");
		}
	}
}

public class BankAccountDemo{
	public static void main(){
		//creation of zero parameterized BankAccount object
		BankAccount acc1 = new BankAccount();
		
		//Creation of parameterised BankAccount object
		BankAccount acc2 = new BankAccount("Nikita", 5000.0);
		
		//Anyrhing you want to print on console just pass the object reference.method()
		acc1.displayBalance();
		acc2.displayTotalAccounts();
	}
}