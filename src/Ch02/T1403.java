package Ch02;// 1 단계 : javax.swing 패키지를  import 한다.

import javax.swing.JFrame;

// 3 단계 : JFrame의 상속을 받는  JFrameEx 서브 클래스 설계한다.
class JFrameEX extends JFrame{
	  
	JFrameEX(){
		// 4 단계 : 슈퍼 클래스인  JFrame의 생성자 중에서 JFrame(String title)을 호출한 후 'super("스윙연습");'
		// 			을 기술하고 제목표시줄에 "스윙 연습"이 출력
		// super("스윙 연습");
		// 또는
		// 4 단계
		
		//setTitle(title);
		
		super("스윙 연습");
		setLocation(2500, 300);
		setSize(500, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

public class T1403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2 단계 : JFrameEX 객체를 생성
		//		  생성자가 호출되어 프레임을 출력하기 위한 모든 준비 작업을 끝내고 화면에 프레임이 나타난다.
		// new JFrameEX("스윙 연습");
		new JFrameEX();
	}

}
