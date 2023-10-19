package Ch02;/*
 실습 문제 : (2500,300) 위치에 (500,300) 크기의 윈도우 프레임을 setBounds() 메소드를 사용하여 생성한다.
 			타이틀 바에는 "첫번째 실습"가 출력되도록 한다.
 */

import javax.swing.JFrame;

class JFrameEX2 extends JFrame{
	JFrameEX2(){
		super("첫번째 실습");
		setBounds(2500, 300, 500, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

public class T1404 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JFrameEX2();
	}

}
