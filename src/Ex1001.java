// 1단계 class 생성
class Car2{
	private int speed;
/*	
	public int getSpeed() {
		return this.speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
*/
	// 메뉴(source) 클릭 - getter/setter 메뉴 클릭
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	public void speedUp(int speed) {
		this.speed = this.speed + speed;
	}
	
	public void speedDown(int speed) {
		this.speed = this.speed - speed;
	}
	
	// speedUp() 오버로딩
	
	public void speedUp() {
		speedUp(5);
	}
	
	
	// speedDown() 오버로딩
	
	public void speedDown() {
		speedDown(5);		
	}
	
}


public class Ex1001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 1. Setter, getter
  	* 변수 선언
  	1. 변수를 선언하고, 선언된 변수에 값을 입력하는 방법 => setter/getter 
  		ex) int i;
  			i=1;
  	2. 변수를 선언하는 동시에 값을 입력하는 방법 => 생성자
  		ex) int i=1; <= 변수 초기화
  		
  	* setter 특징
  	  - 반환타입이 존재하지 않는다. => void 사용
  	  - 매개변수 존재한다.
  	  - ex) 
  	  ============================
  	  매개변수의 이름이 필드와 같은 경우         
  	  ============================
  	  	void setSpeed(int speed){
  	  		this.speed = speed;
  	  	 }
  	  
  	  ============================
  	  매개변수의 이름이 필드와 다른 경우         
  	  ============================
  	    void setSpeed(int sp){
  	    	this.speed = sp;
  	    }	
  	    	
  	* getter 특징
  	  - 반환타입이 필요하다.
  	  - 매개변수가 존재하지 않는다.
  	  - return 사용
  	  - ex)
  	 
  	  ============================
  	  this가 암시적으로 사용된 예         
  	  ============================
  	  int getSpeed(){
  	  	return speed;
  	  }
  	  
  	  
  	  ============================
  	  this가 명시적으로 사용된 예         
  	  ============================
  	  int getSpeed(){
  	  	return this.speed;
  	  }	 	 	
 */
		
		// 2 단계 : 객체 생성
		
		Car2 car3 = new Car2();
		
		// 3 단계 : 객체 사용
		
		car3.setSpeed(10);
		
		System.out.println("Speed 필드 값 : " + car3.getSpeed());
		
		
		car3.speedDown();
		System.out.println("Speed 필드 값 : " + car3.getSpeed());
		
		//car3.setSpeed(5);
		car3.speedUp();
		System.out.println("Speed 필드 값 : " + car3.getSpeed());
		
	}

}
