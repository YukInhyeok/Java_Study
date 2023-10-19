/*
 1. 상위 생성자 호출 : 생성자 구현 첫줄에서 super() 또는 super(....)
 */

class Vehicle3{
	public String name ="차량";  // 이름
	public double maxSpeed;     // 최대속도
	public int seater;          // 정원
	
	public Vehicle3() {
		// 디폴트 생성자
	}
	
	public Vehicle3(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public Vehicle3(double maxSpeed, int seater) {
		this.maxSpeed = maxSpeed;
		this.seater = seater;
	}
	
	
	public void printInfo() {
		System.out.print("name: " + this.name);
		System.out.print(" , 최대속도: " + this.maxSpeed);
		System.out.println(" , 정원: " + this.seater);
	}
}

class Motor3 extends Vehicle3{
	public String name ="자동차";  // 이름
	public int displacement;      // 배기량
	
	
	public Motor3() {
		// 디폴트 생성자
		super();
	}
	
		
	public Motor3(int displacement) {
		this.displacement = displacement;
	}
	
	
	public Motor3(double maxSpeed, int displacement) {
		//maxSpeed = maxSpeed;
		//super.maxSpeed = maxSpeed;
		super(maxSpeed);
		this.displacement  = displacement;
		//super(maxSpeed);
	}
	
	public Motor3(double maxSpeed, int seater, int displacement) {
		super(maxSpeed, seater);
		this.displacement  = displacement;
		//super(maxSpeed, seater);
		
	}
	
	
	
	public void setMaxSpeed(double maxSpeed) {
		super.maxSpeed = maxSpeed;
	}

	public void setSeater(int seater) {
		super.seater = seater;
	}
	
	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}


	public void printTotal() {
		//System.out.print("name: " + name);
		System.out.print("Motor 클래스내 name: " + this.name);
		System.out.print(" , Vehicle 클래스내 name: " + super.name);
		System.out.print(" , 최대속도: " + super.maxSpeed);
		System.out.print(" , 정원: " + super.seater);		
		System.out.println(" , 배기량: " + this.displacement);
	}
}

public class E0504 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motor3 myCar = new Motor3();
		myCar.setMaxSpeed(300);
		myCar.setSeater(5);
		myCar.setDisplacement(3500);;
		myCar.printInfo();
		System.out.println("----------------------------------------------------");
		myCar.printTotal();
		
		System.out.println("");
		System.out.println("====================================================");
		System.out.println("");
		
		Motor3 myCar2 = new Motor3(5000);
		
		System.out.println("배기량 : " + myCar2.displacement);
		myCar2.setMaxSpeed(300);
		myCar2.setSeater(5);
		//myCar2.setDisplacement(3500);;
		myCar2.printInfo();
		System.out.println("----------------------------------------------------");
		myCar2.printTotal();
		
		System.out.println("");
		System.out.println("====================================================");
		System.out.println("");
		
		Motor3 myCar3 = new Motor3(500, 10000);
		
		System.out.println("최대속도 : " + myCar3.maxSpeed);
		System.out.println("배기량 : " + myCar3.displacement);
		//myCar3.setMaxSpeed(300);
		myCar3.setSeater(5);
		//myCar3.setDisplacement(3500);;
		myCar3.printInfo();
		System.out.println("----------------------------------------------------");
		myCar3.printTotal();
		
		System.out.println("");
		System.out.println("====================================================");
		System.out.println("");
		
		Motor3 myCar4 = new Motor3(500, 6, 15000);
		
		System.out.println("최대속도 : " + myCar4.maxSpeed);
		System.out.println("정원 : " + myCar4.seater);
		System.out.println("배기량 : " + myCar4.displacement);
		//myCar4.setMaxSpeed(300);
		//myCar4.setSeater(5);
		//myCar3.setDisplacement(3500);;
		myCar4.printInfo();
		System.out.println("----------------------------------------------------");
		myCar4.printTotal();
		
		System.out.println("");
		System.out.println("====================================================");
		System.out.println("");
		
		
		
	}

}
