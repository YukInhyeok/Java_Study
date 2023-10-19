package Ch02;// CardLayout 클래스

import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Color;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;

import javax.swing.JButton;

import javax.swing.JPanel;
import javax.swing.JTextField;

class JFrameEX9 extends JFrame{
	private static final long serialVersionUID = 1L;
	
	CardLayout card = new CardLayout();
	
	String []caption={"패널1","패널2","패널3","패널4","패널5","패널6"};
	
	Color []color={Color.RED, Color.GREEN, Color.BLUE, Color.CYAN, Color.MAGENTA, Color.PINK};
	
	JPanel []panel = new JPanel[6];
	
	JFrameEX9(){
		super("CardLayout");
		
		setLayout(card);
		
		for(int i=0; i<caption.length;i++) {
			panel[i] = new JPanel();
			panel[i].setBackground(color[i]);
			add(panel[i], caption[i]);
		}
		
		setBounds(2500,300, 500, 300);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		change();
	}
	
	public void change() {
		int cnt=0;
		while(true){
			card.show(this.getContentPane(), caption[cnt]);
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			if(++cnt >= caption.length)
				cnt=0;
		}
	}
	
}

public class T1411 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JFrameEX9();
	}

}
