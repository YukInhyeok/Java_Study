// 컴포넌트 다루기 - JCehckBox, JRadioButton, JCombo, JList

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

class JFrameEX11 extends JFrame{
	
	// 회원 라디오 버튼
	String []strMem = {"비회원","회원","골드회원"};
	JRadioButton []rbMem = new JRadioButton[strMem.length];
	ButtonGroup bgMem = new ButtonGroup();	
	
	// 사용시간 콤보박스
	JComboBox  combo = new JComboBox();
	
	// 먹을 거리 체크 박스
	String []strFood = {"음료수","라면","과자","아이스크림"};
	JCheckBox []cbFood = new JCheckBox[strFood.length];
		
	// 쿠폰 리스트 박스
	JList list;
		
	// 패널
	JPanel mainCenter = new JPanel();
	JPanel mainEast = new JPanel(); 
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	
	
	public JFrameEX11(){
		mainCenter.setLayout(new BorderLayout());
		
		add(mainCenter, BorderLayout.CENTER);
		add(mainEast, BorderLayout.EAST);
		
		mainCenter.add(p1, BorderLayout.NORTH);
		mainCenter.add(p2, BorderLayout.SOUTH);
		
		p1.setBorder(new TitledBorder(
				new EtchedBorder(), "회원&사용시간", TitledBorder.LEFT, TitledBorder.TOP,
				new Font("굴림", Font.PLAIN, 11), Color.red));
		p1.setLayout(new GridLayout(1,0));
		
		for(int i=0; i<strMem.length;i++) {
			rbMem[i] = new JRadioButton(strMem[i]);
			bgMem.add(rbMem[i]);
			p1.add(rbMem[i]);
		}
		
		combo.addItem("사용시간 선택");
		for(int i=1;i<=48; i++)
			combo.addItem(i+"시간");
		p1.add(combo);
		
		p2.setBorder(new TitledBorder(
				new EtchedBorder(), "먹을거리", TitledBorder.LEFT, TitledBorder.TOP,
				new Font("굴림", Font.PLAIN, 11), Color.red));
		p2.setLayout(new GridLayout(1,0));
		
		for(int i=0; i<strFood.length;i++) {
			cbFood[i] = new JCheckBox(strFood[i]);
			p2.add(cbFood[i]);
		}
		
		mainEast.setBorder(new TitledBorder(
				new EtchedBorder(), "사용시간", TitledBorder.LEFT, TitledBorder.TOP,
				new Font("굴림", Font.PLAIN, 11), Color.green));
		
		Vector<String> vec = new Vector<String>();
		
		for(int i=1; i<= 10; i++)
			vec.add(i+"000원 쿠폰");
		
		list = new JList(vec);
		
		list.setVisibleRowCount(10);
		
		mainEast.add(new JScrollPane(list));
		
		setVisible(true);
		setBounds(2500,300, 500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

public class T1413 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JFrameEX11();
	}

}
