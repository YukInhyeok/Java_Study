package Ch02;// �޼��� �����ε� - 3
// Ŭ������ �ʵ尡 �����ϰ� �޼ҵ� �����ε��� ������ ���α׷�
// ���簢�� ����, ���簢�� ����

class Calc{
	// �ʵ�
	double width;
	double height;
	
	// �޼ҵ� �����ε�
	double areaRectangle(double width) {
		return width*width;
	}
	
	int areaRectangle(int height) {
		return height*height;
	}
	
	double areaRectangle(double width, double height) {
		return width * height;
	}
	
	int areaRectangle(int width, int height){
		return width*height;
	}
	
}


public class E0306 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc myC1 = new Calc();
		
		int result1 = myC1.areaRectangle(5);
		System.out.println(result1);
		
		double result2 = myC1.areaRectangle(10.1);
		System.out.println(result2);
		
		int result3 = myC1.areaRectangle(5, 2);
		System.out.println(result3);
		
		double result4 = myC1.areaRectangle(5.1, 10.1);
		System.out.println(result4);
	}

}
