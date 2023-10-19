/*
메소드 재정의(@Override)

1. 정의 : 상속된 메소드의 내용이 자식 클래스에 맞지 않을 경우, 자식 클래스에서 동일한 메소드를 재정의하는 것
2. 동작 : 메소드가 오버라이딩되었다면 부모 객체의 메소드는 숨겨지기 때문에, 자식 객체에서 메소드를 호출하면 오버라이딩된 자식 메소드가 호출된다.
3. 메소드를 오버라이딩 할 때 다음과 같은 규칙에 주의해서 작성해야 한다.
* 부모의 메소드와 동일한 시그너처(리턴 타입, 메소드 이름, 매개변수 리스트)를 가져야 한다.
* 접근 제한을 더 강하게 오버라이딩할 수 없다.
  => 접근 제한을 더 강하게 오버라디이할 수 없다는 것은 부모 메소드가 public 접근 제한을 가지고 있을 경우
     오버라이딩하는 자식 메소드는 default나 private 접근 제한으로 수정할 수 없다. 
* 새로운 예외(Exception)를 throws할 수 없다.
   
 */

class Calculator{
	double areaCircle(double r) {
		System.out.println("*Calculator 객체의 areaCircle() 실행*");
		return 3.141519*r*r;
	}
}

class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("*Calculator 객체의 areaCircle() 실행*");
		return Math.PI*r*r;
	}
}


public class E0505 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("원면적 : " + calculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("원면적 : " + computer.areaCircle(r)); // 재정의된 메소드 호출
	}

}
