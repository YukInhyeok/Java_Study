
public class E0301 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 	* ��ü���� ���α׷� �ܰ�
   	1�ܰ� : ��ü �𵨸� �ܰ�
   		- Ŭ������ ��� ����(Ŭ���� ���(�ʵ�, �޼ҵ�, ������(������(�⺻) ������, (�Ϲ�)������)))�� ���ΰ�?
   		- �ʵ�, �޼ҵ带 �󸶸�ŭ � ����� ������ ���ΰ�?
   		
   	2�ܰ� : Ŭ����ȭ �ܰ�
   	- �ʵ�, �޼ҵ带 ����
   	- �ʵ�, �޼ҵ带 ������ ��ɰ� ������ �̸����� ����
   	- �ʿ信 ���� �ʵ�, �޼ҵ�, �ʵ�+�޼ҵ�(������, �Ϲݸ޼ҵ�)
   	- Ŭ���� ���� ��� �������
   	
   	2-1�ܰ� : �ʵ� ������ ���
   		: ����
   		
   		  ���ٱ�����(public, privacy, protected, (default))  ��ȯŸ��(int, float, double, string) �ʵ��;
   	
   		ex) public int i;
   	
   	2-2�ܰ� : �޼ҵ� ������ ���
   	: ����
   		
   		  ���ٱ�����(public, privacy, protected, (default))  ��ȯŸ��(int, float, double, string)
   				���κ���...
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
   	
   	3�ܰ� : ��ü ������ ���
   		- Ŭ������ �����ͼ� Ŭ�������� �ִ� �ʵ�� �޼ҵ带 ����ϱ����� ����
   		- ��ü ���� ����
   		
   		Ŭ�����̸� �������̸� = new Ŭ�����̸�();
   		
   		- ��ü ���
   		
   			�������̸�.�ʵ�
   			�������̸�.�޼ҵ�
   	
   	* ��ü���� ����� ĸ��ȭ�������� ���Ǵ� ����������() Ư¡/�з�
   	
   	1. privacy ���� ������
   	
   	- privacy ����� ������
   		: �Ҽӵ� Ŭ���� ���� �޼ҵ�� ��ȯ�Ǿ� �����͸� ������ �� �ִ�.
   	- �Ϲ������� �ʵ带 private�� �����Ѵ�.
   	- private ���������ڷ� ������ �ʵ忡 �����ϱ� ���ؼ��� public���� ���������ڸ� ������ �޼ҵ带 ���ؼ� ������ �����ϴ�.
   	
   	ex)
   	=> ������ ���� �������� �ʴ� ���, �ܺο��� ���� �ʵ忡 ���� ������ �� �ִ� ���, ���ȿ� ���� �߻�
   	
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
   			
   			// ���� �ʵ忡 ���� �ִ� ���
   			d.a = 10 // 10
   			System.out.println(d.a);
   			
   			// b() �Լ��� ���� �ʵ� ���� �ִ� ���
   			d.b(1); //1
   			System.out.println(d.c());
   			
   			=> ������ ���� �����ϴ� ���, �ܺο��� ���� �ʵ忡 ���� ������ �� �ִ� ���, ���� �켱��
   			 1. �޼ҵ��� ���������ڰ� privacy �� �����Ǿ� ���� ��� => ������ �ȵ�
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
   			
   			// ���� �ʵ忡 ���� �ִ� ���
   			d.a = 10 // �����߻�
   			System.out.println(d.a); // �����߻�
   			
   			// b() �Լ��� ���� �ʵ� ���� �ִ� ���
   			d.b(1); // �����߻�
   			System.out.println(d.c()); // �����߻� X
   			
   			2. �޼ҵ��� ���������ڸ� public �� �����Ǿ� ���� ��� => ������ ��
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
   			
   			// ���� �ʵ忡 ���� �ִ� ���
   			d.a = 10 // �����߻�
   			System.out.println(d.a);	// �����߻�
   			
   			// b() �Լ��� ���� �ʵ� ���� �ִ� ���
   			d.b(1); // a=1
   			System.out.println(d.c()); // 1
   			
   	* ĸ��ȭ
   	 - ��ü�� �ʵ�, �޼ҵ带 �ϳ��� ����, ���� ���� ������ ���ߴ� ��
   => Ŭ������ �ʵ� privacy ���������ڸ� �ʵ忡 ����
   
   - ����������
    => �ʵ� -> privacy ���������ڸ� ����
    => �޼ҵ� -> public ���������ڸ� ����
 */
	}

}
