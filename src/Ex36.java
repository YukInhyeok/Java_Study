// hasNext(), useDelimiter() 메소드 사용 예

import java.util.*;

public class Ex36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "생각하는 자바, 재미있는 자바, 즐거운 자바, 신나는 자바";
		Scanner input = new Scanner(s);
		// 분리자를 지정
		input.useDelimiter("자바, ");
		
		while(input.hasNext()) {
			System.out.println(input.next());
		}
		
		String s1 = "1    fish    2    fish    red    fish    blue    fish";
		Scanner input2 = new Scanner(s1).useDelimiter("\\s*fish\\s*");
		
		System.out.println(input2.next());
		System.out.println(input2.next());
		System.out.println(input2.next());
		System.out.println(input2.next());
		
		
		String s2 = "1    fish    2    fish    red    fish    blue    fish";
		Scanner input3 = new Scanner(s2).useDelimiter("\\s*fish\\s*");
		
		System.out.println();
		while(input3.hasNext()) {
			System.out.println(input3.next());
		}
	}

}
