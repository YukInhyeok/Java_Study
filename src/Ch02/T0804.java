package Ch02;// ���� : 1���� 9���� ����ϴ� �����带 �����Ͽ� �����带 ����

class MyThread extends Thread{
/*	public void run() {
		System.out.println(getName() + " : " + "1��°");
	}
	*/
}

public class T0804 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 4. Thread Ŭ������ ���� 
 */
		/*
		MyThread th = new MyThread(); // ������ ����
		th.start(); //������ ���� �޼ҵ� ȣ��
		*/
		
		/*
		Thread th = new MyThread();
		th.start();
		*/
		
		/*
		Thread thread = new Thread(){
	      	public void run(){
	      		System.out.println(getName() + " : " + "1��°");
	           }  
	      };
	    */  
	    
		/*
		 MyThread thread = new MyThread(){
	      	public void run(){	      		
	      			System.out.println(getName() + " : " + "1��°");
	      		}
	           }  
	      }; 
		 */
		
		MyThread thread = new MyThread(){
	      	public void run(){
	      		for(int i=0; i<10; i++) {
	      			System.out.println(getName() + " : " + i+" ��°");
	      			System.out.println(getName() + " : " + i+" ��°");
	      			System.out.println(getName() + " : " + i+" ��°");
	      		}
	           }  
	      };
	      
	      MyThread thread1 = new MyThread(){
		      	public void run(){
		      		for(int i=0; i<10; i++) {
		      			System.out.println(getName() + " : " + i+" ��°");
		      			System.out.println(getName() + " : " + i+" ��°");
		      			System.out.println(getName() + " : " + i+" ��°");
		      		}
		           }  
		      };
		
		thread.start();
		thread1.start();
	}

}
