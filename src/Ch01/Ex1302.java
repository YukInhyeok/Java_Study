package Ch01;/*
  Shape(추상클래스) - Circle
  					protected int radius; // 반지름 필드
  					Circle(int radius){
  						this.radius = radius
  					}
  					public void calcArea(){
  						System.out.println("넓이 : " + radius * radius*MATH.PI);
  					}
  				 - Rectangel
  				 - Triangle
 */

abstract class Shape{
	// 면적을 저장할 도형의 공통도니 필드
	
	protected double area;

	// 면적 값을 알려주는 메소드
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	// 도형의 면적을 구하기 위한 추상 메소드
	
	abstract public void calcArea();
	
}


class Circle extends Shape{
	protected int radius;
	
	public Circle() {
		
	}
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public void calcArea() {
		area = radius * radius * Math.PI;
	}
}

class Rectangle extends Shape{
	protected int width;
	protected int height;
	
	public Rectangle() {
		
	}
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void calcArea() {	// 오버라이딩
		area = width * height;
	}
}

class Triangle extends Shape{
	protected int width;
	protected int height;
	
	public Triangle() {
		
	}
	
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void calcArea() {	// 오버라이딩
		area = width * height / 2;
	}
}

public class Ex1302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 추상 클래스 하위에 있는 하위 클래스를 객체로 만들경우 객체 배열을 보통 사용한다.
		
		Shape[] sha = new Shape[3];
		
		sha[0] = new Circle(5);
		sha[1] = new Rectangle(5, 8);
		sha[2] = new Triangle(10, 15);
		
		for(int i = 0; i < sha.length; i++) {
			sha[i].calcArea();
			System.out.println("도형의 넓이 : " + sha[i].getArea());
		}
	}

}
