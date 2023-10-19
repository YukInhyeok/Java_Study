
public class T1401 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*
 1. 그래픽 사용자 인터페이스
 - 정의 : 윈도우 화면으로 결과가 표시
         윈도우 화면에서 시스템과 사용자 간의 의사 소통을 수행하는 방식 
         ex) 다양한 콤퍼넌트 또는 컨트롤
 - 콘솔 기반의 프로그래밍은 콘솔에서 텍스트로 결과가 표시
 
 2. 다양한 컴포넌트와 분류
 
 컴포넌트 - 일반 컴포넌트 
          ex) 버튼, 레이블, 메뉴, 체크박스, 리스트, 텍스트필드
              => 정보를 표시하거나 사용자로부터 정보를 입력받는 데 이용      
        - 컨테이너 - 일반 컨테이너
          			ex) 패널, 스클로 페인          		  
          		  - 최상위 수준 컨테이너
          		    ex) 프레임, 대화상자, 애플릿 
 
 3. 최상위 수준 컨테이너 세부 내용
 ======================================================================
 이름			관련 클래스				설명
 ======================================================================
 프레임			java.awt.Frame			제목과 외형을 갖는 최상위 수준의 윈도우를 표현
 				javax.swing.JFrame
 
 대화상자			java.awt.Dialog			필요한 정보의 출력과 입력에 이용되도록 최상위
  				javax.swing.JDialog		 윈도우 프로그램과 구별되는 독립적인 하부 윈도우  
 
 애플릿			java.awt.Applet			브라우저에서 실행되는 윈도우를 표현	
 				javax.swing.JApplet
 
 4. awt  vs.  swing
 - AWT : 실행되는 플랫폼의 운영체제의 컴포넌트 자원을 활용하여 GUI를 제공하므로 플랫폼에 따라 GUI 외형이 다를 수 있다.
 		 java.awt 패키지 제공
 - SWING : AWT와 다르게 해당 운영체제의 컴포너트 자원을 활용하지 않고 순수하게 자바로 구현되어 있으므로 AWT보다
 			다양하고 풍부한 GUI를 제공한다.
 			모든 플랫폼에서 동일한 GUI 외형의 화면을 보여줄 수 있다.
 			javax.swing 패키지 제공
 
 5. 컨테이너와 컴포넌트
 ✓ 컨테이너
- 다른 컴포넌트를 포함할 수 있는 GUI 컴포넌트
- 다른 컨테이너에 포함될 수 있음

  . AWT 컨테이너: Panel, Frame, Applet, Dialog, Window
  . Swing 컨테이너: JPanel, JFrame, JApplet, JDialog, JWindow


✓ 컴포넌트

- 컨테이너에 포함되어야 비로소 화면에 출력될 수 있는 GUI 객체
- 다른 컴포넌트를 포함할 수 없는 순수 컴포넌트
- 모든 GUI 컴포넌트가 상속받는 클래스: java.awt.Compnent
- 스윙 컴포넌트가 상속받는 클래스: javax.swing.JComponent

 6. JFrame 컨테이너 클래스
 ✓ Swing 클래스 계층구조
- Component
  . 화면에 표시되어서 사용자와 상호 작용하는 시각적인 객체를 나타냄.

- Container
  . 내부에 다른 컴포넌트를 추가할 수 있는 기능을 제공
  . 이 클래스의 add()를 사용하면 컨테이너 안에 컴포넌트를 추가

- Window
  . 경계선, 타이틀 바, 버튼을 가지고 있는 윈도우를 정의

- Frame
  . 자바 GUI 애플리케이션의 기초(AWT)

- JFrame
  . Frame 클래스를 스윙의 출시에 맞추어 변경



✓ 중요한 메소드

- setLocation(x, y), setBounds(x, y, width, height), setSize(width, height) // 프레임의 위치와 크기를 설정
- setIconImage(IconImage) // 윈도우 시스템에 타이틀 바, 태스크 스위처에 표시할 아이콘을 알려줌
- setTitle() //타이틀 바의 제목 변경
- setResizable(boolean) //사용자가 크기를 조절할 수 있는지를 설정

✓ 스윙 응용프로그램의 종료

- System.exit(0); //언제 어디서나 무조건 종료, 응용 프로그램 내에서 스스로 종료
- 프레임의 오른쪽 상단의 종료 버튼(x)이 클릭되면?????
---> 프레임 종료, 프레임 윈도우를 닫음(프레임이 화면에서 보이지 않게 됨)
  
===> 프레임 종료 버튼이 클릭될 때, 프레임과 함께 프로그램을 종료시키는 방법이
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 를 사용하는 것이다.

   
 */
	}

}
