
public class E0301 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 	* 객체지향 프로그램 단계
   	1단계 : 객체 모델링 단계
   		- 클래스를 어떻게 구성(클래스 멤버(필드, 메소드, 생성자(디폴드(기본) 생성자, (일반)생성자)))할 것인가?
   		- 필드, 메소드를 얼마만큼 어떤 관계로 구성할 것인가?
   		
   	2단계 : 클래스화 단계
   	- 필드, 메소드를 생성
   	- 필드, 메소드를 생성시 기능과 유사한 이름으로 생성
   	- 필요에 따라서 필드, 메소드, 필드+메소드(생성자, 일반메소드)
   	- 클래스 구성 요소 생성방법
   	
   	2-1단계 : 필드 생성할 경우
   		: 형식
   		
   		  접근기정자(public, privacy, protected, (default))  반환타입(int, float, double, string) 필드명;
   	
   		ex) public int i;
   	
   	2-2단계 : 메소드 생성할 경우
   	: 형식
   		
   		  접근기정자(public, privacy, protected, (default))  반환타입(int, float, double, string)
   				내부변수...
   				ex) int hap;
   					hap = a+b;
   					return hap;
   		}
   		
   		ex) public int sum(int i, int j){
   				int hap;
   				hap = i+j;
   				return hap;   		
   		}
   		
   		ex) public int sum(int i, int j){
   				return i+j;
   		}
   	
   	3단계 : 객체 생성과 사용
   		- 클래스를 가져와서 클래스내에 있는 필드와 메소드를 사용하기위한 과정
   		- 객체 생성 과정
   		
   		클래스이름 대행자이름 = new 클래스이름();
   		
   		- 객체 사용
   		
   			대행자이름.필드
   			대행자이름.메소드
   	
   	* 객체지향 언어의 캡슐화과정에서 사용되는 접근지정자() 특징/분류
   	
   	1. privacy 접근 지정자
   	
   	- privacy 멤버의 사용범위
   		: 소속된 클래스 내의 메소드로 국환되어 데이터를 은닉할 수 있다.
   	- 일반적으로 필드를 private로 설정한다.
   	- private 접근지정자로 설정한 필드에 접근하기 위해서는 public으로 접근지정자를 선언한 메소드를 통해서 접근이 가능하다.
   	
   	ex)
   	=> 데이터 은닉 제공하지 않는 경우, 외부에서 직접 필드에 값을 대입할 수 있는 경우, 보안에 문제 발생
   	
   		class A{
   			public int a;
   			public void b(int c){
   					a = c;
   				}
   				
   			public void c(int c){
   					return a;
   				}
   			}
   			
   			A	d = new A();
   			
   			// 직접 필드에 값을 넣는 방법
   			d.a = 10 // 10
   			System.out.println(d.a);
   			
   			// b() 함수를 통해 필드 값을 넣는 방법
   			d.b(1); //1
   			System.out.println(d.c());
   			
   			=> 데이터 은닉 제공하는 경우, 외부에서 직접 필드에 값을 대입할 수 있는 경우, 보안 우선시
   			 1. 메소드의 접근지정자가 privacy 로 지정되어 있을 경우 => 동작이 안됨
   			class A{
   				privacy int a;
   				privacy void b(int c){
   					a = c;
   				}
   				
   				public int c(){
   					return a;
   				}
   			}
   			
   			A	d = new A();
   			
   			// 직접 필드에 값을 넣는 방법
   			d.a = 10 // 오류발생
   			System.out.println(d.a); // 오류발생
   			
   			// b() 함수를 통해 필드 값을 넣는 방법
   			d.b(1); // 오류발생
   			System.out.println(d.c()); // 오류발생 X
   			
   			2. 메소드의 접근지정자를 public 로 지정되어 있을 경우 => 동작이 됨
   			class A{
   				privacy int a;
   				public void b(int c){
   					a = c;
   				}
   				
   			public int c(){
   					return a;
   				}
   			}
   			
   			A	d = new A();
   			
   			// 직접 필드에 값을 넣는 방법
   			d.a = 10 // 오류발생
   			System.out.println(d.a);	// 오류발생
   			
   			// b() 함수를 통해 필드 값을 넣는 방법
   			d.b(1); // a=1
   			System.out.println(d.c()); // 1
   			
   	* 캡슐화
   	 - 객체의 필드, 메소드를 하나로 묶고, 실제 구현 내용을 감추는 것
   => 클래스내 필드 privacy 접근지정자를 필드에 선언
   
   - 접근지정자
    => 필드 -> privacy 접근지정자를 선언
    => 메소드 -> public 접근지정자를 선언
 */
	}

}
