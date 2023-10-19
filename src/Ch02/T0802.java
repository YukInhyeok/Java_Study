package Ch02;

public class T0802 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 
 2. ������ ���� / ���� ���
 - ���� ������ vs ���� ������
 ���� ������ : �� ���μ����� �ϳ��� �����常�� ������
 ���� ������ : �ϳ��� ���μ����� �ټ��� �����带 ������ ���ÿ� �۾��� ����
 
 - �����带 �����ϴ� ��� : 2����
 1. Thread Ŭ������ ����ϴ� ��� => Ŭ���� ����� Ŭ���� �̸� ������ extends Thread  <=  ��� 
 ex)  class  Ŭ���� �̸�  extends Thread{
 
       }
 
 2. Runnable �������̽��� ����ϴ� ��� => Ŭ���� ����� Ŭ���� �̸� ������ implements Runnable <= ��� X
 ex)  class  Ŭ���� �̸� implements Runnable {
 
      }    
 
 - �����带 �����Ű�� ���� ���� ���
 1. ������ ��ü�� start() �޼ҵ带 ȣ�������ν� ����ȴ�.
 
    ex)
     * ���� ������ ��ü ���� ��
         main(){
         Thread t = new MyThread();
                  
         t.start();         
    }
    
      * ��Ƽ ������ ��ü ���� ��
         main(){
         Thread t1 = new MyThread();
         Thread t2 = new MyThread();
         
         t1.start();
         t2.start();
    }
 
 2. start() �޼ҵ带 ȣ��Ǹ� Ŭ������ run() �޼ҵ尡 �ڵ� ȣ��ȴ�. 
    run() �޼���� ���� ������� ���۽�Ű���� �ϴ� ��ɾ���� ����ϰ� ����
    
    class Mythread extends Thread {
       public void  run(){
         // �����ؾ� �� ��ɾ��
       }
    
    }
    
 3. start()�޼ҵ带 ����ϸ� �ڵ����� �����尡 ����ȴ�. 
  
  
 * �׸����� ���� ���� 
 ���� ������
     |
     |    1��  
 ������ ��ü ����  ---------------> ������ ��ü
     |
     |    2��
 start() �޼ҵ带 ȣ��  ----------> public void run(){
     |                                   |
     |  3�� ���� ������ ����                  |  		3�� �۾� ������ ����   
     |                            }
          
 - Thread Ŭ������ ����ϱ�
 1.Thread �� ��ӹ޾Ƽ� Ŭ������ �ۼ��Ѵ�.
    class MyThread extends Thread {
                   ......
    }
  
 2. Ŭ������ run() �޼ҵ带 �������Ѵ�.
    class MyThread extends Thread {
          public void run(){
          	// �����ؾ� �� ��ɾ��
          }          
    }
 
 
 3. Thread ��ü�� �����Ѵ�.
 
    Thread  t = new MyThread();   (O)
  
    // MyThread t = new MyThread(); (X)
  
 3-1 �ڵ带 �� �� �����ϱ� ���� Thread �͸� ��ü�� �Ű������� ����� �� �ִ� "�͸� �ڽ� ��ü"�� ����� �� �ִ�.
 
      * �͸� �ڽ� ��ü
      
     Thread thread = new Thread(){
     	public void run(){
          	// �����ؾ� �� ��ɾ��
          }  
     }; 
  
 4. start() ȣ���Ͽ� �����带 �����Ѵ�.
 
     t.start();
     
     thread.start()
 
  
 - Runnable �������̽��� �����ϴ� ���
 1. Runnable �������̽��� ������ Ŭ������ �ۼ��Ѵ�.
	class MyRunnable implements Runnable{
	            .......
	}
	
 2. MyRunnable Ŭ�������� run() �޼ҵ带 �ۼ��Ѵ�.
 	class MyRunnable implements Runnable{
	      public void run(){
	      		// �����ؾ� �� ��ɾ��
	      }
	}
 
 3. Thread  ��ü�� �����ϰ� �̶� MyRunnable ��ü�� �μ��� �����Ѵ�.
 
    Thread  t1  = new Thread(new MyRunnable);
 
 3-1 Runnable ���� ��ü�� ������ �� �̰��� �Ű������� �ؼ� Thread �����ڸ� ȣ���ϸ� ��μ� �۾� �����尡 �����ȴ�.
 
    Runnable  task = new MyRunnable();
    
    Thread thread = new Thread(task);     
 
 3-2 �ڵ带 �� �� �����ϱ� ���� Thread �����ڸ� ȣ���� �� Runnable �͸� ��ü�� �Ű������� ����� �� �ִ�.
    * �͸� ���� ��ü
     
    Thread  thread  = new Thread(new Runnable()){
    	public void run(){  <= run() �޼ҵ�� �ϳ��� ���ǵǾ� �ֱ� ������ "�Լ��� �������̽�"�̶�� �Ѵ�.
    	   // �����尡 ���� �ڵ�;
    	}
    }
 
 3-3 ���ٽ��� �Ű������� ����ϴ� ���
     <= �ڹ� 8 ���� ���� ����
     
     Thread thread = new Thread( ()-> {
           //�����尡 ������ �ڵ�  
     	}     
     ); 
 
 4. start() �޼ҵ带 ȣ���Ͽ� �����带 �����Ѵ�.
 	
 	thread.start();
    
 */
	}

}
