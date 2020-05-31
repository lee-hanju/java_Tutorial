mport java.util.Scanner;

Public class chap2_2{

      Public static voidmain(String[] args){
		// T0D0Auto-generated method stub
       		Scanner s = newScanner(system.in);  // 입력객체 선언
		System.out.print(“2자리수 정수 정수 입력(10~99)>>”);
		Int n = s.nextInt(); // n에 int형 데이터를 받음
		If((n/10) == (n%10)) { //십의 자리와 일의자리를 나누기와 나머지연산을 통해 연산후 같은지 확인한다.
		System.out.printnln(“10의 자리와 1의 자리가 같습니다.”);//참일때
		}		
		else{ 
		System.out.println(“10의 자리와 1의 자리가 같지 않습니다.”);
		}
		Smclose(); //Scanner 객체를 종료함