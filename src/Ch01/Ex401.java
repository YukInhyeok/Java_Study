
public class Ex401 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 1. �������
 	- ���� : ���α׷����� �����͸� ó���� �� ����� �����ϴ� ��
 	- ������ : ���꿡 ���Ǵ� ǥ�ó� ��ȣ
 	- �ǿ����� : ����Ǵ� ������
 	- ����� : �����ڿ� �ǿ����ڸ� �̿��Ͽ� ������ ������ ����� ��
 	
 	ex) ��� ������ : byte, short, int, long, float, double => ���� Ÿ��
 		�� �����ڿ� ���� ������ : <, >, <=, >=,	 !, &, |, &&, || => ����(boolean) Ÿ��
 		
 2. �ڹٿ��� �����ϴ� �پ��� ������
 
 =================================================================================
 ������ ����	������					�ǿ�����		���Ⱚ		��� ����
 ---------------------------------------------------------------------------------
 ���		+, -, *, /, %			����			����			��Ģ���� �� ������ ����
 ��ȣ		+, -					����			����			������ ����� ��ȣ
 ���ڿ�		+						����			���ڿ�		�� ���ڿ��� ����
 ����		=, +=, -=, /=, %=,		����			�پ�			�캯�� ���� �º��� ������ ����
 			*=, &=, ^=, !=, <<=,
 			>>=, >>>=
 			ex) int result += 10;  == int result = result + 10;
 ����		++, --					����			����			1��ŭ ����/����
 			ex) int a= 1;
 				++a; a++; 
 ��		==, !=, >, <, >=, <=	����			boolean		���� ��
 			instanceof
 ����		!, &, |, &&, ||			����, ����		boolean		������ NOT, AND, OR ����
 ����		(���ǽ�)?A:B				����			�پ�			���ǿ� ���� A �Ǵ� B �� �ϳ��� ����
 ��Ʈ		~, &, |, ^				����, ����		����,boolean	��Ʈ NOT, AND, OR, XOR ����
 ����Ʈ		>>, <<, >>>				����			����			��Ʈ�� ����/������ �о �̵�
 
 
 3. ������ ����� �켱����
 
 ==================================================================================
 ������											���� ����					�켱����
 ----------------------------------------------------------------------------------
 ����(++, --), ��ȣ(+,-), ��Ʈ(~), ����(!)			<--------					����
 ���(*,/,%)										-------->
 ���(+,-)										-------->
 ����Ʈ(<<, >>, >>)								-------->
 ��(<,>,<=,>=, instanceof)						-------->
 ��(==, !=)									-------->
 ����(&)											-------->
 ����(^)											-------->
 ����(|)											-------->
 ����(&&)										-------->
 ����(||)										-------->
 ����(?:)										-------->
 ����(=, +=, -=, *=, /=, %=, &=, |=, ^=, !=, 	<--------					����
 	 <<=, >>=, >>>=)
 	 
 	 ex) int var1 =1;
 	 	 int var2 =3;
 	 	 int var3 =2;
 	 	 
 	 	 int result = var1 + var2 * var3; (���ϱ� ���� ����ϰ� ���ϱ�)
 	 	 
  4. �������� �켱���� ����
  	- ����, ����, ���� ������ ������ �켱������ ������.
  	- ���, ��, ����, ���� ������ ������ �켱������ ������.
  	- ���װ� ���� ������ ������ ��� ������ ������ ���ʿ��� �������̴�.(->)
  	- ������ ����Ŀ��� ��ȣ()�� ����ؼ� �켱������ �����ش�.
 */
 
	}

}