package Ch02;

public class T0803 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 
 3. Thread Ŭ������ �ֿ� �޼ҵ�

=======================================================================================================
			�޼ҵ�									���								
=======================================================================================================
static int activeCount()				���� Ȱ�� ���� �������� ������ ��ȯ
static Thread currentThread()			���� ���� ���� �����带 ��ȯ
void setName(String name)				�������� �̸��� ���� 
String getName()						�������� �̸��� ��ȯ
void setPriority(int priority)			�������� �켱���� ����
int getPriority()						�������� �켱���� ��ȯ
void setId(int Identity)				�������� ID�� ����
long getId()							�������� ID�� ��ȯ
static void sleep(int millisencods)		������ 1/1000�� ���� ������ �ϴ� �޼ҵ�	 
void run()								������ ����� �����ϴ� �޼ҵ�� start() �޼ҵ带 ȣ���ϸ� ����Ǵ� �޼ҵ�
void start()							�����带 �����ϴ� �޼ҵ�

  
  
4. run() �޼ҵ� ������ Thread Ŭ����, Runnable �������̽��� ����ϴ� ����
  * ���� �����尡 �ƴ� ���� �����带 ����� ��� Run() �޼ҵ� ��� ���
4-1 Thread Ŭ������ �̿��� ���
ex)  
	class ThreadEx extends Thread{
		public void run(){
			* ���� �������� ���
			 	// �����ؾ� �� ��ɾ��
			 	  
			* ���� �������� ���
			  ** ���� �����带 ���� �ݺ��� ��
			  	while(true){
			  		....   // Thread�� run() �޼ҵ带 �������̵��Ͽ� ���� �����带 �����ϰ��� �ϴ� ������ ���
			  		if(����)
			  			break;
			  	}
			  
			  ** ���� �����带 ���� Ƚ����ŭ ����� ��
			    for() {
			    	....   // Thread�� run() �޼ҵ带 �������̵��Ͽ� ���� �����带 �����ϰ��� �ϴ� ������ ���
			    }
			    	 
		}
	}
	
	ThreadEx t1 = new ThreadEx("Thread01");
	t1.start;
	
	�Ǵ�
	
	Thread t1 = new new ThreadEx("Thread01"); 
	t1.start;
	
	�Ǵ�
	
	Thread t1 = new Thread("Thread01"){
		public void run(){
			// �����尡 ������ �ڵ�
		}
	}  <= �͸� �ڽ� ��ü

4-2 Runnable �������̽��� ����ϴ� ���

ex)
	class RunnableEx implements Runnable {
		public void run(){
			* ���� �������� ���
			 	// �����ؾ� �� ��ɾ��
			 	  
			* ���� �������� ���
			  ** ���� �����带 ���� �ݺ��� ��
			  	while(true){
			  		....   // Thread�� run() �޼ҵ带 �������̵��Ͽ� ���� �����带 �����ϰ��� �ϴ� ������ ���
			  		if(����)
			  			break;
			  	}
			  
			  ** ���� �����带 ���� Ƚ����ŭ ����� ��
			    for() {
			    	......   // Thread�� run() �޼ҵ带 �������̵��Ͽ� ���� �����带 �����ϰ��� �ϴ� ������ ���
			    }	
		}
	}

  	RunnableEx r1 = new RunnableEx();
  	# r1.start()  <= �� ����� RunnableEx�� ȣ����� �ʱ� ������ ���� �߻�
  	
    Thread t1 = new Thread(r1, "Thread01");
    t1.start();
    
    �Ǵ�
    
    Thread  thread = new Thread(new RunnableEx(){
    	public void run(){
    		// �����尡 ���� �ڵ�;
    	}	
    }); <= �͸� ���� ��ü
    
    �Ǵ�
    
    Thread thread = new Thread( ()-> {
    		// �����尡 ���� �ڵ�;
    	}
    );
   
    
    thread.start();
 */
	}

}
