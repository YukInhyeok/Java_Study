package Ch01;

public class Ex405 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 삼항 연산자
 
 	조건식	?		값 또는 연산식		:	값 또는 연산식
 	(피연산자1)		(피연산자2)			(피연산자3)
 	
 */
		
		int score = 85;
		char grade88 = (score > 90) ? 'A' : ((score > 80)? 'B' : 'C');
		
		System.out.println(score + "점은 " + grade88 + "등급입니다.");
		
	}

}
