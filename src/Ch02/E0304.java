package Ch02;

// 메소드 오버로딩 - 1
// 최대값 구하기

public class E0304 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=10, b=5, c, g;
		double d=10.2, e=5.1, f, h;
		
		c = Math.max(a, b);
		System.out.println(c);
		
		f = Math.max(d, e);
		System.out.println(f);
		
		g = Math.min(a, b);
		System.out.println(g);
		
		h=Math.min(d, e);
		System.out.println(h);
	}

}
