package Ch02;

class TestThread  implements Runnable{
	
	public void run() {
		System.out.println(Thread.currentThread().getName() + " : " + " 1��°");
	}
	
}

public class T0805 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 5. Runnable �������̽��� ���� 
 */
		
		Runnable r1 = new TestThread();
				
		Thread th1 = new Thread(r1);
		
		
/*
		Thread th1 = new Thread(new TestThread());
*/
		
/*		
 				Thread th1 = new Thread( ()-> {
				System.out.println(Thread.currentThread().getName() + " : " + " 1��°");
	     	}     
	     );
*/	      
		
		th1.start();
		
	}

}
