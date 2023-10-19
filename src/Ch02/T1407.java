/*
 * 배치관리자(Layout Management)
 - 정의 
   : 컨테이너에 배치되는 컴포넌트의 위치를 일관성 있게 관리하는 방법을 제공하는 클래스
 - 종류
 ==========================================================================
   배치관리자						설명
 ==========================================================================
 BorderLayout					중앙에 위치하는 컴포넌트가가 컨테이너의 크기 변화에 따라 함께 변하려는 경우
 
 FlowLayout						여러 컴포넌트를 원래 크기로 한 행 또는 여려 행에 배치하고자 하는 경우
 
 BoxLayout						여러 컴포넌트를 한 행 또는 한 열에 원하는 크기로 배치하고자 하는 경우
 
 GridLayout						여러 컴포넌트를 행과 열로 나누어 동일한 크기로 배치하고자 하는 경우
 
 CardLayout						배치관리자를 여러 개 사용하려는 경우
 
 SpringLayout, GridBagLayout	여러 컴포넌트를 매우 복잡하게 배치하는 경우
 
 - 기타
   : 패널은 기본적으로 배치관리 FlowLayout으로 관리되며, 프레임과 대화상자는 BorderLayout이 기본 배치관리자
  
   	기본 배치관리                        컨테이너
   	======================================================================
   	FlowLayout				Panel, Applet, JPanel, JApplet
   	
   	BorderLayout			Frame, Dialog, JFrame, JDialog	 			
 
 - 형식
 
 컨테이너명.setLayout(new BorderLayout(30,20));
 컨테이너명.setLayout(new FlowLayout(FlowLayout.Center, 10,20));
 
 컨테이너명.setLayout(null);  // 배치관리자를 지정하지 않는 방법
 
 */
public class T1407 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
