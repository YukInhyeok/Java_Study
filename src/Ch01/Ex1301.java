

public class Ex1301 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 		1. 추상 클래스
 		- 정의 : 개념적으로 클래스 간의 계층구조에서 상위에 존재하여 하위 클래스를 대표하는 클래스 인스턴스를 생성할수 없는
 				미완성 클래스
 		- 추상 클래스 지정
 			: 클래스 정의 시 키워드 class 앞에 abstract 키워드 기술하여 추상 클래스를 구현한다.
 			
 			: 형식
 			=> 일반 클래스
 			
 			class 클래스이름{
 			
 			}
 			
 			=> 추상 클래스
 			
 			abstract class 추상클래스이름{
 				// 필드 선언
 				// 일반 메소드 정의
 				// 생성자 정의
 				// 추상 메소드 정의
 				  
 				 => 메소드
 				 
 				 접근 지정자 리턴타입 메소드이름(매개변수 리스트){
 				 		// 명령문
 				 }
 				 
 				 => 추상 메소드
 				 
 				 	abstract 접근지정자 리턴타입 추상메소드이름(매개변수 리스트);
 				 						 
 			}
 			
 			: ex)
 			
 			shape - Circle
 				  - Triangle
 				  - Rectangle
 				  
 			[public]  abstract class Shape{	// 추상 클래스
 			
 				// 필드 선언
 				  protected double x, y;
 				  
 				// 일반 메소드 정의
 				  public void draw(){	//일반 메소드
 				  	System.out.println("선을 그리세요!!");
 				  }
 				  
 				// 디폴트 생성자 정의
 				  public Shape(){
 				  
 				  }
 				
 				// 생성자
 				  public Shape(double x, double y){
 				  	this.x = x;
 				  	this.y = y; 				  
 				  }
 				 
 				// 추상 메소드
 				  
 				abstract public void calc();
 				
 			}
 			
 			**추상 클래스는 객체를 만들 수 없다. ** <= 주의사항
 			Shape s = new Shape(3.14, 5.28); // 객체화 오류
 											 // cannot instantiate the type Shape
 		
 		- 하위 클래스에서 상위 클래스(추상클래스) 내에 존재하는 추상메소드 구현
 		
 		public class Rectangle extends Shape{
 			double width;
 			double height;
 			
 			.......
 			
 			
 			public void calc(){
 				super.draw();
 				
 				System.out.println("넓이 : " + width * height);
 			}
 			
 			
 		}
 		
 		public class Triangle extends Shape{
 			double width;
 			double height;
 			
 			.......
 			
 			@Override
 			public void calc(){
 				super.draw();
 				
 				System.out.println("넓이 : " + (width * height) / 2);
 			}
 			
 		}
 			
 			
 			public class Circle extends Shape{
 			double radius;
 			
 			
 			.......
 			
 			
 			public void calc(){
 				super.draw();
 				
 				System.out.println("넓이 : " + radius * radius * MATH.PI);
 			}
 			
 		}
 		
 		- 추상 클래스의 특징
 			: 추상 클래스는 class 앞에 abstract 키워드 기술하여 구현한다.
 			: 추상 클래스내에 메소드도 abstract 키워드 사용하면 추상 메소드가 된다.
 			: 클래스내에 추상 메소드가 존재하면 클래스는 abstract 키워드를 사용해서 추상 클래스로 선언되어야 한다.
 			: 추상 클래스는 직접 홀로 객체화 될 수 없다. 즉 생성자를 사용하여 객체를 생성할 수 없다.
 			: 추상 클래스는 다른 클래스에 의하여 상속되어야 한다. 즉 항위 클래스가 없는 추상 클래스는 의미가 없다.
 			: 추상 클래스는 항위 클래스 있어야 하므로 추상 클래스는 구현시 클래스를 확장하여 사용한다.
 */
	}

}
