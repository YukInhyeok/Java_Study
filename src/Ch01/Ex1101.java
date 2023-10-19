class vehicle{
	// 이름
	public String name = "차량";
	
	// 최대속도
	public double maxSpeed;
	
	// 정원
	public int seater;

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void setSeater(int seater) {
		this.seater = seater;
	}
	
	
	
	
}

class Motor extends vehicle{
	// 이름
	public String name = "자동차";
	// 최대속도
	public double maxSpeed = 200;
	// 배기량
	public int displacement;
	
	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}
	
	/*
	 this : 객체 자신을 의미하는 키워드
	 		=> 부모 클래스와 자식 클래스 간 동일한 필드명(또는 메소드명)을 사용할 경우,
	 			자식 클래스의 필드(또는 메소드)를 지정하고자 할 때 사용 
	 super : 상위 객체를 의미하는 키워드
	 		=> 부모 클래스와 자식 클래스 간 동일한 필드명(또는 메소드명)을 사용할 경우,
	 			부모 클래스의 필드(또는 메소드)를 지정하고자 할 때 사용
	 */
	public void printInfo() {
		System.out.println("이름 : " + this.name);
		System.out.println("최대속도 : " + super.maxSpeed);
		System.out.println("정원 : " + seater);
		System.out.println("배기량 : " + displacement);
	}
}

public class Ex1101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


/*
 	1. 상속 
 	- 자식이 부모가 가지고 있는 재산이나 권력을 물려받는다.
 	- 클래스 간에 관계 : 특정(자식) 클래스는 다른(부모) 클래스가 가지고 있는 모든 필드나 메소드를 사용할 수 있다.
 	- 수직관계 : 부모(슈퍼)-자식(서브) 클래스, extends, is to 관계
 	- 수평관계 : 형제 클래스, implements, has to 관계
 	
 	- 예를 통한 상속 정리
 	
 	운송 수단 => 슈퍼(super) 클래스, 부모 클래스
 	- 자동차 => 자식 클래스
 		- 자가용 => 서브 클래스, 자식 클래스
 			: 세단
 			: SUV
 		- 택시
 		- 트럭
 		
 	ex) class 자가용 extends 자동차{
 	}
 	
 		class 택시 extends 자동차{
 	}
 	
 		class 세단 extends 운송수단{
 	}
 	
 	- 비행기
 	ex) class 비행기 implements 운송수단{
 	}
 	- 자전거
 	
 	- 상속에 대한 내용 정리
 	1. 자동차(자식) 클래스는 운송 수단(부모) 클래스로부터 파생된 객체로서 운송 수단(부모) 클래스가 가지고 있는
 		모든 속성(필드, 메소드)들을 송상속받아 사용할 수 있다.
 	2. 택시(자식) 클래스는 자동차(부모) 클래스로부터 파생된 객체로서 자동차(부모) 클래스가 가지고 있는 모든 속성들을
 		상속받아 사용할 수 있다.
 		
 	- 형식
 	
 		class 서브클래스명 extends 슈퍼 클래스명{
 		}
 		
 		class 자식 클래스명 extends 부모 클래스명{
 		}
 	
 */
	
		Motor myCar = new Motor();
				
		/*
		myCar.maxSpeed = 160;
		
		myCar.seater = 5;
		
		myCar.displacement = 2000;
		*/
		
		myCar.setMaxSpeed(160);
		myCar.setSeater(5);
		myCar.setDisplacement(2000);
		
		/*
		System.out.println("이름 : " + myCar.name);
		System.out.println("최대속도 : " + myCar.maxSpeed);
		System.out.println("정원 : " + myCar.seater);
		System.out.println("배기량 : " + myCar.displacement);
		*/
		
		myCar.printInfo();
	}
}
	
	
