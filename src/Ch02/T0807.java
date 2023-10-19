class RunnableEx2 implements Runnable{
	public void run() {
		int i=0;
		while(true) {
			System.out.println("스레드명: " + Thread.currentThread().getName() + "숫자 : " + i++);
			if(i==10) {
				break;
			}
			try {
				Thread.sleep(30);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}		
	}
}


public class T0807 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
   7. Runnable 인터페이스의 확장 스레드 구현하기 
 */
		// Runnable 구현 클래스로 인스턴스 생성
		RunnableEx2 r1 = new RunnableEx2();
		RunnableEx2 r2 = new RunnableEx2();
		RunnableEx2 r3 = new RunnableEx2();
		
		//Thread 인스턴스 생성
		Thread t1 = new Thread(r1, "Thread01");
		//Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2, "Thread02");
		Thread t3 = new Thread(r3, "Thread03");
		
		// 스레드를 동작시킴
		t1.start();
		t2.start();
		t3.start();
		
	}

}
