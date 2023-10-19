// 컴포넌트 다루기 - JLabel과 JTextArea와 JScrollPane

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class JFrameEx10 extends JFrame{
	// 사원의 정보를 입력받기 위한 텍스트 필드를 배치할 패널
	JPanel west = new JPanel();
	// 작업을 위한 버튼을 배치할 패널
	JPanel south = new JPanel(new FlowLayout(FlowLayout.RIGHT));
	
	
	// 텍스트 필드 앞에 붙일 라벨의 캡션을 위한 문자열 배열 생성
	String []caption = {"사번","이름","직책","부서","메일"};
	
	// 버튼의 캡션을 위한 문자열 배열 생성
	String []caption2 = {"전체", "추가", "검색", "삭제", "종료"};
	
	// 사원 정보를 입력받기 위한 패널과 라벨 텍스트 필드 배열 생성
	JPanel jp[] = new JPanel[5];
	JLabel jl[] = new JLabel[5];
	JTextField tf[] = new JTextField[5];
	
	// 작업을 위한 버튼 배열 생성
	JButton jb[] = new JButton[5];
	
	// 자기 소개를 입력받기 위한 텍스트 Area와 스크롤 패널
	
	JTextArea jta;
	JScrollPane sp;
	
	public JFrameEx10() {
		// 텍스트 필드를 위한 패널의 배경색을 분홍으로 하고 5X1짜리 그리드 레이아웃 설정
		west.setBackground(Color.PINK);
		west.setLayout(new GridLayout(5,1,10,10));
		
		// 버튼을 위한 패널의 배경색을 노란색으로 하고 디폴트인 플로우 레이아웃을 사용
		
		south.setBackground(Color.pink);
		
		for(int i=0; i<caption.length; i++) {
			//라벨 생성
			jl[i] = new JLabel(caption[i]);
			
			// 텍스트 필드 생성
			tf[i] = new JTextField(6);
						
			// jp  패널 생성후
			jp[i] = new JPanel();
		
			// 배경성을 분홍색으로 설정
			jp[i].setBackground(Color.PINK);
						
			// 라벨과
			jp[i].add(jl[i]);
			
			//	버튼을 추가한 후
			jp[i].add(tf[i]);
			
			// west 패널에 추가
			west.add(jp[i]);
		}
		
		// 스크롤 팬에 텍스트 필드를 추가하여 생성한다.
		sp = new JScrollPane(jta=new JTextArea("자기소개서를 쓰세요", 15,15));
		
		for(int i=0; i<caption2.length;i++) {
			// 버튼을 생성하여
			jb[i] = new JButton(caption2[i]);

			// south 패널에 추가
			south.add(jb[i]);
		}
		
		// west 패널은 프레임의 서쪽에
		add(west, BorderLayout.WEST);
		
		// 스크롤 팬은 프레임의 가운데에
		add(sp, BorderLayout.CENTER);
		
		// south 패널은 프레임의 남쪽에 추가
		add(south, BorderLayout.SOUTH);
		
		setVisible(true);
		
		setBounds(2500,300, 500,300);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}	
}


public class T1412 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JFrameEx10();
	}

}

