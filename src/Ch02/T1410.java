package Ch02;// GridLayout 클래스

import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;

class JFrameEX8 extends JFrame{
	private static final long serialVersionUID= 1L;
	
	// 프레임 북쪽에 배치할 계산 결과를 출력하기 위한 한 줄짜리 테스트를 입력받을 컴포넌트
	
	JTextField txtDis = new JTextField();
	
	JPanel numPanel = new JPanel();
	
	String []text= {
			" 7 ", " 8 ", " 9 "," / "," CE "," 4 "," 5 "," 6 "," * "," BS ",
			" 1 "," 2 "," 3 "," + "," 1/x "," 0 "," +/- "," . "," - "," = ", 
	};
	
	JButton []btn = new JButton[text.length];
	
	JFrameEX8() {
		super("GridLayout 클래스");
		
		// 입력 불가능
		txtDis.enableInputMethods(false);
		
		// JTextField 오른쪽 정렬
		txtDis.setHorizontalAlignment(JTextField.RIGHT);
		
		// 상하좌우 간격이 4인 4X5짜리 GridLayout을 패널의 레이아웃 매니저로 설정
		numPanel.setLayout(new GridLayout(4,5,4,4));
		
		// 패널 위에 버튼를 위치하게 반복문 사용
		for(int i=0; i<text.length; i++) {  // 20번 반복하면서
			btn[i] = new JButton(text[i]);  // 버튼을 생성한 후에
			numPanel.add(btn[i]);          // 패널에 추가 
		}
		
		// 프레임의 북쪽에 텍스트 필드를
		add(txtDis, BorderLayout.NORTH);
		
		// 가운데에는 패널을 배치한다.
		add(numPanel, BorderLayout.CENTER);
		
		setLocation(2500, 300);
		setSize(500,300);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}

public class T1410 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JFrameEX8();
	}

}
