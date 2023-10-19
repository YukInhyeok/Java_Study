package Ch02;

class ThreadEx2 extends Thread{
	String name;
	public ThreadEx2(String name) {
		super(name); // �������� �̸��� �����ϱ� ����  ThreadEx2�� ����Ŭ������  Thread�� �����ڸ� ȣ��
		this.name = name;		
	}
	
	public void run() {
		int i=0;
		while(true) {
			System.out.println("�������: " + name + "���� : " + i++);
			if(i==10) {
				break;
			}
			try {
				sleep(30);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}


public class T0806 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 6. Thread  Ŭ������ Ȯ�� Ŭ������ ������ �����ϱ� 
 */
		
		//������ ��ü�� �����Ѵ�.
		
		ThreadEx2  t1 = new ThreadEx2("Thread01");
		ThreadEx2  t2 = new ThreadEx2("Thread02");
		ThreadEx2  t3 = new ThreadEx2("Thread03");
		
		//start() �޼ҵ带 ȣ���Ͽ�  run() �޼ҵ带 �����Ų��.
		t1.start();
		t2.start();
		t3.start();
	}

}
