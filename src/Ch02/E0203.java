package Ch02;

public class E0203 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 1. ��ü�������α׷� �ܰ�
 - 1�ܰ� : ��ü �𵨸� �ܰ�
 - 2�ܰ� : Ŭ����ȭ �ܰ�
 - 3�ܰ� : ��ü ������ ���
 
 2. ��ü ������ ���
 - Ŭ���� : ��ü�� ���赵, Ʋ, ��Ǫ��, ���ø�
 - ��ü���� ���α׷��ֿ����� Ŭ������ �ν��Ͻ�(��ü, ��ü)�� �����Ѵ�.
 
   Ŭ�����̸�  �������̸�         =    new Ŭ�����̸�();
            --------              --------------- 
         ��������, ���۷��� ����       �ν��Ͻ��� �����Ѵ�. ��ü�� �����Ѵ�.
                                  �ν��Ͻ�, ��ü �ν��Ͻ�
                                  new �����ڿ� ���ؼ� �����Ǵ� ��ü 
 
 	ex)  class Car{
 			int speed;
 			
 			int speedUp(){
 			   speed += 5;
 			}
 			
 			int speedDown(){
 			   speed -= 5;
 			}
 			
 			Car(){
 			   // ����Ʈ ������
 			}
 			
 			Car(int s){ <= �Ϲ� ������
 			    speed=s;
 			}
 			
 	      }
 	      
 	     //Car  c  =  new  Car();
 	     Car  c  =  new  Car(10);
 	     
 	     c.speed = 10;
 	     
 	     System.out.println(c.speed);  // 10
 
 		 c.speedUp(); // 10->15
 		 System.out.println(c.speed);  // 15
 		 
 		 c.speedDown(); // 15->10
 		 System.out.println(c.speed);  // 10
 
 		 // c.close() <= ��ü ����	
 
 3. ������
  - ��ü ���� �� �ʵ忡 �ʱ�ȭ ���� �����
  - ������ ��� : ��ȯŸ�� X, �Ű����� ����(����Ʈ ������, �Ϲ� ������)
  - ����
    * ����Ʈ ������
     Ŭ�����̸�(){
     }
     
     ex)
     Car(){
     }
     
     Car c = new Car();
     
    * �Ϲ� ������
      Ŭ�����̸�(�Ű�����1...){
        �ʵ��1 = �Ű�����1;
      }
      ex)
      Car(int s){
        speed = s;
      }  
 
 	  Car c = new Car(10);	
 
 4. Setter/Getter
  - Getter
  
    ����������  �ڷ�Ÿ��  get�Լ���(){
       return speed;
    }
    
    ex)  public int getSpeed(){
             return speed;
    }   
   
  - Setter
  
    ���������� �ڷ�Ÿ��(void)  set�Լ���(int sp){
    	  speed	= sp;
    }  
  
  
    ex1)  public void  setSpeed(int sp){
                speed = sp;
    }
    
    
    ex2)  public void  setSpeed(int speed){
                this.speed = speed;
    }
 
 
 
 */
	}

}
