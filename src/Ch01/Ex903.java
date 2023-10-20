package Ch01;

//메소드 오버로딩 예 -1
public class Ex903 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
  1. 메소드 오버로딩
  정의 : 이미 존재하는 메소드와 이름이 같더라도 매개변수 개수나 타입을 다르게 하여 중복하여 정의할 수 있다.
  조건 : 1. 메소드의 이름은 같되 매개변수의 개수나 타입은 달라야 한다.
  		2. 메소드의 이름, 매개변수의 개수와 타입이 동일하고 리턴 타입만 달라서는 메소드 오버로딩이 성립되지 않는다.
  		
  			ex) int max(int a, int b){
  			
  			}
  			int max(int a, int b, int c){
  			
  			}
  			double max(double a, double b){
  			}
 */
		
		// 초대값 구하기
		int a = 10, b = 5, c, g;
		double d = 10.2, e = 5.1, f, h;
		
		c = Math.max(a, b);
		System.out.println(c);
		f = Math.max(d, e);
		System.out.println(f);
		
		g = Math.min(a, b);
		System.out.println(g);
		h = Math.min(d, e);
		System.out.println(h);
	}

}
