mport java.util.Scanner;

Public class chap2_2{

      Public static voidmain(String[] args){
		// T0D0Auto-generated method stub
       		Scanner s = newScanner(system.in);  // �Է°�ü ����
		System.out.print(��2�ڸ��� ���� ���� �Է�(10~99)>>��);
		Int n = s.nextInt(); // n�� int�� �����͸� ����
		If((n/10) == (n%10)) { //���� �ڸ��� �����ڸ��� ������� ������������ ���� ������ ������ Ȯ���Ѵ�.
		System.out.printnln(��10�� �ڸ��� 1�� �ڸ��� �����ϴ�.��);//���϶�
		}		
		else{ 
		System.out.println(��10�� �ڸ��� 1�� �ڸ��� ���� �ʽ��ϴ�.��);
		}
		Smclose(); //Scanner ��ü�� ������