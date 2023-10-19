package Ch02;

class ThreadEx2 extends Thread{
	String name;
	public ThreadEx2(String name) {
		super(name); // 스레드의 이름을 지정하기 위해  ThreadEx2의 슈퍼클래스인  Thread의 생성자를 호출
		this.name = name;		
	}
	
	public void run() {
		int i=0;
		while(true) {
			System.out.println("스레드명: " + name + "숫자 : " + i++);
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
 6. Thread  클래스의 확장 클래스로 스레드 구현하기 
 */
		
		//스레드 객체를 생성한다.
		
		ThreadEx2  t1 = new ThreadEx2("Thread01");
		ThreadEx2  t2 = new ThreadEx2("Thread02");
		ThreadEx2  t3 = new ThreadEx2("Thread03");
		
		//start() 메소드를 호출하여  run() 메소드를 실행시킨다.
		t1.start();
		t2.start();
		t3.start();
	}

}
