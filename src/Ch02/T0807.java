class RunnableEx2 implements Runnable{
	public void run() {
		int i=0;
		while(true) {
			System.out.println("�������: " + Thread.currentThread().getName() + "���� : " + i++);
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
   7. Runnable �������̽��� Ȯ�� ������ �����ϱ� 
 */
		// Runnable ���� Ŭ������ �ν��Ͻ� ����
		RunnableEx2 r1 = new RunnableEx2();
		RunnableEx2 r2 = new RunnableEx2();
		RunnableEx2 r3 = new RunnableEx2();
		
		//Thread �ν��Ͻ� ����
		Thread t1 = new Thread(r1, "Thread01");
		//Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2, "Thread02");
		Thread t3 = new Thread(r3, "Thread03");
		
		// �����带 ���۽�Ŵ
		t1.start();
		t2.start();
		t3.start();
		
	}

}
