package Ch02;// 문제 : 1부터 9까지 출력하는 스레드를 구현하여 스레드를 실행

class MyThread extends Thread{
/*	public void run() {
		System.out.println(getName() + " : " + "1번째");
	}
	*/
}

public class T0804 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 4. Thread 클래스로 구현 
 */
		/*
		MyThread th = new MyThread(); // 스레드 생성
		th.start(); //스레드 시작 메소드 호출
		*/
		
		/*
		Thread th = new MyThread();
		th.start();
		*/
		
		/*
		Thread thread = new Thread(){
	      	public void run(){
	      		System.out.println(getName() + " : " + "1번째");
	           }  
	      };
	    */  
	    
		/*
		 MyThread thread = new MyThread(){
	      	public void run(){	      		
	      			System.out.println(getName() + " : " + "1번째");
	      		}
	           }  
	      }; 
		 */
		
		MyThread thread = new MyThread(){
	      	public void run(){
	      		for(int i=0; i<10; i++) {
	      			System.out.println(getName() + " : " + i+" 번째");
	      			System.out.println(getName() + " : " + i+" 번째");
	      			System.out.println(getName() + " : " + i+" 번째");
	      		}
	           }  
	      };
	      
	      MyThread thread1 = new MyThread(){
		      	public void run(){
		      		for(int i=0; i<10; i++) {
		      			System.out.println(getName() + " : " + i+" 번째");
		      			System.out.println(getName() + " : " + i+" 번째");
		      			System.out.println(getName() + " : " + i+" 번째");
		      		}
		           }  
		      };
		
		thread.start();
		thread1.start();
	}

}
