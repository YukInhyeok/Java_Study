package Test1;

public class SavingAccount extends Account {

	public double rates; // 이자율
	
	public SavingAccount(String name, int number, double rates) {
		super(name, number);
		this.rates = rates;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount myAccount = new SavingAccount("홍길동", 123456789, 0.34);
		
		myAccount.deposit(2000000);
		myAccount.withdraw(1000000);
		myAccount.checkBalance();
		
		System.out.println(myAccount.name);
		System.out.println(myAccount.open);
		System.out.println(myAccount.number);
//		System.out.println(myAccount.balance);
	}

}
