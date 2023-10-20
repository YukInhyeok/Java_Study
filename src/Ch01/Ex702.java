package Ch01;

public class Ex702 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* 배열 초기화
  	: 배열 선언을 하면서 대입연산자를 이용하며 중괄호 사이에 여러 원소 값을 쉼표로 구분하여 기술하는 방법
  	
  	double[] score = {76.3, 88.9, 98.2};
  	
  	System.out.println(score.length);  // 결과값은 3
  	
  	String subj[] = {"국어", "영어", "수학"}; // 결과값은 3
  	
  	int[] data = {3,4,6}, values={12, 81, 65};  	
 */	
	// 배열 초기화 활용
		
	double[] score = {2.78, 4.28, 3.18};
	String[] subj = {"국어", "영어", "수학"};
		
	System.out.println("score[0] : " + score[0]);
	System.out.println("score[1] : " + score[1]);
	System.out.println("score[2] : " + score[2]);
	
	System.out.println();
	
	System.out.println("subj[0] : " + subj[0]);
	System.out.println("subj[1] : " + subj[1]);
	System.out.println("subj[2] : " + subj[2]);
	
		
	}

}
