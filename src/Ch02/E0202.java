package Ch02;

public class E0202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
  1. 객체지향 프로그래밍 단계
  - 1단계 : 객체 모델링 단계
   => 객체를 추상화하는 객체 모델링 단계
   => 클래스를 정의하고 클래스 내 필드, 메소드를 정의
   => 속성, 변수, 필드
   => 기능, 함수, 메소드
   
   ex) 속성 -> 필드			기능				-> 메소드
   	   속도 -> speed			속도 증가, 속도 감소 -> speedUp(), speedDown()
   		
  - 2단계 : 클래스와 관계
   => 추상 단계에서 얻어진 클래스 이름, 필드, 메소드를 코드로 바꾸는 클래스 정의 작업
   => 자바는 클래스를 정의하기 위해서 class 라는 예약어
   => 클래스 형식
   
   class 클래스이름{
   	* 클래스 멤버 = 필드 + 메소드
   	필드 <= 변수 선언 형태 사용
   		<= 정수 : int 타입, 실수 : double 타입, 문자(열) : String
   		ex) 접근지정자(public, private, protected, default) 자료타입(int, double  	
   }
   
   ex) class Car{
   		}
   		
    => 접근지정자
    - 허용범위
    접근지정자			자신의 클래스		같은 패키지			하위 클래스			다른 패키지
    =========================================================================
    private				O				X				X				X
    
    (default)			O				O				X				X
    
    protected			O				O				O				X
    
    public			`	O				O				O				O
    
    - 허용범위 크기
    private < default < protected < public
    
    - 사용환경(범위)
    private : 접근 허용 범위가 가장 좁으며, 같은 클래스의 메소드만 접근이 가능하다.
    
    public : 접근 허용 범위가 가장 넓으며 접근 제한 전혀 없다.
    
    protected : 패키지에 관계없이 상속 관계가 있는 자손 클래스에서 접근이 가능하다.
           
    default : 같은 패키지 내에서만 접근이 가능하고, 생략할 수 있다. 
   
   
   - 접근 지정자 사용 대상
    클래스 => (default), public
    필드, 메소드 => private, (default), protected, public
    지역변수 : 아무것도 사용할 수 없다. 
    ex) 
    
    class Car(){
    	public int speedUp(int i){
    		int j = i;
    		return j;
    	}
    	
    	public int sum(int i, int j){
    		// int hap = i + j;
    		// return hap;
    		   return i+j;
    	}
    }   
    
   
  - 3단계 : 객체 생성과 사용 
 */
	

	}

 
}

