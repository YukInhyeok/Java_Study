package Ch02;

class ThreadEx3 extends Thread{
	String name;
	
	public ThreadEx3(String name) {
		super(name);
		this.name = name;
	}
	
	// @Override
	
	public void run() {
		int i=0;
		while(true) {
			System.out.println("������� : " + name + " \t ���� : " + i++);
			if(i == 10) {
				break;				
			}
			try {
				sleep(200);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class T0906 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*
 
  * ������ �켱����
   - setPriority() ��� : 1 ~ 10
   - ����
   
      void setPriority(int newPriority)
      
   - newPriority : MAX_PRIORITY : 10
                   NORM_PRIORITY : 5
                   MIN_PRIORITY : 1    
                   
   - int getPriority();       
 */
		
		
	ThreadEx3 t1 = new ThreadEx3("���� ���� ������");	
	ThreadEx3 t2 = new ThreadEx3("���� ������");
	ThreadEx3 t3 = new ThreadEx3("���� ���� ������");
	
	t1.setPriority(Thread.MAX_PRIORITY);
	t2.setPriority(Thread.NORM_PRIORITY);
	t3.setPriority(Thread.MIN_PRIORITY);
	
	t1.start();
	t2.start();
	t3.start();
		
	}

}
