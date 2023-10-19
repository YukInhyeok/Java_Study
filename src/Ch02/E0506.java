package Ch02;

public class E0506 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
1. 클래스 접근 지정자  
- public 방식 => 키워드 public을 사용한 클래스는 다른 모든 클래스에서 사용할 수 있다.
- [default] 방식 => 동일한 패키지의 다른 클레스에서만 사용할 수 있다.

		
2. 필드와 메소드의 접근 지정자 종류
=====================================================================================
공개적     키워드          클래스           동일한 패키지                  동일하지 않은 패키지  
순위                     내부        하위 클래스    일반 클래스        하위 클래스       일반 클래스     
=======================================================================================
1        public           O             O            O               O             O           
2        protected        O             O            O               O             X
3        default          O             O            O               X             X 
4        private          O             X            X               X             X 

 
3. 접근지정 구분
- 동일한 패키지
 
class Account{
	public String name;
	protected Date open;
	///*package*/ // int numer;
	//private long balance;	
		/*
}
	//하부 클래스
	public class savingAccount extends Account{
		서브클래스는 상속을 받은 상위 클래스의 public, protected, default 접근 가능
		private는 접근이 불가능
	}

    //일반 클래스
    public class AccountTest{
    	일반클래스는 수퍼 클래스(Account)의 public, protected, default 접근 가능
    	private는 접근이 불가능
    }


- 서로다른 패키지 
   //하부 클래스
public class CheckAccount extends Account{
  동일한 패키지가 아닌 서브클래스는  public, protected 접근이 가능
} 

   //일반 클래스
 public class CheckTest{
   동일한 패키지가 아닌 일반 클래스는   public 접근 가능
   protected, default, private는 접근 불가능
 }
 */		
	}

}
