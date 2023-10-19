package Ch02;/*
 1. this와 super
 
 this : 객체 자신을 의미하는 키워드
 super : 상위 객체를 의미하는 키워드
 
 */

class Vehicle2{
	public String name ="차량";  // 이름
	public double maxSpeed;     // 최대속도
	public int seater;          // 정원
	
	public void printInfo() {
		System.out.print("name: " + this.name);
		System.out.print(" , 최대속도: " + this.maxSpeed);
		System.out.println(" , 정원: " + this.seater);
	}
}

class Motor2 extends Vehicle2{
	public String name ="자동차";  // 이름
	public int displacement;      // 배기량
	
	
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

public class E0503 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motor2 myCar = new Motor2();
		myCar.setMaxSpeed(300);
		myCar.setSeater(5);
		myCar.setDisplacement(3500);;
		myCar.printInfo();
		System.out.println("--------------------------");
		myCar.printTotal();
	}

}
