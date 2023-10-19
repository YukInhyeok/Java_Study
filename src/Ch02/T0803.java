package Ch02;

public class T0803 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 
 3. Thread 클래스의 주요 메소드

=======================================================================================================
			메소드									기능								
=======================================================================================================
static int activeCount()				현재 활동 중인 스레드의 개수를 반환
static Thread currentThread()			현재 실행 중인 스레드를 반환
void setName(String name)				스레드의 이름을 지정 
String getName()						스레드의 이름을 반환
void setPriority(int priority)			스레드의 우선순위 지정
int getPriority()						스레드의 우선순위 반환
void setId(int Identity)				스레드의 ID를 지정
long getId()							스레드의 ID를 반환
static void sleep(int millisencods)		지정된 1/1000초 동안 쉬도록 하는 메소드	 
void run()								스레드 기능을 수행하는 메소드로 start() 메소드를 호출하면 실행되는 메소드
void start()							스레드를 시작하는 메소드

  
  
4. run() 메소드 내에서 Thread 클래스, Runnable 인터페이스를 사용하는 형식
  * 단일 쓰레드가 아닌 다중 쓰레드를 사용할 경우 Run() 메소드 사용 방법
4-1 Thread 클래스를 이용한 방법
ex)  
	class ThreadEx extends Thread{
		public void run(){
			* 단일 쓰레드일 경우
			 	// 수행해야 할 명령어들
			 	  
			* 다중 쓰레드일 경우
			  ** 다중 쓰레드를 무한 반복할 때
			  	while(true){
			  		....   // Thread의 run() 메소드를 오버라이딩하여 다중 스레드를 동작하고자 하는 로직을 기술
			  		if(조건)
			  			break;
			  	}
			  
			  ** 다중 쓰레드를 일정 횟수만큼 사용할 때
			    for() {
			    	....   // Thread의 run() 메소드를 오버라이딩하여 다중 스레드를 동작하고자 하는 로직을 기술
			    }
			    	 
		}
	}
	
	ThreadEx t1 = new ThreadEx("Thread01");
	t1.start;
	
	또는
	
	Thread t1 = new new ThreadEx("Thread01"); 
	t1.start;
	
	또는
	
	Thread t1 = new Thread("Thread01"){
		public void run(){
			// 스레드가 실행할 코드
		}
	}  <= 익명 자식 객체

4-2 Runnable 인터페이스를 사용하는 방법

ex)
	class RunnableEx implements Runnable {
		public void run(){
			* 단일 쓰레드일 경우
			 	// 수행해야 할 명령어들
			 	  
			* 다중 쓰레드일 경우
			  ** 다중 쓰레드를 무한 반복할 때
			  	while(true){
			  		....   // Thread의 run() 메소드를 오버라이딩하여 다중 스레드를 동작하고자 하는 로직을 기술
			  		if(조건)
			  			break;
			  	}
			  
			  ** 다중 쓰레드를 일정 횟수만큼 사용할 때
			    for() {
			    	......   // Thread의 run() 메소드를 오버라이딩하여 다중 스레드를 동작하고자 하는 로직을 기술
			    }	
		}
	}

  	RunnableEx r1 = new RunnableEx();
  	# r1.start()  <= 위 방법은 RunnableEx가 호출되지 않기 때문에 오류 발생
  	
    Thread t1 = new Thread(r1, "Thread01");
    t1.start();
    
    또는
    
    Thread  thread = new Thread(new RunnableEx(){
    	public void run(){
    		// 스레드가 실행 코드;
    	}	
    }); <= 익명 구현 객체
    
    또는
    
    Thread thread = new Thread( ()-> {
    		// 스레드가 실행 코드;
    	}
    );
   
    
    thread.start();
 */
	}

}
