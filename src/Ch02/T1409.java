import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JButton;

class JFrameEX7 extends JFrame{
	private static final long serialVersionUID = 1L;
	
	JFrameEX7(){
		super("Border 레이아웃");
		
		setLayout(new BorderLayout());
		
		add(new JButton("버튼 EAST"), BorderLayout.EAST);
		add(new JButton("버튼 WEST"), BorderLayout.WEST);
		add(new JButton("버튼 SOUTH"), BorderLayout.SOUTH);
		add(new JButton("버튼 NORTH"), BorderLayout.NORTH);
		add(new JButton("버튼 Center"), BorderLayout.CENTER);
		
		setSize(500,300);
		setLocation(2500, 300);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class T1409 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JFrameEX7();
	}

}
