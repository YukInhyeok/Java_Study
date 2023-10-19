
public class Ex1103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
  2. 접근 지정자
  
  - 통합 패키지인 경우(A package)
  
  	: 수퍼 클래스
  	ex) class Account{
  			public String name;
  			protected Date open; => Date클래스 : import java.util.Date;
  			// /*package*/ //int number;
			// private long balance;
//  	}
  	/*
  	: 상속받는 클래스(extends 사용한 경우)
  	ex) public class savingAccount extends Account{
  		- 서브클래스(savingAccount)는 상속을 받은 상위 클래스(Account)의 public,
  		protected, default 접근가능
  		- private는 접근이 불가능
  	}
  	  	
  	: 일반 클래스(extends를 사용하지 않는 경우)
  	ex) public class AccountTest {
  		- 서브클래스(AccountTest)는 상속을 받지 않아도 같은 패키지내에 존재 하기 때문에
  		  public, protected, default 접근가능
  		- private는 접근이 불가능
  	}
  	
  	
  	
  - 통합 패키지가 아닌 경우(B package)
  	: 상속받는 클래스(extends 사용한 경우)
  	ex) public class CheckAccount extends Account{
  		- 통합 패키지(A Package)가 아닌 서브클래스(CheckAccount)는 public, protected 접근가능
  		- default, private는 접근이 불가능
  	
  	: 일반 클래스(extends를 사용하지 않는 경우)
  	ex) public class CheckTest {
  		- 통합 패키지(A Package)가 아닌 서브클래스(CheckTest)는 public 접근가능
  		- protected, private, default 접근 불가능
  		
  	=======================================================================================
  	공개적	키워드	클래스내부				동일 패키지(A package)			다른패키지(B package)
  	 순위								하위 클래스(상속)	일반클래스		하위 클래스(상속)	일반클래스
  	=======================================================================================
  	1		public		가능				가능				가능			가능				가능
  	2		protected	가능				가능				가능			가능				불가능
  	3		default		가능				가능				가능			불가능			불가능
  	4		private		가능				불가능			불가능		불가능			불가능
  		  	
 */
	}

}
