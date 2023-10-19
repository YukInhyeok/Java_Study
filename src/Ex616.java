import java.util.Scanner;

public class Ex616 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while문과 break문을 사용하여 -1이 입력될까지 입력된 숫자의 개수와 합을 출력하는 프로그램
		Scanner input = new Scanner(System.in);
		
		int num = 0;
		int hap = 0;
		int a;
		
		while(true) {
			System.out.print("임의의 정수값을 넣어주세요. 단 -1이면 종료됩니다. >> ");
			if((a =input.nextInt()) == -1) {
				break;
			}
			
			num++;
			hap += a;
		}
		
		System.out.println("입력된 숫자의 개수 : " + num);
		System.out.println("입력된 숫자의 합 : " + hap);		
		
	}

}
