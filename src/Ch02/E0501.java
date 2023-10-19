package Ch02;

public class E0501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 1. 상속
 - 현실세계에서 상속은 자식이 부모가 가지고 있는 재산이나 권력을 물려받는다.
 - 객체지향프로그램 => 부모 클래스의 멤버(필드, 메소드)를 자식 클래스에게 물려줄 수 있다.
 - 클래스가 2개이상 존재
 - 클래스 간에 관계 : 특정(자식) 클래스는 다른(부모) 클래스가 가지고 있는 모든 필드나 메소드를 사용할 수 있다.
 
 * 상속 제외 : 1. 부모 클래스에서 접근지정자를 public 이 아니고 private 접근 제한을 갖는 필드나 메소드는 상속 대상에서 제외
             2. 서로 다른 패키지에 부모 클래스와 자식 클래스가 각각 존재한다면 default 접근 제한을 갖는 필드와 메소드는 상속 대상에서 제외             
             3. 그 이외에 경우는 모두 상속 대상 된다. 
   => 메소드 재정의       
 
 - 부모 클래스 = 상위 클래스 = 슈퍼 클래스 = 조상 클래스  <= 상속을 해주는 클래스 
   자식 클래스 = 하위 클래스 = 서브 클래스 = 자손 클래스  <= 상속을 받는 클래스
   
 - 상속 관계
  : 수직 관계 => 부모(상위)-자식(하위) 클래스, extends, is to 관계 
  ex) 1
      2
      3
  ex) class 자식 클래스 extends 부모 클래스 {
       }
  ex) class 택시 extends 자동차{
      }
      class 택시 extends 운송 수단 {
      }
      class 택시 extends 자동차, 운송 수단 {  <= 다중 상속이 안된다.
                                          <= 자바 이외의 객체지향언어에서는 다중 상속이 가능하다.
      }
                  
           
  
  : 수평 관계 : 형제 클래스, 같은 레벨의 클래스들, 추상클래스, implements, has to 관계
   ex) 운송 수단
         - 자동차
           - 자가용
           - 택시
           - 트럭
         - 비행기
         - 배
         - 자전거
         - 우주선
   
   ex) 비행기 implements 자동차{
       }
       
       비행기 implements 자동차, 비행기, 배{
       } 
 
 => 상속이란 자식이 부모가 가지고 있는 재산이나 권력을 물력받다는 의미
 => 특정(자식)클래스는 다른(부모)클래스가 가지고 있는 모든 멤버(필드나 메소드)를 사용할 수 있다.
 
 => 상속 계층도를 가지고 상속의 개념을 정리
 1. 자동차(자식) 클래스는 운송 수단(부모) 클래스로부터 파생된 객체로서 운송 수단(부모) 클래스가 가지고 있는
     모든 속성들을 상속받아 사용할 수 있다. 
 2. 택시(자식) 클래스는 자동차(부모) 클래스로부터 파생된 객체로서 자동차(부모) 클래스가 가지고 있는 모든 속성들을
     상속받아 사용할 수 있다. 
 
 
 2. 상속 형식
 class 서브클래스명 extends 슈퍼클래스명{
 }
 
 class 자식클래스명 extends 부모클래스명{
 }
 
   ex) 운송 수단
         - 자동차
           - 자가용
           - 택시
           - 트럭
         - 비행기
         - 배
         - 자전거
         - 우주선
   
   ex) class 택시 extends 운송수단{
        }
 
       class 택시 extends 자동차 {
       }
       
       class 트럭 extedns 자동차, 운송수단 {  <= 다른언어에서는 다중상속이 허용되지만
                                          <= 자바에서는 다중상속이 허용되지 않습니다.
       }
       
       => class 운송수단{
           //필드
           //생성자
           //메소드
       
       }
       
          class 자동차 extends 운송수단{
           //필드
           //생성자
           //메소드
          }
          
          class 트럭 extends 자동차 {
           //필드
           //생성자
           //메소드
          } 
 
   ex) class  자식클래스 extends 부모클래스 {
           //필드
           //생성자
           //메소드
   
       }
       
       
 
*/
	}

}
