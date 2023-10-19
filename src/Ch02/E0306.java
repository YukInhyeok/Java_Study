package Ch02;// 메서드 오버로딩 - 3
// 클래스내 필드가 존재하고 메소드 오버로딩이 가능한 프로그램
// 정사각형 넓이, 직사각형 넓이

class Calc{
	// 필드
	double width;
	double height;
	
	// 메소드 오버로딩
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
