<Main class>
import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v1 = new Vector<Integer>();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("강수량 입력 (0 입력시 종료) >> ");
			int num = sc.nextInt();
			if(num == 0)
				break;
			v1.add(num);
			int avr =0;
			for(int i=0; i<v1.size(); i++) {
				System.out.print(v1.get(i)+" ");
				avr += v1.get(i);
			}
			System.out.println();
			avr /= v1.size();
			System.out.println("현재 평균 "+avr);
		}
		
		sc.close();
	}
}