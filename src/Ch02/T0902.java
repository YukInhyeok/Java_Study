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
		  System.out.println(Thread.currentThread().getName() + "는 sum 값이" + k + "만큼 up되서 sum이 " + sum + "처럼 변경되었음");
	}
	
	public synchronized void down(int k) {
		  sum -= k;
		  System.out.println(Thread.currentThread().getName() + "는 sum 값이" + k + "만큼 down되서 sum이 " + sum + "처럼 변경되었음");
	}
	
	
}


public class T0902 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*
  스레드 동기화 실습-1 
 */
		
		TestThread1 t1 =new TestThread1(5);
		TestThread1 t2 =new TestThread1(10);
		TestThread1 t3 =new TestThread1(15);
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
