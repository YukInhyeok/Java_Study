package Ch02;/*
 1. this�� super
 
 this : ��ü �ڽ��� �ǹ��ϴ� Ű����
 super : ���� ��ü�� �ǹ��ϴ� Ű����
 
 */

class Vehicle2{
	public String name ="����";  // �̸�
	public double maxSpeed;     // �ִ�ӵ�
	public int seater;          // ����
	
	public void printInfo() {
		System.out.print("name: " + this.name);
		System.out.print(" , �ִ�ӵ�: " + this.maxSpeed);
		System.out.println(" , ����: " + this.seater);
	}
}

class Motor2 extends Vehicle2{
	public String name ="�ڵ���";  // �̸�
	public int displacement;      // ��ⷮ
	
	
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
