
public class Ex703 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 	배열 선언 이후의 초기화와 다른 배열의 대입
 	
 	* 배열 선언 이후 배열 이름으로 초기 값을 저장하면 오류가 발생
 	 
 	ex) int score[];
 		score = {2, 4, 7}; // 오류발생
 		
 		=> int score[]; 	//정상적으로 동작
 		   score = new int[] {2, 4, 7};
 		   
 		   System.out.println(score[0] + " " + score[1] + " " + score[2]);
 		   
 		   score = new int[] { 23, 46, 78};
 		   
 		   System.out.println(score[0] + " " + score[1] + " " + score[2]);
 */
		
		int score[];
		score = new int[] {2, 4, 7};
		// score = {2, 4, 7}; => 오류발생
		
		System.out.println(score[0] + " " + score[1] + " " + score[2]);
		
		score = new int[] {23, 46, 78};
		
		System.out.println(score[0] + " " + score[1] + " " + score[2]);
	}

}
