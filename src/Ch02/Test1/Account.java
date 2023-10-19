package Test1;

import java.util.Date;

public class Account {
	public String name;  // 이름
	protected Date open; // 날짜
	/*package*/ int number;  // 계좌번호
	private long balance;  // 잔액
	
	// 생성자(동일한 패키지, 하위 클래스에서 사용 가능)
	protected Account(String name, int number) {
		this.name = name;
		this.number = number;
		this.open = new Date();
		// Date open = new Date();
	}
	
	//일반메소드
	// 입금 메소드
	
	public long deposit(long amount) {
		return balance += amount;
	}
	
	// 출금 메소드
	public long withdraw(long amount) {
		return balance -= amount;
	}
	
	// 이름, 계좌정보 및 잔액 출력 메소드()
	public long checkBalance() {
		System.out.println("이름 : " + name + ", 계좌번호 : " + number + ", 잔액 : " + balance);
		return balance;
	}
}
