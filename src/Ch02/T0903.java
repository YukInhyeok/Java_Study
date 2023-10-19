package Ch02;

class Sum{
	int num=0;
	
	int sum() {	
		for(int i=0; i<1000; i++) {
			num+=1;
			System.out.println(num);
		}	
		return num;
	}
}



class ThreadEx extends Thread{
	Sum s = new Sum();

	public void run() {		
		String threadName = Thread.currentThread().getName();   // 쓰레드 이름 가져오기
		synchronized(s) {
			System.out.println(threadName + " : " + s.sum());
		}
	}
}


public class T0903 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*
 스레드 동기화 실습-2 
*/
		
		ThreadEx r = new ThreadEx();
		Thread ex1 = new Thread(r, "a");
		Thread ex2 = new Thread(r, "b");
		Thread ex3 = new Thread(r, "c");
		
		// 멀티쓰레드 시작
		ex1.start();
		ex2.start();
		ex3.start();
	}

}
