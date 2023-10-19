/*
 실습 문제 2 : 프레임 생성 후 2초가 지난 후  패널에 색을 변경하고자 할 때 
 */

import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Color;


class JFrameEX4 extends JFrame{
	
	Color []color= {
			Color.RED, Color.GREEN, Color.BLUE, Color.CYAN, Color.MAGENTA, Color.PINK
	};
	
	JFrameEX4(){
		super("첫번째 실습");
		setBounds(2500, 300, 500, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
	}
	
	public void decorate(){
		Container pane = getContentPane();
		pane.setBackground(Color.BLACK);
		
		for(int i=0; i<= color.length; i++) {
			pane.setBackground(color[i]);
			
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}	
			
		}
		
	}
	
}

public class T1406 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrameEX4 f = new JFrameEX4();
		
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		f.decorate();
		
	}

}
