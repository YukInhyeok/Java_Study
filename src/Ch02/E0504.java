/*
 1. ���� ������ ȣ�� : ������ ���� ù�ٿ��� super() �Ǵ� super(....)
 */

class Vehicle3{
	public String name ="����";  // �̸�
	public double maxSpeed;     // �ִ�ӵ�
	public int seater;          // ����
	
	public Vehicle3() {
		// ����Ʈ ������
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
		System.out.print(" , �ִ�ӵ�: " + this.maxSpeed);
		System.out.println(" , ����: " + this.seater);
	}
}

class Motor3 extends Vehicle3{
	public String name ="�ڵ���";  // �̸�
	public int displacement;      // ��ⷮ
	
	
	public Motor3() {
		// ����Ʈ ������
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
		System.out.print("Motor Ŭ������ name: " + this.name);
		System.out.print(" , Vehicle Ŭ������ name: " + super.name);
		System.out.print(" , �ִ�ӵ�: " + super.maxSpeed);
		System.out.print(" , ����: " + super.seater);		
		System.out.println(" , ��ⷮ: " + this.displacement);
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
		
		System.out.println("��ⷮ : " + myCar2.displacement);
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
		
		System.out.println("�ִ�ӵ� : " + myCar3.maxSpeed);
		System.out.println("��ⷮ : " + myCar3.displacement);
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
		
		System.out.println("�ִ�ӵ� : " + myCar4.maxSpeed);
		System.out.println("���� : " + myCar4.seater);
		System.out.println("��ⷮ : " + myCar4.displacement);
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
