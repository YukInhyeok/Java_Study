package Ch02;

class Sum2{
	int num=0;
	
	synchronized int sum() {	
		for(int i=0; i<1000; i++) {
			num+=1;
			System.out.println(num);
		}	
		return num;
	}
}


class ThreadEx1 extends Thread{
	Sum2 s = new Sum2();

	public void run() {		
		String threadName = Thread.currentThread().getName();  // 쓰레드 이름 가져오기
		System.out.println(threadName + " : " + s.sum());
	}
}



public class T0904 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*
스레드 동기화 실습-3 
*/
		
				ThreadEx1 r1 = new ThreadEx1();
				Thread ex1 = new Thread(r1, "a");
				Thread ex2 = new Thread(r1, "b");
				Thread ex3 = new Thread(r1, "c");
				
				// 멀티쓰레드 시작
				ex1.start();
				ex2.start();
				ex3.start();
	}

}
