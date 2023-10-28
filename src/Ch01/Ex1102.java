package Ch01;

class vehicle2{
	// 이름
	public String name ="차량";
	
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
	
	/*public vehicle2() {
		// vehicle2 디폴트 생성자
	}*/
	
	public vehicle2(double maxSpeed, int seater) {		
		this.maxSpeed = maxSpeed;
		this.seater = seater;
	}
 
}

class Motor2 extends vehicle2{
	//이름
	public String name="자동차";
	
	//배기량
	public int displacement;
	
	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}
	

	public void printInfo() {
		System.out.println("이름 : " + super.name);
		System.out.println("최대속도 : " + maxSpeed);
		System.out.println("정원 : " + seater);
		System.out.println("배기량 : " + this.displacement);
	}
	
	/*
	public Motor2() {
		// Motor2 디폴트 생성자
		super();
		/*public vehicle2() {
		// vehicle2 디폴트 생성자
		}*/
	//}
	
	public Motor2(double maxSpeed, int seater, int displacement) {
		/*
		this.maxSpeed = maxSpeed;
		this.seater = seater;
		*/
		super(maxSpeed, seater);		
		this.displacement = displacement;

	}
	
	
	
	
}


public class Ex1102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Motor2  myCar = new Motor2(160, 5, 2000);
		
		
		/* 직접 필드 값 지정
		myCar.maxSpeed = 160;
		
		myCar.seater = 5;
		
		myCar.displacement = 2000;
		*/
		
		/* setter 방식으로 값 지정
		myCar.setMaxSpeed(160);		 
		myCar.setSeater(5);
		myCar.setDisplacement(2000);
		*/
		
		/*
		System.out.println("이름 : " + myCar.name);
		System.out.println("최대속도 : " + myCar.maxSpeed);
		System.out.println("정원 : " + myCar.seater);
		System.out.println("배기량 : " + myCar.displacement);
		*/
		
		myCar.printInfo();
	}

}
