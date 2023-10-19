package Ch02;

public class T0907 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
		 
		 
	  * 스레드 동기화에서 동기화 효율을 높이기 위한 방안으로 클래스 Object의 메소드 wait(), notify(), nofityAll() 사용
	  
	   ==============================================================================================
	   상태                             의미
	   ==============================================================================================
	   final void wait()				다른 스레드가 notify() 또는 notifyAll()을 호출할 때까지 현재 스레드를 기다리도록하는 메소드
	   
	   final void wait(long timeout)	다른 스레드가 notify() 또는 notifyAll()을 호출할 때까지 또는 지정된 시간(천분의 1초)이 지날 때까지 현재 스레드를 기다리도록 하는 메소드
		   
	   final void nofity()				객체의 처리를 기다리는 스레드 중의 오직 하나를 깨워 진행하도록 하는 메소드
	                                    기다리는 스레다가 여러 개인 경우에 JVM 을 이용해서 스레드를 결정
	   
	   final void nofityAll()  			객체의 처리를 기다리는 모든 스레드를 깨워 진행하도록 하는 메소드
		   
		   
	   >example
		   
	   public synchronized void withdraw(int money){
	   		...........
	   		int count=0;
	   		while(balance < money){
	   				..........
	   				// 지속적으로 잠금이 부족하여 메소드 종료
	   				if(++count > 3){
	   				   System.out.println("잔금이 부족하여 출금처리 못하고 종료합니다.");
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
