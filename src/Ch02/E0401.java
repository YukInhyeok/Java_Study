package Ch02;


/*
  1. this 레퍼런스
  - 특징 : 1. 인스턴스 메소드 내부에 선언하지 않고 지역 변수처럼 사용
  		  2. 자기 자신만을 가리키는 레퍼런스
  		  	ex) this.width = width; <= 명시적 방법 
  		  3. 메소드 내부의 모든 인스턴 필드와 메소드 앞에 암시적으로 사용
  		    ex) width = wid; <= 암시적 방법
  		  4. 필요에 따라서 명시적으로 사용할 수 있다.
  -비교 1 : 매개변수가 없는 경우
  ==========================================================
  this가 암시적으로 사용된 예
  ==========================================================
  int getSpeed(){
  	return speed;
  }
  
  ==========================================================
  this가 명시적으로 사용된 예
  ==========================================================
    int getSpeed(){
  	return this.speed;
  }
  
  
  -비교 2 : 매개변수가 있는 경우
  ==========================================================
  this가 암시적으로 사용된 예
  ==========================================================
   int setSpeed(int sp){
  	return speed = sp;
  }
  
  ==========================================================
  this가 명시적으로 사용된 예
  ==========================================================
    int setSpeed(int speed){
  	return this.speed = speed;
  } 
 */

class Car3{
	private int speed;
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}

public class E0401 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car3 car03 = new Car3();
		
		System.out.println("현재 속도 : " + car03.getSpeed());
		
		car03.setSpeed(10); 
		
		System.out.println("현재 속도 : " + car03.getSpeed());
		
	}

}
