package Ch02;

public class T0802 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 
 2. 스레드 구현 / 생성 방법
 - 단일 스레드 vs 다중 스레드
 단일 스레드 : 한 프로세스에 하나의 스레드만을 가진것
 다중 스레드 : 하나의 프로세스에 다수의 스레드를 가지고 동시에 작업을 수행
 
 - 스레드를 구현하는 방법 : 2가지
 1. Thread 클래스를 사용하는 방법 => 클래스 선언시 클래스 이름 다음에 extends Thread  <=  상속 
 ex)  class  클래스 이름  extends Thread{
 
       }
 
 2. Runnable 인터페이스를 사용하는 방법 => 클래스 선언시 클래스 이름 다음에 implements Runnable <= 상속 X
 ex)  class  클래스 이름 implements Runnable {
 
      }    
 
 - 스레드를 실행시키기 위한 동작 방법
 1. 스레드 객체의 start() 메소드를 호출함으로써 실행된다.
 
    ex)
     * 단일 쓰레드 객체 생성 예
         main(){
         Thread t = new MyThread();
                  
         t.start();         
    }
    
      * 멀티 쓰레드 객체 생성 예
         main(){
         Thread t1 = new MyThread();
         Thread t2 = new MyThread();
         
         t1.start();
         t2.start();
    }
 
 2. start() 메소드를 호출되면 클래스내 run() 메소드가 자동 호출된다. 
    run() 메서드는 다중 스레드로 동작시키고자 하는 명령어들을 기술하고 실행
    
    class Mythread extends Thread {
       public void  run(){
         // 수행해야 할 명령어들
       }
    
    }
    
 3. start()메소드를 사용하면 자동으로 스레드가 실행된다. 
  
  
 * 그림으로 동작 설명 
 메인 스레드
     |
     |    1번  
 스레드 객체 생성  ---------------> 스레드 객체
     |
     |    2번
 start() 메소드를 호출  ----------> public void run(){
     |                                   |
     |  3번 메인 스레드 실행                  |  		3번 작업 스레드 실행   
     |                            }
          
 - Thread 클래스를 상속하기
 1.Thread 를 상속받아서 클래스를 작성한다.
    class MyThread extends Thread {
                   ......
    }
  
 2. 클래스내 run() 메소드를 재정의한다.
    class MyThread extends Thread {
          public void run(){
          	// 수행해야 할 명령어들
          }          
    }
 
 
 3. Thread 객체를 생성한다.
 
    Thread  t = new MyThread();   (O)
  
    // MyThread t = new MyThread(); (X)
  
 3-1 코드를 좀 더 절약하기 위해 Thread 익명 객체를 매개값으로 사용할 수 있는 "익명 자식 객체"를 사용할 수 있다.
 
      * 익명 자식 객체
      
     Thread thread = new Thread(){
     	public void run(){
          	// 수행해야 할 명령어들
          }  
     }; 
  
 4. start() 호출하여 스레드를 시작한다.
 
     t.start();
     
     thread.start()
 
  
 - Runnable 인터페이스를 구현하는 방법
 1. Runnable 인터페이스를 구현한 클래스를 작성한다.
	class MyRunnable implements Runnable{
	            .......
	}
	
 2. MyRunnable 클래스내에 run() 메소드를 작성한다.
 	class MyRunnable implements Runnable{
	      public void run(){
	      		// 수행해야 할 명령어들
	      }
	}
 
 3. Thread  객체를 생성하고 이때 MyRunnable 객체를 인수로 전달한다.
 
    Thread  t1  = new Thread(new MyRunnable);
 
 3-1 Runnable 구현 객체를 생성한 후 이것을 매개값으로 해서 Thread 생성자를 호출하면 비로서 작업 스레드가 생성된다.
 
    Runnable  task = new MyRunnable();
    
    Thread thread = new Thread(task);     
 
 3-2 코드를 좀 더 절약하기 위해 Thread 생성자를 호출할 때 Runnable 익명 객체를 매개값으로 사용할 수 있다.
    * 익명 구현 객체
     
    Thread  thread  = new Thread(new Runnable()){
    	public void run(){  <= run() 메소드는 하나만 정의되어 있기 때문에 "함수적 인터페이스"이라고 한다.
    	   // 스레드가 실행 코드;
    	}
    }
 
 3-3 람다식을 매개값으로 사용하는 방법
     <= 자바 8 이후 부터 지원
     
     Thread thread = new Thread( ()-> {
           //스레드가 실행할 코드  
     	}     
     ); 
 
 4. start() 메소드를 호출하여 스레드를 시작한다.
 	
 	thread.start();
    
 */
	}

}
