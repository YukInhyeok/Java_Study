package Ch01;// 문제 : 자동차를 표현 클래스 Car5 로 최고 속도, 브랜드 이름, 현재 속도의 필드와 생성자 및 메소드를 갖는
//		 클래스를 만들어서 클래스 정보값을 출력하는 간단한 예를 작성하시오.

class Car5{
	private int maxSpeed; // 최고 속도
	public String brandName; // 브랜드 이름
	public int speed; // 현재속도
	
	public Car5(){		
	}
	
	public Car5(String brandName){
		this.brandName = brandName;
	}
	
	public Car5(int speed){
		this.maxSpeed = speed;
	}
	
	public Car5(String brandName, int speed){
		this.brandName = brandName;
		this.maxSpeed = speed;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// 속도 관련 메소드
	public int speedUp() {
		return this.speed += 30;
	}
	
	public int speedDown() {
		return this.speed -= 30;
	}
	
}

public class Ex1005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car5 mycar = new Car5("부가티", 300);
		mycar.speedUp();
		mycar.speedUp();
		System.out.println("차종 : " + mycar.brandName);
		System.out.println("최고 속도 : " + mycar.getMaxSpeed());
		System.out.println("현재 속도 : " + mycar.getSpeed());
		System.out.println("현재 속도 : " + mycar.speedDown());
		System.out.println("현재 속도 : " + mycar.getSpeed());
		
		
	}

}
