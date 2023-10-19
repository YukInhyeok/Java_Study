// 메소드 오버로딩 예 -2

class Test2{
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static double add(double a, double b) {
		return a+b;
	}
}

public class Ex904 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test2 T = new Test2();
		
		int c;
		double d;
		
		c = T.add(10, 5);
		System.out.println("결과값(정수) : " + c);
		
		d = T.add(10.2, 5.3);
		System.out.println("결과값(정수) : " + d);
		
	}

}
