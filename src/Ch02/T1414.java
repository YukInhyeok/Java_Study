// JTable

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

class JFrameEX12 extends JFrame{
	//1. 테이블의 각 셀에 들어갈 내용을 23차원 배열에 넣는다.
	
	Object [][]data = {
			{"2112-10123", "김네이버", "차장", 10, "naver@school.com"},
			{"2112-10124", "이다음", "부장", 20, "daum@school.com"},
			{"2112-10125", "나지멜", "대리", 30, "gmail@school.com"},
	};
	
	// 2. 테이블의 열 이름이 들어가 내용을 1차원 배열에 넣는다.
	String []columnName = {"사번","이름","직책","부서","이메일"};
	
	// 3. JTalbe 객체 생성
	JTable table = new JTable(data, columnName);
	
	JFrameEX12(){
		// 4. 프레임에 테이블을 추가한다.
		add(new JScrollPane(table), BorderLayout.CENTER);
		
		setSize(500, 300);
		setVisible(true);
		setLocation(2500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class T1414 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JFrameEX12();
	}

}
