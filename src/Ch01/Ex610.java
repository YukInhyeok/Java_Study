package Ch01;

import java.util.*;
public class Ex610 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// 키보드로 while 문 제어 프로그램
		
		boolean run = true;
		
		int speed = 0;
		int keyCode = 0;
		
		// for(;;){ // 무한루프
		//}
		
		while(run) { // 무한루프, while(1), while(true)
			if(keyCode != 13 && keyCode != 10) {
				System.out.println("================================");
				System.out.println("	1. 증속 | 2. 감속 | 3. 종료		");
				System.out.println("================================");
				
				System.out.print("선택 : ");
			}
			
			keyCode = System.in.read();
			
			if(keyCode == 49) { // 1을 읽었을 경우
				speed ++;
				System.out.println("현재 속도 : " + speed);
				System.out.println();
			} 
			else if(keyCode == 50) { // 2를 읽었을 경우
				speed --;
				System.out.println("현재 속도 : " + speed);
				System.out.println();
			}
			else if(keyCode == 51) { // 3를 읽었을 경우
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
		System.out.println("Bye-- Bye--");
	}

}
