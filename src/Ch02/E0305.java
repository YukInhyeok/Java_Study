// 메소드 오버로딩 - 2
// add() 메소드 선언

class Calculate{
	public int add(int a, int b) {
		return a+b;
	}
	
	public double add(double a, double b) {
		return a+b;
	}
}

public class E0305 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculate c = new Calculate();
		
		int hap1;
		double hap2;
		
		hap1 = c.add(10, 5);
		System.out.println(hap1);
		
		hap2 = c.add(10.1, 5.1);
		System.out.println(hap2);
	}

}
