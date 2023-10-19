package Ch02.Test1;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ch02.Test1.SavingAccount myAccount2 = new Ch02.Test1.SavingAccount("ȫ�浿", 123456789, 0.34);
		
		myAccount2.deposit(4000000);
		myAccount2.withdraw(3000000);
		myAccount2.checkBalance();
		
		System.out.println(myAccount2.name);
		System.out.println(myAccount2.open);
		System.out.println(myAccount2.number);
//		System.out.println(myAccount2.balance);
	}

}
