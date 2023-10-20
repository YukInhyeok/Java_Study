package Ch01;

public class HelloWorld {	// 클래스 정의

	public static void main(String[] args) {	// 메소드 정의
		/*
		 String[] args
		 		 
		  ex) c:/> HelloWorld test1.java test2.java  <<args 
		 
		 */
		// TODO Auto-generated method stub
		System.out.println("Hello World!!!~");
		// 클래스.필드.메소드
		// 클래스.메소드
		// 클래스.메소드.필드(X)
		
		/*
		 @ 자바(main) 메소드의 기본 형식
		 1. public : public은 누구나 접근 가능하도록 하기 위한 예약어
		 2. static : static은 클래스만 존재하면 메소드를 바로 수행할 수 있도록 할 수 있다
		 3. void   : 메소드는 리턴값을 가질 수 있는데, void는 main 메소드가 리턴 값을 갖지 않는다
		 4. main   : 메소드의 이름이다
		 			 자바에서는 ()로 메소드임을 알리는데 여려 개의 메소드를 구분하기 위한 용도로 메소드의
		 			 이름을 부여하게 된다. 특히, main 메소드는 자바를 실행시키기 위한 프로그램의 진입점으로
		 			 사용한다.
		 5. String[] args : 메소드 이름 다음에 기술하는 ()안에 작성하는 인자, 전달 인자라고 한다.
		 				전달 인자는 메소드를 실행시키는데 필요한 데이터를 전달받아야 할 경우에 사용한다.
		 				main 메소드의 경우 ()안에 기술한 args가 메소드에 값을 전달했을 경우 이를 받아 오는
		 				전달 인자로 사용된다.
		 */
		
		/**
		  javadoc.exe 명령어를 이용해 소스 코드에 대한 도움말을 생성하는 기능
		  
		  ex) /**
		  	  *  @작성일 : 2021년 3월 9일
		  	  *  @작성자 : 홍길동
		  	  *  @파일명 : HelloWorld.java
		  	  *  @내용  : Hello World를 출력하는 소스 코드입니다.
		  	  */
	}

}
