package Ch02;/*��ӱ���
 
  ���� Ŭ���� : Vehicle Ŭ����
  
  class  Vehicle{
     // �ʵ�
      * �ʵ�1 : name �̸�
      * �ʵ�2 : maxspeed �ִ�ӵ�
      * �ʵ�3 : seater ����
     // ������
      * ����Ʈ ������
      * �Ϲ� ������(�ִ�ӵ�)
      * �Ϲ� ������(�ִ�ӵ�, ����)
     // �޼ҵ�
      * printInfo()
  }
  
  
  ���� Ŭ���� : Motor Ŭ����
      // �ʵ�
       * �ʵ�1 : name �̸�
       * �ʵ�2 : displacement ��ⷮ
      // ������
       * ����Ʈ ������
      * �Ϲ� ������(�ִ�ӵ�)
      * �Ϲ� ������(�ִ�ӵ�, ����)
      // �޼ҵ�
       * printTotal()
  
 */

class Vehicle{
	public String name ="����";  // �̸�
	public double maxSpeed;     // �ִ�ӵ�
	public int seater;          // ����
	
	public void printInfo() {
		System.out.print("name: " + name);
		System.out.print(" , �ִ�ӵ�: " + maxSpeed);
		System.out.println(" , ����: " + seater);
	}
}

class Motor extends Vehicle{
	public String name ="�ڵ���";  // �̸�
	public int displacement;      // ��ⷮ
	
	public void printTotal() {
		//System.out.print("name: " + name);
		System.out.print("name: " + this.name);
		System.out.print(" , �ִ�ӵ�: " + maxSpeed);
		System.out.print(" , ����: " + seater);		
		System.out.println(" , ��ⷮ: " + displacement);
	}
}


public class E0502 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motor myCar = new Motor();
		myCar.maxSpeed = 160;
		myCar.seater = 5;
		myCar.displacement = 1500;
		myCar.printInfo();
		System.out.println("--------------------------");
		myCar.printTotal();
	}

}
