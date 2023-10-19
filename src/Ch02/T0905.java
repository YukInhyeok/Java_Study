package Ch02;

import java.util.Random;

class BankAccount{
	int balance = 0;
	
	// �޼ҵ� ��ü�� ����ȭ ó��
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
			System.out.println(money +"�� �����Ͽ� ���� �ܰ�� " + balance + "�Դϴ�.");
		}
		else if(balance <money) {
			System.out.println("�ܰ� �����Ͽ� ������ �� �����ϴ�.");
		}		
	}	
	
	
	//��� ����ȭ�� �޼ҵ� ��ü�� ����ȭ ó��
	public void deposit(int money) {
		synchronized(this) {
			if(money >0) {
				balance += money;
				System.out.println(money + " �Ա��Ͽ� �����ܰ� " + balance + " �Դϴ�.");
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
			
			System.out.println(Thread.currentThread().getName() + "�� �ݾ� = " + amount);
			
			act.deposit(amount);
			act.withdraw(amount*2);
			if(act.balance < 0) {
				System.out.print(Thread.currentThread().getName());
				System.out.println("�� �ܰ� :" + act.balance + "=> ���� ����");
			}
		}
	}
}


public class T0905 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*
������ ����ȭ �ǽ�-4 
*/
		
		Runnable r = new SyncTest();
		
		new Thread(r).start();
		new Thread(r).start();
		
	}

}
