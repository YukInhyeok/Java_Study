package Ch01;

import java.util.Random;

public class Ex605 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  for(초기문; 조건식; 반복 후 작업){	// 행, 줄
		 	 	명령문;
		 	 	for(초기문; 조건식; 반복 후 작업){	//열, 칸
		 	 	 	명령문;
		 	 	 }
		 	 	 
		 	 	 System.out.println();
		 	 	 
		 	 	 명령문;
		 	 	 }
		 */
		/*
		int x = 1;
		for(int i = 1; i<=5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print("\t" + x);
				x++;
			}
			System.out.println();
		}
		*/
		
		// Random 클래스를 이용한 행열 숫자 나타내기
		
		Random rnd = new Random();
		
		for(int i = 1; i<=5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print("\t" + rnd.nextInt(100)+1);
				}
			System.out.println();
		}
	}

}
