package Ch01;

public class Ex512 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 		// 주사위를 굴려서 나올 수 있는 1,2,3,4,5,6 중 하나의 수를 뽑아서 출력하는 프로그램
 		 
 		 0.0 <= Math.random()  < 1.0
 		 
 		 1~10까지 정수 중 하나의 정수를 얻을 때
 		 
 		 0.0 *10 <= Math.random() < 1.0 *10
 		  (0.0)						 (10.0)
 		  
 		 (int) 0.0 <= Math.random() < 	(int) 10.0
 		 	 (0)						  (10)
 		 	 
 		 이 상태에서 각 변에 1을 더하면
 		 
 		  0+1 <= Math.random() < 10+1
 		  (1)						(11)
 		  
 		  start 부터 시작하는 n개의 정수 중에서 임의 정수 하나를 얻기 위한 연산식
 		  
 		   int num = (int) (Math.random()*n) + start; 
 		   
 		   예를 들어 주사위 번호를 하나를 뽑기 위해 사용하는 연산식
 		   
 		   int num = (int)(Math.random() *6) + 1;
 		   
 		   또 다른 예로 로또 번호 하나를 뽑기 위해 사용되는 연산식
 		   
 		   int num = (int) (Math.random() * 45) + 1;
 */
		
		int num = (int)(Math.random()*6) + 1;
		
		if(num == 1) {
			System.out.println("1이 나왔습니다.");
		}
		else if(num == 2) {
			System.out.println("2이 나왔습니다.");
		}
		else if(num == 3) {
			System.out.println("3이 나왔습니다.");
		}
		else if(num == 4) {
			System.out.println("4이 나왔습니다.");
		}
		else if(num == 5) {
			System.out.println("5이 나왔습니다.");
		}
		else {
			System.out.println("6이 나왔습니다.");
		}
	}

}
