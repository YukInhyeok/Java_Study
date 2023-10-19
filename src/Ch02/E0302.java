class Car1{
	private int speed; // 외부에서 접근하는 것을 허용하지 않음

	//getter 메서드 정의
	int getSpeed() {
		return speed;
	}
	
	//setter 메서드 정의
	void setSpeed(int sp) {
		speed =sp;
	}
	
	// 디폴트 생성
	Car1(){
		
	}
	
	// 생성자
	
	Car1(int sp){
		speed = sp;
	}
}

public class E0302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
  * 필드에 값을 넣는 방법
    1. 필드 접근지정자 : public
     - 객체 생성 후 "객체.필드명 = 입력값;" - 값 입력 
    ex) class A{
    	    public int i;
         }
    
        A a = new A();
        a.i = 1;        
    
    2. 필드 접근지정자 : privacy
     - 생성자
       : 기본(디폴트) 생성자
         -> 모든 클래스는 생성자가 반드시 존재하며, 하나 이상을 가질수 있다.
         -> 클래스 내부에서 생성자 선언을 생략했다면 컴파일러는 중과로({}) 블록 내용이 비어있는 부분을 바이트 코드에
            자동 추가
          
         ex) class A{
             public int i;
             
             A(){
               // 기본(디폴트) 생성자
             }
         }  
         
         A a = new A();
       
       : (일반)생성자 : 필드 초기화
       
       class A{
         //public int i;
         private int i;
         
         A(){
         }
         
         A(int j){  //생성자 오버로닝 
             i=j;
         }
         
         
       }
       
       A a = new A(1);
       
     
     - Setter 메소드 
       : 형식
       
       접근지정자 set필드명(자료타입  매개변수){
         필드명 = 매개변수;
       }
       
      ex)
      
       class A{
         //public int i;
         private int imb;
         
         A(){
           // 디폴트 생성자
         }
         
         // Setter 형식
         // public      void       setImb(int im){
         // -------     -----      ------  -----
         // 접근지정자     반환타입   setter명  매개변수 
         //
         //     imb(클래스내 필드명)  =   im (매개변수명);  
         // } 
           
        public void setImb(int im){
                 imb =  im;
        }   
         
       }
       
       A a = new A();
       
       a.setImb(1);         
    
  
  * 필드에 값을 얻어오는 방법 
     - 필드 접근지정자 : public
       -> 객체 생성 후 "객체.필드명;" 입력
         
         ex) a.imb;
       
       -> System.out.println(객체.필드명);
     
         ex) System.out.println(a.imb); 
     
     - 필드 접근지정자 : private
       -> public으로 접근지정자를 사용한 함수를 이용해 필득밧 얻어온다. => Getter 함수
       -> Getter 형식
       
         접근지정자  반환타입  get필드명(){
                 return 필드명;
         }
        
        ex)  class A{
           private int imb;
           
           A(){
             // 디폴트 생성자
           }
           
           A(int im){
               imb = im;
           }
           
           public int getImb(){
                return imb;
           }
           
           public void setImb(int im){
               if(im >0)    
                   imb  =  im; 
           }
        
        }
        
        // 생성자를 사용했을 경우
        A a = new A(1);
        
        * 값을 얻어오는 방법
        * a.getImb() // 콘솔에 결과가 나오지는 않는다.
        System.out.println("getter 함수 사용 : " + a.getImb());
        
        // Setter을 사용했을 경우
        
        A a = new A();
     
        a.setImb(1);
        
        Sytem.out.println("Setter 함수를 이용할 경우 Getter 함수를 
                        통해 필드 값을 가져오는 경우 : " + a.getImb());  
      
 */
		
/*
     // 필드가 private로 지정된 경우 Getter/Setter 메소드를 이용하는 방법
      
      Class Car{
        private int speed;
        
        Car(){
          // 디폴트 생성자
        }
        
        public void setSpeed(int sp){
             if(sp > 0)
                 speed =sp;
        }
        
        public int getSpeed(){
             return speed;
        }
      
      }
      
      Car c1 = new Car();
      
      c1.setSpeed(10);
      
      System.out.println(c1.getSpeed());
      
      
     // 필드가 private로 지정된 경우  생성자/Getter 메소드를 이용하는 방법 
      
      class Car{
        private  int  speed;
        
        Car(){
          // 디폴트 생성자
        }
        
        Car(int sp){
           speed = sp;
        }
      
        public int getSpeed(){
            return speed;
        } 
      
      } 
      
      Car c2 = new Car(10);
      
      System.out.println(c1.getSpeed());
  
      
 */		
	// 생성자를 이용할 경우
		Car1 c = new Car1(10);
		System.out.println(c.getSpeed());
		
	// Setter 메소드를 이용할 경우
		Car1 c1 = new Car1();
		
		c1.setSpeed(10);
		System.out.println(c1.getSpeed());
		
		
	}

}

