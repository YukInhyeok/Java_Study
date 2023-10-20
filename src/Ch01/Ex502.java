package Ch01;

public class Ex502 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 점수 확인 프로그램
		int score = 53;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		}
		
		if(score >= 80 && score < 90) {
			System.out.println("점수가 80보다 큽니다.");
			System.out.println("등급은 B 입니다.");
		}
		
		if(score >= 70 && score < 80) {
			System.out.println("점수가 70보다 큽니다.");
			System.out.println("등급은 C 입니다.");
		}
		
		if(score >= 60 && score < 70) {
			System.out.println("점수가 60보다 큽니다.");
			System.out.println("등급은 D 입니다.");
		}
		
		if(score < 60) {
			System.out.println("점수가 60보다 작습니다.");
			System.out.println("등급은 F 입니다.");
		}
		
	}

}
