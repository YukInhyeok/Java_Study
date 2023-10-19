package Ch02;// ItemEvent 클래스

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.AbstractButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

class JFrameEx16 extends JFrame implements ItemListener{

	String []strFood= {"음료수 ", "라면 ", "과자 ", "아이스크림 "};
	JCheckBox []cbFood = new JCheckBox[strFood.length];
	JPanel panNorth=new JPanel();
	 
	JTextArea jta=null;
	JScrollPane sp=null;
	
	public JFrameEx16(){
	  	for(int i=0; i<strFood.length; i++){
	   		cbFood[i] = new JCheckBox(strFood[i]);
	   		panNorth.add(cbFood[i]);
	   		cbFood[i].addItemListener(this);
	   	}
		add(panNorth, BorderLayout.NORTH);		
		
		sp = new JScrollPane(jta=new JTextArea());
		add(sp, BorderLayout.CENTER);
		
		setVisible(true);
	    setBounds(300, 300, 600, 150);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	
	
	// ActionEvent 클래스를 사용할 경우
	// public void actionPerformed(ActionEvent e){..}
	
	// ItemEvent 클래스를 사용할 경우
	public void itemStateChanged(ItemEvent e) {
		 
		 String item=((AbstractButton)e.getItem()).getText();
		 if(e.getStateChange()==ItemEvent.SELECTED){
			 jta.append(item+"선택 \n"); 
		 }else{
			 jta.append(item+"해제 \n");
		 }
	}
}

public class T1416 {
	public static void main(String[] args) {
		new JFrameEx16();
	}
}
