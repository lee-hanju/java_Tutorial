Import java.until.Scanner;

Public class chap3_16 {
	Public static vod main(String[] args) {
		// T0D0Auto-generated method stub
		String str[] = {“가위”,“비위”,“보”}; // 가위,바위,보를 배열에 넣는다.
		
		Scanner s = newScanner(system.in);  // 입력객체 선언
		System.out.print(“가위 바위 보 게임을 진행합니다.”);
		While(true){ //무한 루프
			System.out.print(“가위 바위 보>>”);
			Int n =(int)(Math.random() * 3); // 0 1 2 랜덤값을 n으로 반복이 시작 될 때마다 넣어준다.			
			String sw = s.next(); // sw에 가위 바위 보 중 하나의 문자열을 입력받는다.
			If(sw.equals(“stop”)) { // stop이 입력되면 반복문을 종료한다.				System.out.println(“게임을 종료합니다.”);
				break;
				} // 내가 입력한 값이 가위일 때,바위일 때,보 일 때 경우를 넣고
				// 그 안에서 세부적 배열의 값들을 모두 참조한다
				// 랜덤하게 나온 결과에 따라 참조가 되므로 str의 n번째 원소를 참조한다
				// 이 때 참조햇을 때의 출력값을 System.out.println으로 출력한다.
			else if(sw.equals(“가위”)) {
				If(str[n].equals(“가위”)){
				System.out.println(“사용자= ” + sw + “, 컴퓨터= ” + str[n] + “무승부입니다.”); }
				else If(str[n].equals(“바위”)){
				System.out.println(“사용자= ” + sw + “, 컴퓨터= ” + str[n] + “사용자 lose 입니다.”); }
				else If(str[n].equals(“보”)){
				System.out.println(“사용자= ” + sw + “, 컴퓨터= ” + str[n] + “사용자 win 입니다.”); }
				else if(sw.equals(“바위”)) {
					If(str[n].equals(“가위”)){
				System.out.println(“사용자= ” + sw + “, 컴퓨터= ” + str[n] + “사용자 win 입니다.”); }
				else If(str[n].equals(“바위”)){
				System.out.println(“사용자= ” + sw + “, 컴퓨터= ” + str[n] + “무승부입니다.”); }
				If(str[n].equals(“보”)){
				System.out.println(“사용자= ” + sw + “, 컴퓨터= ” + str[n] + “사용자 lose 입니다.”); }
			else if(sw.equals(“보”)) {
				If(str[n].equals(“가위”)){
				System.out.println(“사용자= ” + sw + “, 컴퓨터= ” + str[n] + “사용자 lose 입니다.”); }
				else If(str[n].equals(“바위”)){
				System.out.println(“사용자= ” + sw + “, 컴퓨터= ” + str[n] + “사용자 win 입니다.”); }
				else If(str[n].equals(보”)){
				System.out.println(“사용자= ” + sw + “, 컴퓨터= ” + str[n] + “무승부 입니다.”); }			
			}
		}
		s.close(); //밖으로 나오게 되면 입력객체를 닫는다.
	}
}