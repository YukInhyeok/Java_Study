package Ch02;

public class E0202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
  1. ��ü���� ���α׷��� �ܰ�
  - 1�ܰ� : ��ü �𵨸� �ܰ�
   => ��ü�� �߻�ȭ�ϴ� ��ü �𵨸� �ܰ�
   => Ŭ������ �����ϰ� Ŭ���� �� �ʵ�, �޼ҵ带 ����
   => �Ӽ�, ����, �ʵ�
   => ���, �Լ�, �޼ҵ�
   
   ex) �Ӽ� -> �ʵ�			���				-> �޼ҵ�
   	   �ӵ� -> speed			�ӵ� ����, �ӵ� ���� -> speedUp(), speedDown()
   		
  - 2�ܰ� : Ŭ������ ����
   => �߻� �ܰ迡�� ����� Ŭ���� �̸�, �ʵ�, �޼ҵ带 �ڵ�� �ٲٴ� Ŭ���� ���� �۾�
   => �ڹٴ� Ŭ������ �����ϱ� ���ؼ� class ��� �����
   => Ŭ���� ����
   
   class Ŭ�����̸�{
   	* Ŭ���� ��� = �ʵ� + �޼ҵ�
   	�ʵ� <= ���� ���� ���� ���
   		<= ���� : int Ÿ��, �Ǽ� : double Ÿ��, ����(��) : String
   		ex) ����������(public, private, protected, default) �ڷ�Ÿ��(int, double  	
   }
   
   ex) class Car{
   		}
   		
    => ����������
    - ������
    ����������			�ڽ��� Ŭ����		���� ��Ű��			���� Ŭ����			�ٸ� ��Ű��
    =========================================================================
    private				O				X				X				X
    
    (default)			O				O				X				X
    
    protected			O				O				O				X
    
    public			`	O				O				O				O
    
    - ������ ũ��
    private < default < protected < public
    
    - ���ȯ��(����)
    private : ���� ��� ������ ���� ������, ���� Ŭ������ �޼ҵ常 ������ �����ϴ�.
    
    public : ���� ��� ������ ���� ������ ���� ���� ���� ����.
    
    protected : ��Ű���� ������� ��� ���谡 �ִ� �ڼ� Ŭ�������� ������ �����ϴ�.
           
    default : ���� ��Ű�� �������� ������ �����ϰ�, ������ �� �ִ�. 
   
   
   - ���� ������ ��� ���
    Ŭ���� => (default), public
    �ʵ�, �޼ҵ� => private, (default), protected, public
    �������� : �ƹ��͵� ����� �� ����. 
    ex) 
    
    class Car(){
    	public int speedUp(int i){
    		int j = i;
    		return j;
    	}
    	
    	public int sum(int i, int j){
    		// int hap = i + j;
    		// return hap;
    		   return i+j;
    	}
    }   
    
   
  - 3�ܰ� : ��ü ������ ��� 
 */
	

	}

 
}

