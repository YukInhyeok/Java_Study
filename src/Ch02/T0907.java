package Ch02;

public class T0907 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
		 
		 
	  * ������ ����ȭ���� ����ȭ ȿ���� ���̱� ���� ������� Ŭ���� Object�� �޼ҵ� wait(), notify(), nofityAll() ���
	  
	   ==============================================================================================
	   ����                             �ǹ�
	   ==============================================================================================
	   final void wait()				�ٸ� �����尡 notify() �Ǵ� notifyAll()�� ȣ���� ������ ���� �����带 ��ٸ������ϴ� �޼ҵ�
	   
	   final void wait(long timeout)	�ٸ� �����尡 notify() �Ǵ� notifyAll()�� ȣ���� ������ �Ǵ� ������ �ð�(õ���� 1��)�� ���� ������ ���� �����带 ��ٸ����� �ϴ� �޼ҵ�
		   
	   final void nofity()				��ü�� ó���� ��ٸ��� ������ ���� ���� �ϳ��� ���� �����ϵ��� �ϴ� �޼ҵ�
	                                    ��ٸ��� �����ٰ� ���� ���� ��쿡 JVM �� �̿��ؼ� �����带 ����
	   
	   final void nofityAll()  			��ü�� ó���� ��ٸ��� ��� �����带 ���� �����ϵ��� �ϴ� �޼ҵ�
		   
		   
	   >example
		   
	   public synchronized void withdraw(int money){
	   		...........
	   		int count=0;
	   		while(balance < money){
	   				..........
	   				// ���������� ����� �����Ͽ� �޼ҵ� ����
	   				if(++count > 3){
	   				   System.out.println("�ܱ��� �����Ͽ� ���ó�� ���ϰ� �����մϴ�.");
	   				   return;
					}
		   	}
	   }
		   
		   
	   public synchronized void deposit(int money){
				........
		   		
		   	try{	
		   		
		  	#   deposit()  <----------------------------> withdraw()
		   			   		
		   		wait();<------------------------------> notify();
		 		wait();<------------------------------> notifyAll();
		   		wait(1000);<------------------------------> notify();
		   	    wait(1000);<------------------------------> notifyAll();
	   		}catch(InterruptedException e){
				System.err.println(e);
			}
		   		
		  	..............
		   		
	  	}
		   		   
		   */
	}

}
