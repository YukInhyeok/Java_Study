package Ch02;

class Car2{
	// 필드
	// public int speed;
	private int speed;
	
	// 디폴트 생성자
	Car2(){
		
	}
	// 일반 생성자
	Car2(int s){
		speed = s;
	}
	
	// Setter/Getter 메소드
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	// 메소드
	
	int speedUp() {
		return speed += 5;
	}

	int speedDown() {
		return speed -= 5;
	}
	
	void speedUpPrint() {
		System.out.println(this.speed);
	}
	
	void speedDownPrint() {
		System.out.println(this.speed);
	}
	
	
	void speedPrint() {
		System.out.println(this.speed);
	}
	
}

public class E0204 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Car2 c = new Car2();
		Car2 c = new Car2(5);
		
//		c.speed = 10;
		
//		System.out.println(c.speed);
		
			
		System.out.println(c.getSpeed());
		
		c.setSpeed(20);
		
		System.out.println(c.getSpeed());
		
		c.speedUp();  // 악셀레이트 밟았을 때
		
		System.out.println(c.getSpeed());
		
		c.speedDown();  // 브레이크를 밟았을 때
		
		System.out.println(c.getSpeed());
		
		System.out.println("=============================");
		
		c.speedUp();  // 악셀레이트 밟았을 때
		
		c.speedUpPrint();
		
		c.speedDown();  // 브레이크를 밟았을 때
		
		c.speedDownPrint();
		
		
		System.out.println("=============================");
		
		c.speedPrint();
		
		
	}

}
