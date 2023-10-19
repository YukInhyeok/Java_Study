// 메소드 오버로딩 예 -3

class Calculator{
	//정사각형 넓이
	
	double areaRectangle(double width) {
		return width*width;
	}
	
	//직사각형 넓이
	double areaRectangle(double width, double height) {
		return width*height;
	}
}
public class Ex905 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator myCalcu = new Calculator();
		
		//정사각형 넓이 구하기
		
		double result1 = myCalcu.areaRectangle(10);
		
		System.out.println("정사각형 넓이 : " + result1);
		
		//직사각형 넓이 구하기
		
				double result2 = myCalcu.areaRectangle(10,20);
				
				System.out.println("직사각형 넓이 : " + result2);
	}

}
