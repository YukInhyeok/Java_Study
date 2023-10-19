package Ch02;// 1단계 : javax.swing.JFrame 을 import
import javax.swing.JFrame;

public class T1402 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 2단계 : 윈도우를 위한 JFrame 객체 생성
		JFrame fw = new JFrame();
		
		// 3단계 : 윈도우의 가로와 세로 지정
		//fw.setSize(500, 300);
		
		// 4단계 : 윈도우 캡션(제목) 지정
		fw.setTitle("swing 프로그램 예제");
		
		// 5단계 : 윈도우 위치 지정
		//fw.setLocation(2500, 300);
		
		fw.setBounds(2500, 300, 500, 300);
		
		/*
		 메소드					설명
		 =======================================================
		 getSize()			컴포넌트의 사이즈를 얻어낸다.
		 getLocation()		왼쪽/상단의 좌표를 반환, 즉 어디에 위치해 있는지를 알 수 있다.
		 getBounds()		위치, 사이즈를 반환한다.
		 setSize(int width, int height)		위치, 사이즈를 반환한다.
		 setLcoation(int x , int y)			왼쪽/상단의 좌료를 지정한다.
		 setBounds(int x, int y, int width, int height)	
		 									위치, 사이즈를 지정한다.	  
		  
		 */
		
		/*
		 - setDefaultCloseOperation() 메소드의 상수
		 상수						설명
		 ======================================================
		 DISPOSE_ON_CLOSE 		윈도우를 종료할 때 모든 자원을 반납한다.
		 DO_NOTHING_ON_CLOSE	윈도우를 종료할 때 아무일도 하지 않는다.
		 EXIT_ON_CLOSE			윈도를 강제로 종료한다.
		 HIDE_ON_CLOSE			윈도우를 종료할 때 윈도우를 숨긴다.
		  
		 */
		
		
		// 6단계 : 화면에 표시
		fw.setVisible(true);
		
		fw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
