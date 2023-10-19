
class Car{
	// 필드
	String company = "현대자동차";	// myCar.company
	String model = "G80";	//myCar.model
	String color = "검정";	//myCar.color
	int maxSpeed = 350;		//myCar.maxSpeed
	int speed; // 0		// myCar.speed
	
	
	Car(){
		// 디폴트 생성자
	
	}
	
	// 메소드
	
	int speedUp() {
		return speed += 5;
	}
	
	int speedDown() {
		return speed -= 5;
	}
	
}

public class Ex902 {
	/*
	// 필드
		String company = "현대자동차";
		String model = "G80";
		String color = "검정";
		int maxSpeed = 350;
		int speed; // 0
		*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
  1. 클래스 구성 멤버
  - 클래스 형식
  	접근지정자(privacy, protected, public, default) class 클래스_이름{
  		// 필드
  		 * 객체의 데이터가 저장되는 곳
  		 * 선언방법 : 타입 필드명; 또는 타입 필드명 = 초기값;
  		 * ex) int maxSpeed; or int maxSpeed = 350;
  		 
  		// 생성자
  		 * 객체 생성 시 초기화 역할 담당
  		 * 생성자 방법 : 반환타입 X, 매개변수 있음
  		 * 디폴트 생성자, 생성자
  		 * 디폴트 생서자 : 클래스_이름(){	}
  		 * 생성자 : 클래스_이름(int speed){
  		  			maxSpeed = speed;
  		  }
  		   		 
  		// 메소드
  		 * 객체의 동작에 해당하는 실행 블록  	
  	}
 */
		//객체 생성
		Car myCar = new Car();
		//Ex902 myCar = new Ex902();
		
		// 필드값 읽기
		System.out.println("제조회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색깔 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed);
		
		// 필드값 변경
		myCar.speed = 60;
		System.out.println("현재속도 : " + myCar.speed);
		
		// 메소드 사용
		System.out.println("현재속도(감소) : " + myCar.speedDown());
		System.out.println("현재속도(감소) : " + myCar.speedDown());
		System.out.println("현재속도(증가) : " + myCar.speedUp());
		System.out.println("현재속도(증가) : " + myCar.speedUp());
		System.out.println("현재속도(증가) : " + myCar.speedUp());
		
		
	}

}
