package Ch01;

class CreditCard{
	public String owner;
	private long number;
	
	public String getOwner() {
		return this.owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public long getNumber() {
		return this.number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	
	public CreditCard() {
		
	}
	
	public CreditCard(String owner) {
		this.owner = owner;
	}
	
	public CreditCard(long number) {
		this.number = number;
	}
	
	public CreditCard(String owner, long number) {
		this.owner = owner;
		this.number = number;
	}
	
	public void print() {
		System.out.print("카드소유자 : " + this.owner + "   ");	
		System.out.println("카드번호 : " + this.number);
	}
	
	public void printOnwer() {
		System.out.print("카드소유자 : " + this.owner);
		System.out.print("   ");
	}
	
	public void  printNumber() {		
		System.out.println("카드번호 : " + this.number);
	}

}

public class Ex1004 {

	public static void main(String[] args) {		
		// TODO Auto-generated method stub
		/*
		 3. 생성자 오버로딩
		 - 정의 : 하나의 클래스에서 인자가 다르면 생성자를 여러 개를 만들 수 있다.
		   ex)
		   		class CreditCard{ 
		        	public String owner; //카드 소유자
		        	private long  number; // 16자리 카드 번호
		        
		        	public CreditCard(){}
		        	public CreditCard(String owner){
		        			this.owner = owner;
		        	}
		        	public CreditCard(long number){
		        			this.number = number;
		        	}
		        	public CreditCard(String owner, long number){
		        			this.owner = owner;
		        			this.number = number;
		        	}	        	
		        	
		        }
		        
		 */
		
		CreditCard card1 = new CreditCard("권해동");
		CreditCard card2 = new CreditCard(3425_4587_2345_9845L);
		
		card2.owner = "권순미";
		
		CreditCard card3 = new CreditCard("이다혜", 5638_8627_8623_9811L);
		
		System.out.println("card1의 소유자 : " + card1.owner + "   " + "card1의 카드번호 : " + card1.getNumber());
		System.out.println("card2의 소유자 : " + card2.owner + "   " + "card2의 카드번호 : " + card2.getNumber());
		System.out.println("card3의 소유자 : " + card3.owner + "   " + "card3의 카드번호 : " + card3.getNumber());
		
		System.out.println();
		
		card1.printOnwer();
		card1.printNumber();
		card2.printOnwer();
		card2.printNumber();
		card3.printOnwer();
		card3.printNumber();
		
		System.out.println();
		
		card1.print();
		card2.print();
		card3.print();
		
		
		
	}

}
