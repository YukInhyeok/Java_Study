/*
�޼ҵ� ������(@Override)

1. ���� : ��ӵ� �޼ҵ��� ������ �ڽ� Ŭ������ ���� ���� ���, �ڽ� Ŭ�������� ������ �޼ҵ带 �������ϴ� ��
2. ���� : �޼ҵ尡 �������̵��Ǿ��ٸ� �θ� ��ü�� �޼ҵ�� �������� ������, �ڽ� ��ü���� �޼ҵ带 ȣ���ϸ� �������̵��� �ڽ� �޼ҵ尡 ȣ��ȴ�.
3. �޼ҵ带 �������̵� �� �� ������ ���� ��Ģ�� �����ؼ� �ۼ��ؾ� �Ѵ�.
* �θ��� �޼ҵ�� ������ �ñ׳�ó(���� Ÿ��, �޼ҵ� �̸�, �Ű����� ����Ʈ)�� ������ �Ѵ�.
* ���� ������ �� ���ϰ� �������̵��� �� ����.
  => ���� ������ �� ���ϰ� ����������� �� ���ٴ� ���� �θ� �޼ҵ尡 public ���� ������ ������ ���� ���
     �������̵��ϴ� �ڽ� �޼ҵ�� default�� private ���� �������� ������ �� ����. 
* ���ο� ����(Exception)�� throws�� �� ����.
   
 */

class Calculator{
	double areaCircle(double r) {
		System.out.println("*Calculator ��ü�� areaCircle() ����*");
		return 3.141519*r*r;
	}
}

class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("*Calculator ��ü�� areaCircle() ����*");
		return Math.PI*r*r;
	}
}


public class E0505 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("������ : " + calculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("������ : " + computer.areaCircle(r)); // �����ǵ� �޼ҵ� ȣ��
	}

}
