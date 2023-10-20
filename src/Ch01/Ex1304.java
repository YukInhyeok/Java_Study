package Ch01;/*
 	원을 그린다고 할 때 원의 색깔, 원을 그릴건지 안그릴건지 결정
 */

// 인터페이스로 다중 상속 구현 예

interface Color{
	public static final int Red = 1;
	int Green = 2;
	int Blue = 3;
	
	public abstract void setColor(int c);
	
	int getColor();
	
}

interface Drawable{
	void draw();
}

class Circle2 implements Color, Drawable{
	int color = 0;
	
	public int getColor() {
		return color;
	}
	
	public void setColor(int color) {
		this.color = color;
	}
	
	public void draw() {
		System.out.println("원을 그리다.");
	}
	
	
}


public class Ex1304 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle2 cir = new Circle2();
		
		cir.setColor(Color.Red);
		
		switch(cir.getColor()) {
		case Color.Red:
			System.out.println("빨간색");
			break;
		case Color.Green:
			System.out.println("초록색");
			break;
		case Color.Blue:
			System.out.println("파란색");
			break;
		}
		
		cir.draw();
		
		
	}

}
