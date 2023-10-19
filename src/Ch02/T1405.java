package Ch02;/*
 실습 문제 2 : 프레임 생성 후 2초가 지난 후  패널에 색을 변경하고자 할 때 
 */

import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Color;


class JFrameEX3 extends JFrame{
	
	JFrameEX3(){
		super("첫번째 실습");
		setBounds(2500, 300, 500, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
	}
	
	public void decorate(){
		Container pane = getContentPane();
		pane.setBackground(Color.YELLOW);
				
	}
	
}

public class T1405 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrameEX3 f = new JFrameEX3();
		
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		f.decorate();
		
	}

}
