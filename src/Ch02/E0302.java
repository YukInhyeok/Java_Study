class Car1{
	private int speed; // �ܺο��� �����ϴ� ���� ������� ����

	//getter �޼��� ����
	int getSpeed() {
		return speed;
	}
	
	//setter �޼��� ����
	void setSpeed(int sp) {
		speed =sp;
	}
	
	// ����Ʈ ����
	Car1(){
		
	}
	
	// ������
	
	Car1(int sp){
		speed = sp;
	}
}

public class E0302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
  * �ʵ忡 ���� �ִ� ���
    1. �ʵ� ���������� : public
     - ��ü ���� �� "��ü.�ʵ�� = �Է°�;" - �� �Է� 
    ex) class A{
    	    public int i;
         }
    
        A a = new A();
        a.i = 1;        
    
    2. �ʵ� ���������� : privacy
     - ������
       : �⺻(����Ʈ) ������
         -> ��� Ŭ������ �����ڰ� �ݵ�� �����ϸ�, �ϳ� �̻��� ������ �ִ�.
         -> Ŭ���� ���ο��� ������ ������ �����ߴٸ� �����Ϸ��� �߰���({}) ��� ������ ����ִ� �κ��� ����Ʈ �ڵ忡
            �ڵ� �߰�
          
         ex) class A{
             public int i;
             
             A(){
               // �⺻(����Ʈ) ������
             }
         }  
         
         A a = new A();
       
       : (�Ϲ�)������ : �ʵ� �ʱ�ȭ
       
       class A{
         //public int i;
         private int i;
         
         A(){
         }
         
         A(int j){  //������ �����δ� 
             i=j;
         }
         
         
       }
       
       A a = new A(1);
       
     
     - Setter �޼ҵ� 
       : ����
       
       ���������� set�ʵ��(�ڷ�Ÿ��  �Ű�����){
         �ʵ�� = �Ű�����;
       }
       
      ex)
      
       class A{
         //public int i;
         private int imb;
         
         A(){
           // ����Ʈ ������
         }
         
         // Setter ����
         // public      void       setImb(int im){
         // -------     -----      ------  -----
         // ����������     ��ȯŸ��   setter��  �Ű����� 
         //
         //     imb(Ŭ������ �ʵ��)  =   im (�Ű�������);  
         // } 
           
        public void setImb(int im){
                 imb =  im;
        }   
         
       }
       
       A a = new A();
       
       a.setImb(1);         
    
  
  * �ʵ忡 ���� ������ ��� 
     - �ʵ� ���������� : public
       -> ��ü ���� �� "��ü.�ʵ��;" �Է�
         
         ex) a.imb;
       
       -> System.out.println(��ü.�ʵ��);
     
         ex) System.out.println(a.imb); 
     
     - �ʵ� ���������� : private
       -> public���� ���������ڸ� ����� �Լ��� �̿��� �ʵ�� ���´�. => Getter �Լ�
       -> Getter ����
       
         ����������  ��ȯŸ��  get�ʵ��(){
                 return �ʵ��;
         }
        
        ex)  class A{
           private int imb;
           
           A(){
             // ����Ʈ ������
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
        
        // �����ڸ� ������� ���
        A a = new A(1);
        
        * ���� ������ ���
        * a.getImb() // �ֿܼ� ����� �������� �ʴ´�.
        System.out.println("getter �Լ� ��� : " + a.getImb());
        
        // Setter�� ������� ���
        
        A a = new A();
     
        a.setImb(1);
        
        Sytem.out.println("Setter �Լ��� �̿��� ��� Getter �Լ��� 
                        ���� �ʵ� ���� �������� ��� : " + a.getImb());  
      
 */
		
/*
     // �ʵ尡 private�� ������ ��� Getter/Setter �޼ҵ带 �̿��ϴ� ���
      
      Class Car{
        private int speed;
        
        Car(){
          // ����Ʈ ������
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
      
      
     // �ʵ尡 private�� ������ ���  ������/Getter �޼ҵ带 �̿��ϴ� ��� 
      
      class Car{
        private  int  speed;
        
        Car(){
          // ����Ʈ ������
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
	// �����ڸ� �̿��� ���
		Car1 c = new Car1(10);
		System.out.println(c.getSpeed());
		
	// Setter �޼ҵ带 �̿��� ���
		Car1 c1 = new Car1();
		
		c1.setSpeed(10);
		System.out.println(c1.getSpeed());
		
		
	}

}

