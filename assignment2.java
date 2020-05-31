Import java.until.Scanner;
Public class chap3_4{

	Public static void main(String[] args) {
		// T0D0Auto-generated method stub
		Scanner s = newScanner(system.in);  // 입력객체 선언
		System.out.print(“소문자 알파벳 하나를 입력하세요>>”);
		Char x = s.next().charAt(0); // 문자 x에 문자열의 제일 앞칸을 입력받는다(문자 하나).
		for{int I = 0; I <= x - ‘a’; I++){
			// 0~ x-‘a’까지로 버위를 지정한다. x - ‘I’ 연산은 아스키코드로 이루어진다. 소문자 알파벳이 몇 번째인지를 x-‘a’를 통해 연산한다.
			for(char j =‘a’; j<= c-I; j++){
				//for문을 문자 a부터 입력받은 문자 -i까지 반복한다.
				//삼각형 형태로 나타내기 위해서 c-i를 통해 줄 수가 늘어날수록 출력값이 줄어든다.
			System.out.print(j);
		}
		System.out.println(); // 줄바꿈
	}
	S.close(); // 입력 객체를 닫는다.