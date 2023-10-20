package Ch01;

import java.util.Scanner;

public class Ex516 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String str;
		char ch;
		
		System.out.print("문자 한 개를 입력하세요. >> ");
		
		str = input.nextLine();
		
		ch = str.trim().charAt(0);
		
		switch(ch) {
			case 'A':
			case 'a':
				System.out.println("America");
				break;
			case 'B':
			case 'b':
				System.out.println("Britain");
				break;
			case 'K':
			case 'k':
				System.out.println("Korea");
				break;
			default:
					System.out.println("The others");
		}
	}

}
