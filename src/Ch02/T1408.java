package Ch02;// 플로우 레이아웃

import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Color;

import java.awt.FlowLayout;
import javax.swing.JButton;

class JFrameEX6 extends JFrame{
	private static final long serialVersionUID = 1L;
	
	JFrameEX6(){
		super("플로우 레이아웃");
		
		setLayout(new FlowLayout());
		
		add(new JButton("버튼1"));
		add(new JButton("버튼2"));
		add(new JButton("버튼3"));
		add(new JButton("버튼4"));
		add(new JButton("버튼5"));
		add(new JButton("버튼6"));
		add(new JButton("버튼7"));
		add(new JButton("버튼8"));
		add(new JButton("버튼9"));
		add(new JButton("버튼10"));
		
		setSize(500,300);
		setLocation(2500,300);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class T1408 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JFrameEX6();
	}

}
