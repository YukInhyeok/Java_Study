package Ch02;

class Car2{
	// �ʵ�
	// public int speed;
	private int speed;
	
	// ����Ʈ ������
	Car2(){
		
	}
	// �Ϲ� ������
	Car2(int s){
		speed = s;
	}
	
	// Setter/Getter �޼ҵ�
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	// �޼ҵ�
	
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
		
		c.speedUp();  // �Ǽ�����Ʈ ����� ��
		
		System.out.println(c.getSpeed());
		
		c.speedDown();  // �극��ũ�� ����� ��
		
		System.out.println(c.getSpeed());
		
		System.out.println("=============================");
		
		c.speedUp();  // �Ǽ�����Ʈ ����� ��
		
		c.speedUpPrint();
		
		c.speedDown();  // �극��ũ�� ����� ��
		
		c.speedDownPrint();
		
		
		System.out.println("=============================");
		
		c.speedPrint();
		
		
	}

}
