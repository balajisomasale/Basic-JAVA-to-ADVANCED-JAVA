import java.util.Scanner;

class Account{
	
	private String accountNumber;
	private int balance;
	//argument 
	
	
	public Account(String accountNumber,int balance)
	{
		
		this.accountNumber =accountNumber;
		this.balance=balance;
		
	}





public String getAccountNumber() {
	return accountNumber;
}

public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}

public int getBalance() {
	return balance;
}

public void deposit(int transactionAmount) {
	balance=balance + transactionAmount;
	
	
}

public void withdraw(int transactionAmount) {

	balance=balance - transactionAmount;
	
	
	
	
}


	
}




public class Main {

	
	
	public static void main(String[] args)
	{
		int x,z,t,w;
		String ac;
		int transactionAmount;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Account Number");
		ac=sc.nextLine();
		System.out.println("Enter the Account Balance");
		x=sc.nextInt();
		System.out.println("Enter 1 to deposit an amount,2 to withdraw an amount");
		z=sc.nextInt();
		
		
		 
		 Account obj=new Account(ac,x);
		 
		 
		
		if(z==1)
		{
			System.out.println("Enter the amounbt to deposit");
			
			t=sc.nextInt();
			obj.deposit(t);
			System.out.println("Your balance after the transaction is:"+obj.getBalance());
			
			
		}
		else 
		{
			System.out.println("Enter the amount to withdraw");
			w=sc.nextInt();
			if(x>w)
			{
			
			
			obj.withdraw(w);
			
			System.out.println("Your balance after the transaction is:"+obj.getBalance());
			
			}
			else {
				
				System.out.println("Insufficient Balance");
				
			}
			
		}
		
		
		
		
				
	}
}
