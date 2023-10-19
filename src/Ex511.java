// if~else if문을 이요한 대소문자 변경하는 프로그램

import java.util.Scanner;

public class Ex511 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String str; //asdfasdfasdf
		char ch;  //a
		
		System.out.print("문자를 입력하세요. >> ");
		
		str = input.nextLine();
		
		ch = str.trim().charAt(1);
		// s;dalkfj;asdkl
		
		
		if(ch >= 'A' && ch <= 'Z') {
			ch = (char)(ch+32);
			System.out.println("대문자 => 소문자: " + ch);
		}
		else if(ch >= 'a' && ch <='z') {
			ch = (char)(ch-32);
			System.out.println("소문자 => 대문자: " + ch);
		}
		else {
			System.out.println("문자가 아닙니다.");
		}
		
		System.out.println("변경 후 문자는" + ch + "입니다.");
	}

}
