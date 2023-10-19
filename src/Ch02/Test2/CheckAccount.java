package Test2;

import Test1.Account;
import Test1.SavingAccount;

public class CheckAccount extends Account {

	long minimum; // 최소 잔액 금액
	
	public CheckAccount(String name, int number, long minimum) {
		super(name, number);
		this.minimum = minimum;
		//deposit(minimum);
		super.deposit(minimum);  // 잔액(balance)에 minimum(최소잔액금액) 을 추가
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount myAccount2 = new SavingAccount("홍길동", 123456789, 0.34);
		
		myAccount2.deposit(4000000);
		myAccount2.withdraw(3000000);
		myAccount2.checkBalance();
		
		System.out.println(myAccount2.name);
//		System.out.println(myAccount2.open);
//		System.out.println(myAccount2.number);
//      System.out.println(myAccount2.balance);
	}

}
