package Ch02;

import java.util.Random;

class BankAccount{
	int balance = 0;
	
	// 메소드 전체의 동기화 처리
	public synchronized void withdraw(int money) {
		if (money > 0 && balance >= money) {
			try {
				Thread.sleep(100);
				//wait();
				//wait(1000);
			}catch(InterruptedException e) {
				System.err.println(e);
			}
			balance -= money;
			System.out.println(money +"를 인출하여 현재 잔고는 " + balance + "입니다.");
		}
		else if(balance <money) {
			System.out.println("잔고가 부족하여 인출할 수 없습니다.");
		}		
	}	
	
	
	//블록 동기화로 메소드 전체의 동기화 처리
	public void deposit(int money) {
		synchronized(this) {
			if(money >0) {
				balance += money;
				System.out.println(money + " 입금하여 현재잔고 " + balance + " 입니다.");
			}
		}
		
		// notify();
		// notifyAll();
		
	}
	
}

class SyncTest implements Runnable{
	BankAccount act = new BankAccount();
	
	public void run() {
		while(true) {
			int amount  = new Random().nextInt(10000);
			
			amount = amount%10 * 1000;
			
			System.out.println(Thread.currentThread().getName() + "의 금액 = " + amount);
			
			act.deposit(amount);
			act.withdraw(amount*2);
			if(act.balance < 0) {
				System.out.print(Thread.currentThread().getName());
				System.out.println("의 잔고 :" + act.balance + "=> 오류 종료");
			}
		}
	}
}


public class T0905 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*
스레드 동기화 실습-4 
*/
		
		Runnable r = new SyncTest();
		
		new Thread(r).start();
		new Thread(r).start();
		
	}

}
