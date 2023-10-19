/*
 이벤트 처리를 위해서는 이벤트 리스너를 구현하고 컴포너트에 리스너를 등록해야하는덷 그 순서는 다음과 같다.
 1. 처리할 이벤트의 종류를 결정한다.
 2. 이벤트에 적합한 이벤트 리스너 인터페이스를 사용하여 클래스를 작성한다.
 3. 리스너 인터페이스에 선언도니 메소드를 오버라이딩하여 이벤트 처리 루틴을 작성한다.
 4. 이벤트를 받아들일 각 컴포넌트에 리스너를 등록한다. 
 */

// 버튼 클릭에 대한 이벤트 처리

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

class JFrameEx15 extends JFrame implements ActionListener{
	JTextArea jta = null;
	JScrollPane sp = null;
	JPanel panSouth = new JPanel();
	JButton jbAdd = new JButton("추가");
	JButton jbClear = new JButton("클리어");
	JButton jbExit = new JButton("종료");
	
	public JFrameEx15() {
		sp = new JScrollPane(jta=new JTextArea("  자기소개서를 쓰세요", 15, 15));
		add(sp, BorderLayout.CENTER);
		
		panSouth.add(jbAdd);
		panSouth.add(jbClear);
		panSouth.add(jbExit);
		add(panSouth, BorderLayout.SOUTH);
		
		jbAdd.addActionListener(this);
		jbClear.addActionListener(this);
		jbExit.addActionListener(this);
		
		setVisible(true);
		setBounds(2500,300, 500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jbAdd) {
			JOptionPane.showMessageDialog(this, jta.getText());
			jta.setText("  자기소개서를 쓰세요");
		} else if(e.getSource() == jbClear) {
			jta.setText("  자기소개서를 쓰세요");
		} else if(e.getSource() == jbExit) {
			System.exit(0);
		}
	}
}

public class T1415 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JFrameEx10();
	}

}
