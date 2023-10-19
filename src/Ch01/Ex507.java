import java.util.Scanner;

public class Ex507 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if~else문을 이영한 성적 판별 프로그램
		Scanner input = new Scanner(System.in);
		
		int score;
		
		System.out.print("성적을 입력하세요. >> ");
		
		score = input.nextInt();
		
		// int score = 93;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		}
		else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B 입니다.");
		}
	}

}
