class Account{
	protected double balance;
	public void deposit(double amount){            //deposite method
		System.out.println("DEPOSIT AMOUNT");
	}
	public void withdraw(double amount){          //withdraw method
		System.out.println("WITHDRAW AMOUNT");
	}
}
class SavingAccount extends Account{             //entending class Account 
	private double defaultInterestRate=2.5;
	private double interestRate;
	public void setDefaultInterestRate(double inrate){
		interestRate= inrate;
	}	
	public void applyInterest(){               //apply interest method
		System.out.println("APPLY INTEREST ");

	}
}
class Task4{
	public static void main(String[] args){      // main class
		SavingAccount a=new SavingAccount();
	   a.applyInterest();                       // calling applyinterest mathod
	}
}
s