package Ch02;

public class E0506 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
1. Ŭ���� ���� ������  
- public ��� => Ű���� public�� ����� Ŭ������ �ٸ� ��� Ŭ�������� ����� �� �ִ�.
- [default] ��� => ������ ��Ű���� �ٸ� Ŭ���������� ����� �� �ִ�.

		
2. �ʵ�� �޼ҵ��� ���� ������ ����
=====================================================================================
������     Ű����          Ŭ����           ������ ��Ű��                  �������� ���� ��Ű��  
����                     ����        ���� Ŭ����    �Ϲ� Ŭ����        ���� Ŭ����       �Ϲ� Ŭ����     
=======================================================================================
1        public           O             O            O               O             O           
2        protected        O             O            O               O             X
3        default          O             O            O               X             X 
4        private          O             X            X               X             X 

 
3. �������� ����
- ������ ��Ű��
 
class Account{
	public String name;
	protected Date open;
	///*package*/ // int numer;
	//private long balance;	
		/*
}
	//�Ϻ� Ŭ����
	public class savingAccount extends Account{
		����Ŭ������ ����� ���� ���� Ŭ������ public, protected, default ���� ����
		private�� ������ �Ұ���
	}

    //�Ϲ� Ŭ����
    public class AccountTest{
    	�Ϲ�Ŭ������ ���� Ŭ����(Account)�� public, protected, default ���� ����
    	private�� ������ �Ұ���
    }


- ���δٸ� ��Ű�� 
   //�Ϻ� Ŭ����
public class CheckAccount extends Account{
  ������ ��Ű���� �ƴ� ����Ŭ������  public, protected ������ ����
} 

   //�Ϲ� Ŭ����
 public class CheckTest{
   ������ ��Ű���� �ƴ� �Ϲ� Ŭ������   public ���� ����
   protected, default, private�� ���� �Ұ���
 }
 */		
	}

}
