Import java.until.Scanner;

Public class chap3_16 {
	Public static vod main(String[] args) {
		// T0D0Auto-generated method stub
		String str[] = {��������,��������,������}; // ����,����,���� �迭�� �ִ´�.
		
		Scanner s = newScanner(system.in);  // �Է°�ü ����
		System.out.print(������ ���� �� ������ �����մϴ�.��);
		While(true){ //���� ����
			System.out.print(������ ���� ��>>��);
			Int n =(int)(Math.random() * 3); // 0 1 2 �������� n���� �ݺ��� ���� �� ������ �־��ش�.			
			String sw = s.next(); // sw�� ���� ���� �� �� �ϳ��� ���ڿ��� �Է¹޴´�.
			If(sw.equals(��stop��)) { // stop�� �ԷµǸ� �ݺ����� �����Ѵ�.				System.out.println(�������� �����մϴ�.��);
				break;
				} // ���� �Է��� ���� ������ ��,������ ��,�� �� �� ��츦 �ְ�
				// �� �ȿ��� ������ �迭�� ������ ��� �����Ѵ�
				// �����ϰ� ���� ����� ���� ������ �ǹǷ� str�� n��° ���Ҹ� �����Ѵ�
				// �� �� �������� ���� ��°��� System.out.println���� ����Ѵ�.
			else if(sw.equals(��������)) {
				If(str[n].equals(��������)){
				System.out.println(�������= �� + sw + ��, ��ǻ��= �� + str[n] + �����º��Դϴ�.��); }
				else If(str[n].equals(��������)){
				System.out.println(�������= �� + sw + ��, ��ǻ��= �� + str[n] + ������� lose �Դϴ�.��); }
				else If(str[n].equals(������)){
				System.out.println(�������= �� + sw + ��, ��ǻ��= �� + str[n] + ������� win �Դϴ�.��); }
				else if(sw.equals(��������)) {
					If(str[n].equals(��������)){
				System.out.println(�������= �� + sw + ��, ��ǻ��= �� + str[n] + ������� win �Դϴ�.��); }
				else If(str[n].equals(��������)){
				System.out.println(�������= �� + sw + ��, ��ǻ��= �� + str[n] + �����º��Դϴ�.��); }
				If(str[n].equals(������)){
				System.out.println(�������= �� + sw + ��, ��ǻ��= �� + str[n] + ������� lose �Դϴ�.��); }
			else if(sw.equals(������)) {
				If(str[n].equals(��������)){
				System.out.println(�������= �� + sw + ��, ��ǻ��= �� + str[n] + ������� lose �Դϴ�.��); }
				else If(str[n].equals(��������)){
				System.out.println(�������= �� + sw + ��, ��ǻ��= �� + str[n] + ������� win �Դϴ�.��); }
				else If(str[n].equals(����)){
				System.out.println(�������= �� + sw + ��, ��ǻ��= �� + str[n] + �����º� �Դϴ�.��); }			
			}
		}
		s.close(); //������ ������ �Ǹ� �Է°�ü�� �ݴ´�.
	}
}