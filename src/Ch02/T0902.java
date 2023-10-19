package Ch02;

class TestThread1 extends Thread{
	int sum;
	
	TestThread1(int s){
		sum = s;
	}
	
	public void run() {
		for(int i=0; i< 10; i++) {
			try {
				up(i);
				sleep(400);
				down(i);
			}catch(Exception e) {
				e.printStackTrace();
			}			
		}
	}
	
	public void up(int k) {
		 synchronized (this) {
			  sum += k;
		  }
		  System.out.println(Thread.currentThread().getName() + "�� sum ����" + k + "��ŭ up�Ǽ� sum�� " + sum + "ó�� ����Ǿ���");
	}
	
	public synchronized void down(int k) {
		  sum -= k;
		  System.out.println(Thread.currentThread().getName() + "�� sum ����" + k + "��ŭ down�Ǽ� sum�� " + sum + "ó�� ����Ǿ���");
	}
	
	
}


public class T0902 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*
  ������ ����ȭ �ǽ�-1 
 */
		
		TestThread1 t1 =new TestThread1(5);
		TestThread1 t2 =new TestThread1(10);
		TestThread1 t3 =new TestThread1(15);
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
